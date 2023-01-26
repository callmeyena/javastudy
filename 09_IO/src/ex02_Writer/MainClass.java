package ex02_Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
	 	1. 문자 기반의 출력 스트림이다.
	 	2. Writer로 끝나는 이름의 클래스는 모두 문자 기반의 출력 스트림이다.(= 글자를 보내는(출력시키는) 역할)
	 	3. 문자를 내보내는 스트림이다.(파일로 문자를 보낸다, 서버로 문자를 보낸다.. 등등)
	*/

	public static void ex01() {
		
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
		
			fw.write(c); 	// char타입: 정수, 2바이트임 / 4바이트 메모리를 가진 int에 넣는 것은 문제 되는 게 없다. // 반드시 예외처리 필요한 코드
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
	
	public static void main(String[] args) {
		ex01();
	}

}
