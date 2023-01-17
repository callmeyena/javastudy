package ex02_loop;

public class Ex01_for {

	/*
		for문
		1. 연속된 숫자를 생성하는 반복문(배열에서 주로 사용)
		2. 형식: for(1. 초기문; 2. 조건문; 4. 증감문) { // 1번 초기문은 한번만 사용되고 2, 3, 4문이 반복되는 것
			3. 실행문
		}	
		
			// 1 ~ 10 연속된 숫자 만들기 연습하기
			// 특정 숫자 연습
	*/
	
	public static void ex01() {
		
		for(int a = 1; a <= 10; a++) {  // ++a도 가능/ 조건문: 실행문을 실행하기 위한 조건
			System.out.println(a); // 10을 만드는 방법은 다양하다
		}	
		
		for(int b = 1; b <= 20; b++) {
			System.out.println(b);
		}

		
		
	} // ex01메소드의 끝
	
	public static void ex02() {
		
		// 횟수: 0부터 시작하는 것 선호
		int count = 5;
		
		for(int a = 0; a < count; a++) {
			
			System.out.println("Hello World");
		}
			
		int count2 = 10;
		for(int b = 0; b < count2; b++) {
			
			System.out.println("43");
		}
	
	} // ex02 메소드의 끝
	
	public static void ex03() { // 연습
		
		// 10 ~ 1 출력
		
		for(int a = 10; a >= 1; a--) {
			
			System.out.println(a);
		}
		
		for(int n = 20; n >= 1; n--) {
			
			System.out.println(n);
		}
		
	} // ex03 메소드의 끝
	
	public static void ex04() { // 연습
		
		// 구구단 2단 연습
		
//		int dan = 8; // 이곳에 원하는 구구단을 넣으면 된다
//		
//		for(int a = 1; a <= 9; a++) {
//			System.out.println(dan + " x " + a + " = " + (dan * a));
//		}
		
		
	} // ex04 메소드의 끝
	
	
	public static void ex05() { // 나 혼자 만든거
		
		// 모금
		int goal = 1500000;
		int money = 1500;
		int total = 0;
		int n = 0;
		
		for(;;) {
			if(total >= goal) {
				break;
			} else {
				total += money;
			}
			System.out.println(++n + "회 모금액: " + money + "원, 현재 모금액: " + total + "원");
		}

	} //
	public static void main(String[] args) {
//		ex01();
//		ex02();
//		ex03();
//		ex04();
		ex05();

	}

}
