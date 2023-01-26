import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

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
	
	
	public static void main(String[] args) throws IOException { // main 메소드를 호출하는 곳으로 예외처리를 넘긴다.(개발자가 try-catch 하지 않겠다.)
//		ex01();
//		ex02();
//		ex03();
//		ex04();
//		ex05();
//		ex06();
		ex05();
		
	}

}
