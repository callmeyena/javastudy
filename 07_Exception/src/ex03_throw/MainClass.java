package ex03_throw;

import java.util.Scanner;

public class MainClass {
	
	public static void ex01() {
		
		try {
			
			Integer.parseInt("강쥐 키우고싶어");
			int a = 4 / 0;
			System.out.println(a);
		} catch(Exception e) {
			
			System.out.println(e.getClass().getName()); // 예외된 클래스 이름 확인
			System.out.println(e.getMessage()); // 예외 메시지 확인 => 예외가 왜 발생했는지 간략하게 이유를 설명 해줌
		}
		
	}

	public static void ex02() {
		
		try {
			Integer.parseInt("냥이도 키우고파");
		} catch(Exception e) { // catch 블록은 작업 해줘야함. 비우기 금지
			
			 e.printStackTrace(); // 예외를 추적하는 메소드(개발 중에는 이것만 사용함)
			 					  //Stack: 예외 발생 내역을 저장하는 저장소
			
		}
	}

	public static void ex03() { // 지금까지는 자바가 판단한 예외였고, 사람이 판단해야하는 예외들
		
		/*
		 	throw: 던지다
		 	1. 예외 객체를 생성해서 직접 던질 수 있다.
		 	2. 개발자가 직접 예외를 처리할 때 사용한다.
		 */
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			System.out.println("나이를 입력하세요. >>> ");
			int age = sc.nextInt();
			if(age < 0 || age > 100) {
				throw new RuntimeException(age + "살은 불가능 합니다."); // catch로 던진다(= to catch) RuntimeException 사용하자
				
			}
			System.out.println(age >= 20 ? "주류 구매 가능" : "주류 구매 불가능"); 
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
		
	} // 
	 
	public static void main(String[] args) {
//		ex01();
//		ex02();
		ex03();

	}

}
