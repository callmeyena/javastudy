package ex02_loop;

public class Ex05_nasted_loop {

	public static void ex01() {
		
		for(int day = 1; day <= 5; day++) {
			for(int hour = 1; hour <= 8; hour++) {
				System.out.println(day + "일차" + hour + "교시 수업");
			}
				}
		
	}
	
	public static void ex02() {
		
		
		int day = 1;
		int hour = 1;
		
		while(day <= 5) {
			System.out.println(day + "일차");
			day++;
			for(hour = 1; hour <= 8; hour++) {
				System.out.println(hour + "교시 수업");
			}
		} // 내가 푼 연습문제
		
		
		int day2 = 1;
		while(day2 <= 5) {
			
			int hour2 = 1;
			while(hour2 <= 8) {
				System.out.println(day2 + "일차" + hour2 + "교시 수업");
						hour2++;
			}
			
			day2++;
		} // 쌤이 푸신 연습문제 해설
	}
	
	public static void ex03() { // 연습
		
		// 전체 구구단 출력하기
		// 2 x 1 = 2 ... 9 x 9 = 81
		
		int dan = 2;
		while(dan < 10) {
			
			int a = 1;
			while(a < 10) {
				System.out.println(dan + " x " + a + " = " + (dan * a));
				a++;
			}
		}
			dan++; // 내가 푼 연습 문제 시팔
			
			
			
			
			
//		for(int dan2 = 2; dan2 <= 9; dan2++) {
//			for(int n = 1; n <= 9; n++) {
//				System.out.println(dan2 + " x " + n + " = " + (dan2 * n));
				
				
//			} // 쌤이 푸신 연습문제
//		}
	}
	
	public static void ex04() {
		
		// 전체 구구단 출력하기
		// 2 x 1= 2, 3 x 1 = 3, 4 x 1 = 4 ... 9 x 1 = 9
		// ...
		// 2 x 9 = 18, 3 x 9 = 27 ... 9 x 9 = 81 
		
		
		for(int a = 1; a <= 9; a++) {
			int dan = 2;
			System.out.println(dan + "x" + a + "=" + (dan * a));
			a++;	
			} // 내가 푼 연습문제 ㅋ 미완성
		
		
//		for(int n = 1; n <= 9; n++) {
//			for(int dan2 = 2; dan2 <= 9; dan2++) {
//				System.out.print(dan2 + " x " + n + " = " + (dan2 * n) + "\t");
//			}
//				System.out.println();	
//		} // 쌤이 푸신 해설

	} // ex04 메소드의 끝
			
	public static void ex05() {
		
		for(int a = 1; a <= 9; a++) {
			for(int dan = 2; dan <= 9; dan++) {
				System.out.println((dan * a));
			}
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
