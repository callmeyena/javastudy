package ex02_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {
	
	/*
	 	스트림(stream) : Stream이 되면 클래스가 될 수 있기 때문에 소문자 표기
	 	1. 통로의 개념이다. (그런데 데이터를 곁들인..)
	 	2. 일방통행이다.
	 		1) 입력 스트림: 입력만 받을 수 있다.
	 		2) 출력 스트림: 출력만 할 수 있다.
	*/
	
	/*
	 	Writer
	 	1. 문자 기반의 출력 스트림이다. 대표로 FileWriter => 근데 예외처리 달고다님
	 	2. Writer로 끝나는 이름의 클래스는 모두 문자 기반의 출력 스트림이다.(= 글자를 보내는(출력시키는) 역할)
	 	3. 문자를 내보내는 스트림이다.(파일로 문자를 보낸다, 서버로 문자를 보낸다.. 등등)
	*/

	public static void ex01() {  		// Write는 \n을 넣어줘서 줄바꿈을 직접 해줘야 한다.
		
		// 디렉터리 작업
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		// 파일 작업
		File file = new File(dir, "ex01.txt");
		
		// 출력 스트림 선언
		FileWriter fw = null;
		
		try {
			
		// 출력 스트림 생성
			fw = new FileWriter(file); // fw를 스트림으로 생성함 / FileWriter는 반드시 예외처리가 필요한 코드
		
		// 출력 스트림으로 문자 보내기
			int c = 'I';
			char[] cbuf = {' ', 'a', 'm'};
			String str = " a girl.";
		
			fw.write(c); 	// char타입: 정수, 2바이트임 / int타입: 정수, 4바이트 메모리임 => 따라서 int에 넣는 것은 문제 되는 게 없다. // 반드시 예외처리 필요한 코드
			fw.write(cbuf);
			fw.write(str);
			
			System.out.println("ex01.txt 파일이 생성 되었다.");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {			// fw.close의 예외처리
				if(fw != null) {
					fw.close(); 	// 반드시 예외처리 필요한 코드
				}
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
			
	} //

	public static void ex02() {		// char + String 문자 및 문자열 골라보내기, resources문 배움(close 생략할 수 있는 try문)
		
		/*
		 	try - catch - resources문
		 	1. 사용한 스트림을 자동으로 닫아주는 try문이다. finally문 안해도 됨 햅삐~~
		 	2. 형식:
		 		try (스트림 생성) {
		 			코드
		 		} catch(Exception e) {
		 			e.printstackTrace();
		 		}
		*/
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex02.txt");
		
		try (FileWriter fw = new FileWriter(file)) {
			
			char[] cbuf = {'a', 'b', 'c', 'd', 'e'};
			String str = "abcde"; 	// String도 인덱스가 있었다? 개미친? 전혀 몰랐는데?!
			
			fw.write(cbuf, 0, 2);  	// 인덱스 0부터 2글자만 보내시오.
			fw.write(str, 2, 3);   	// 인덱스 2부터 3글자만 보내시오.
			
		} catch(IOException e) {
			e.printStackTrace();
		}		
		
	}

	public static void ex03() {
		/*
		 	BufferedWriter: 자체 기억장소를 갖춘 Writer
		 	1. 내부 버퍼를 가지고 있는 Writer이다.
		 	2. 속도 향상을 위해서 사용한다.
		 	3. BufferedWriter는 보조 스트림이므로 메인 스트림(FileWriter)과 함께 사용해야 한다.
		*/
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex03.txt");
		
		// 메인 스트림 선언
		FileWriter fw = null;
		
		// 보조 스트림 선언
		BufferedWriter bw = null;
		
		try {
			
			// 메인 스트림 생성
			fw = new FileWriter(file);
			
			// 보조 스트림 생성
			bw = new BufferedWriter(fw);
			
			// 보조 스트림을 사용해서 문자 보내기
			bw.write("Hello Wolrd");
			
			System.out.println("ex03.txt 파일이 생성 되었다.");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 보조 스트림을 사용한 경우엔 보조 스트림만 닫으면 메인 스트림도 함께 닫힌다.
				if(bw != null) {
					bw.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
				
		
	} //
	
	public static void ex04() { 	// ex03을 resources문으로 바꿔보기(근데 이제 BufferedWriter를 곁들인..)
		
		File dir = new File("c:" + File.separator + "storage");
		
		File file = new File(dir, "ex04.txt");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) { 		// 메인스트림과 보조스트림을 한번에 사용하는 최종코드는 요거!
			
			bw.write("진짜 재밌다 코딩천재가 되는 길!");
			
			System.out.println("ex04.txt 파일이 생성 되었다.");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
		
	public static void ex05() {
		
		/*
		 	PrintWriter => 특정 경우엔 사용할 수 없음
		 	1. print(), println() 메소드를 지원하는 Writer이다.
		 	2. 줄바꿈이 자주 필요한 경우에 println() 메소드 사용을 위해서 사용한다.
		*/
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex05.txt");
		
		PrintWriter out = null;
		
		try {
			
			out = new PrintWriter(file);
			
			// 자동 줄바꿈이 사용되는 println 메소드
			out.println("안녕하시렵니까."); // 파일로 연결하는 out
			out.println("반갑습니다.");
			
			System.out.println("ex05.txt 파일이 생성 되었다.");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			out.close(); // close 메소드 내부에서 이미 IOException을 처리 하고 있다.
		}
	}
		
	public static void main(String[] args) {
//		ex01();
//		ex02();
//		ex03();
//		ex04();
		ex05();
	}

}
