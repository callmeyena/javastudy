import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainClass {
	// 문제1. 현재 시간을 이용하여 디렉터리를 생성하시오.
	// 예시)
	// C:\14\31\30
	
	
	public static void ex01() {
		
		LocalTime now = LocalTime.now();
		
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		
		String sep = File.separator;
		File dir = new File("C:" + sep + hour + sep + minute + sep + second);
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
	}
	
	public static void ex02() throws IOException { 				// 예외 처리를 ex02 메소드를 호출한 곳으로 넘긴다.
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "myfile.txt");
//		File file2 = new File("C:\\storage\\myfile.txt");
		
		if(file.exists() == false) {
			file.createNewFile(); 		// 반드시 예외처리가 필요한 코드
		} else {
			file.delete();
		}
	}

	public static void ex03() throws IOException {
		
		File dir = new File("C:" + File.separator + "storage");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "myfile.txt"); 
			if(file.exists() == false) {
				file.createNewFile();	
		}
			// 파일의 정보확인
			System.out.println("파일명: " + file.getName());
			System.out.println("경로명: " + file.getParent()); 	// 파일은 자기가 속한 디렉터리(폴더)를 부모라고 생각....생각? 파일이 생각..?
			System.out.println("경로명: " + file.getPath()); 	// 파일명 + 디렉터리명
			
			System.out.println("디렉터리인가? " + file.isDirectory());
			System.out.println("파일인가? " + file.isFile());
			
			long lastModified = file.lastModified();			// 최종 수정일의 타임 스탬프
			System.out.println("최종 수정일 : " + lastModified);
			
			String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd").format(lastModified);
			System.out.println("최종 수정일: "  + lastModifiedDate);
			
			long size = file.length(); // 파일의 크기가 바이트 단위로 저장
			long kb = (size / 1024) + (size % 1024 != 0 ? 1 : 0);
			System.out.println("파일크기 " + kb + "KB"); // 킬로 바이트 출력(1024 바이트 = 1킬로 바이트)
	}
	
	public static void ex04() {
		
		File dir = new File("C:" + File.separator + "Program Files");
		
		File[] files = dir.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			if(files[i].isHidden() == false) {	// 숨김파일이 아니라면 보여주셈
				System.out.println(files[i].getName());
			}
		}
	}
	
	public static void ex05() {
		
		File dir = new File("C:" + File.separator + "Program Files" + File.separator + "Common Files" + File.separator + "Oracle" + File.separator + "java" + File.separator + "javapath");
		if(dir.exists()) {
			
			File[] list = dir.listFiles();
			
			int fileCount = 0;
			long totalFileSize = 0;
			for(File file : list) {
				if(file.isHidden()) {
					continue;
				}
				String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd  a hh:mm").format(file.lastModified());
				String directory = file.isDirectory() ? "<DIR>" : "";
				String size = "";
				if(file.isFile()) {
					long length = file.length();
					size = new DecimalFormat("#,##0").format(length);
					fileCount++;
					totalFileSize += length;
				}
				String name = file.getName();
				String result = String.format("%s%9s%9s %s\n", lastModifiedDate, directory, size, name);
				System.out.print(result);
			}
			System.out.println(fileCount + "개 파일" + new DecimalFormat("#,##0").format(totalFileSize) + "바이트");

		}
		
	}
	
	public static void ex06() {
		// 문제3. C:\storage 디렉터리를 삭제하시오
		// 파일이 저장된 디렉터리는 지워지지 않으므로 먼저 디렉터리에 저장된 파일을 삭제해야 한다.

		File dir = new File("C:" + File.separator + "storage");
		
		File file = new File(dir, "myfile.txt");
		if(file.exists()) {
			file.delete();
		}
		
		if(dir.exists()) {
			dir.delete();	
		}
		
	}
	
	// 문제 4. 사용자로부터 입력 받은 문자열을 C:\storage\diary.txt 파일로 보내시오.
	// 총 5개 문장을 입력받아서 보내시오.
	public static void ex07() {
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
			Scanner sc = new Scanner(System.in);
			
			String[] sentences = new String[5];
			System.out.println("5문장을 입력하세요 >>> ");
			for(int i = 0; i < sentences.length; i++) {
				sentences[i] = sc.nextLine();
			}
			File file = new File(dir, "diary.txt");
			
			try(PrintWriter out = new PrintWriter(new FileWriter(file))) {
				
				for(int i = 0; i < sentences.length; i++) {
					out.println(sentences[i]);
				}
				
			System.out.println("diary.txt 파일이 생성 되었다.");
			
			} catch(IOException e) {
				e.printStackTrace();
			}
			sc.close();	
		
		
	}

	// 문제 5. 예외가 발생한 경우 예외 메시지와 예외 발생시간을 저장한 C:\storage\log.txt 파일로 보내시오.
	// 예시)
	// 2023-01-26 12:08:30 / by zero	
	public static void ex08() {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫 번째 정수를 입력하세요 >>> ");
			int number1 = sc.nextInt();
			
			System.out.print("두 번째 정수를 입력하세요 >>> ");
			int number2 = sc.nextInt();
			
			int add = number1 + number2;
			int sub = number1 - number2;
			int mul = number1 * number2;
			int div = number1 / number2;
			
			System.out.println(number1 + "+" + number2 + "=" + add);
			System.out.println(number1 + "-" + number2 + "=" + sub);
			System.out.println(number1 + "*" + number2 + "=" + mul);
			System.out.println(number1 + "/" + number2 + "=" + div);
	
			sc.close();
		
		} catch(Exception e) {
			
			// 날짜
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String dateTime = dtf.format(now);
			
			// 예외 클래스 이름
			String className = e.getClass().getName();
			
			// 예외 메시지
			String message = e.getMessage();
			
			// 로그 파일 만들기
			File dir = new File("C:" + File.separator + "storage");
			if(dir.exists() == false) {
				dir.mkdirs();
			}
			
			File file = new File(dir, "log.txt");
			
			// 생성 모드(언제나 새로 만든다.)    new FileWriter(file)
			// 추가 모드(기존 내용에 추가한다.)  new FileWriter(file, true)
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
				
				bw.write(dateTime + " " + className + " " + message + "\n");
				// bw.newLine();  \n을 대신할 수 있는 코드
				
				System.out.println("예외 메시지가 log.txt 파일에 기록되었습니다.");
				
			} catch(IOException e2) {
				e2.printStackTrace();
			}
			
		}
		
	}

	// 문제 6. C:\storage\diary.txt파일을 C:\diary.txt 파일로 이동하시오.
	// 파일을 이동하면 기존의 원본은 삭제하면 된다 그거 처음에 우리가 배웠던거 예나야 이것도 못하면 넌 어제오늘 한게 없다..
	public static void ex09() throws IOException {
		
		File dir = new File("C:" + File.separator + "storage");
	 	if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "diary.txt");
		
		BufferedReader br = null;
		StringBuilder sb = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			String line = null;
			sb =  new StringBuilder();
			while((line = br.readLine()) != null) {
				sb.append(line);
			}
			
			System.out.println(sb.toString());

		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		File dir2 = new File("C:" + File.separator + "storage2");
		if(dir2.exists() == false) {
			dir2.mkdirs();
		}
		
		File file2 = new File(dir2, "diary.txt");
		if(file2.exists() == false) {
			file2.createNewFile();
		}
		
		PrintWriter out = null;
		
		try {
			out = new PrintWriter(file2);
			
			out.println(sb.toString());
			
		} catch(IOException e) {
			e.printStackTrace();
		} 
				
		
		
	
			

		
		
		
	} //
	
	public static void main(String[] args) throws IOException { // main 메소드를 호출하는 곳으로 예외처리를 넘긴다.(개발자가 try-catch 하지 않겠다.)
//		ex01();
//		ex02();
//		ex03();
//		ex04();
//		ex05();
//		ex06();
//		ex05();
//		ex07();
//		ex08();
		ex09();
		
	}

}
