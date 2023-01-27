package ex03_Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {	// ex02 달달달 외워벌이기~~~  ex01은 현실적으로 별로 안씀ㅋ 학습용임 ㅋ

	/*
	 	Reader
	 	1. 문자 기반의 입력 스트림이다. 대표로 FileReader => 근데 예외처리 달고다님
	 	2. Reader로 끝나는 이름의 클래스는 모두 문자 기반의 입력 스트림이다.(= 글자를 보내는(출력시키는) 역할)
	 	3. 문자를 읽어 들이는 스트림이다.(파일의 내용을 읽는다, 서버가 보낸 내용을 읽는다.. 등등)
	 */
	
	public static void ex01() {
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex01.txt");
		
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			
//			int c = fr.read();	// I			// 한 글자만 읽어오셈
//			c = fr.read();		// 공백
//			c = fr.read();		// a
			
			int c;				// 1글자를 저장할 변수
			
			StringBuilder sb = new StringBuilder();
			while((c = fr.read()) != -1) {
				sb.append((char)c);
			}
			System.out.println(sb.toString());	// 외워라..... int부터 그냥 달달달 외워라...? 제대로 알자..?
			
	
			
		
		} catch(IOException e) {				// FileNotFoundException => 읽어들일 파일이 없거나 못찾으면 생기는 오류
												// 부모인 IOException로 인해 FileNot어쩌구 오류가 함께 처리 된다.
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	} //
	
	public static void ex02() {		// 배열 단위로 읽어들이기
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex02.txt");
		
		FileReader fr = null;
		
		try {
			
			fr = new FileReader(file);
			
			char[] cbuf = new char[5]; 				// 5글자를 읽어들이는 배열
			int readCount = 0;						// 실제로 읽은 글자의 개수
			StringBuilder sb = new StringBuilder();
			
			while((readCount = fr.read(cbuf)) != -1) {	// readCount: 읽어들인 글자의 개수(내가 몇 글자를 읽었냐....)
				
				sb.append(cbuf, 0, readCount); 			// 인덱스 0부터 readCount개(총 7개) 글자를 sb에 추가하시오
				
				// ex02.txt  읽는 과정   	/ for문에  cbuf.length 대신 readCount를 사용한 이유
				// 루프		readCount 		cbuf		
				// 1    	  5       	a b c d e
				// 2     	  2      	f g c d e
				// 3 		 -1			(반환값 없음)
			
//				for(int i = 0; i < readCount; i++) {	
//					System.out.print(cbuf[i]);
//				}
			}	// while
			
			System.out.println(sb.toString());
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}		
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
//		ex01();
		ex02();
			
	}

}
