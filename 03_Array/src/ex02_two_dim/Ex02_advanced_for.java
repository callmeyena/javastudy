package ex02_two_dim;

public class Ex02_advanced_for {

	public static void ex01() {
		
		int[][] scores = {
				{70, 80, 90},
				{80, 90, 100},
				{50, 60, 70,}
				
		};
		
		for(int[] arr : scores) { // 2차원 배열에서 1차원 배열을 꺼내서 담는다
			for(int score : arr) { // 그 1차원 배열을 변수에 꺼내서 담는다
				System.out.print(score + "\t");
			}
			System.out.println();
		}
		
	} // ex01 메소드의 끝
	
	public static void ex02() {
		
		String[][] timeTable = {
				{"국어", "윤리", "수학", "체육"},
				{"미술", "수학", "영어"},
				{"사회", "한자", "수학", "국어", "영어"},
				{"음악", "국어", "윤리"},
				{"수학", "영어", "체육", "과학"}
		};
		
		for(String[] day : timeTable) {
			for(String b : day) 	  {
				System.out.print(b + "\t");
			}
			System.out.println();
		}
	}
	
	// --- 내일 평가 문제	
	public static void ex03() {
		
		// 문제3. 구구단을 모두 출력하지 말고 5 x 5 = 25까지만 출력하시오.
		// 예시
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ...
		// 5 x 5 = 25
		
		for(int dan = 2; dan <= 5; dan++) {
			for(int a = 1; a <= 9; a++) { 
				System.out.println(dan + " x " + a + " = " + (dan * a));				
				if(dan == 5 && a == 5) {
					break;
				}
			}
		
		}
	}
		
	
	public static void ex04() {
		
		// 문제5. 1부터 100 사이의 모든 짝수와 홀수를 각각 더한 결과를 모두 출력하시오.
		// 예시
		// 짝수 합은 2550입니다.
		// 홀수 합은 2500입니다.
		
//		int odd = 0;
//		int even = 0;
		
		int odd = 0;
		for(int a = 1; a <= 100; a++) {
			if(a % 2 == 0) {
			odd += a;
		}
	}
		System.out.println(odd);
		
		int even = 0;
		for(int b = 1; b <= 100; b++) {
			if(b % 2 == 1) {
					even += b;
		 }
	}	
		System.out.println(even);
		
	}
		
		

	
	public static void ex05() {
		
		// 문제1. int serial의 첫 번째 글자가 1,3,5이면 "남자", 2,4,6이면 "여자"를 출력하시오.
		// int serial의 첫 번째 글자는 항상 1 ~ 6 사이의 정수라고 가정한다.
		// 예시
		// 남자입니다.
		
		int a = 1;
		
		if(a % 2 == 0) {
			System.out.println("여자입니다.");
		}
		else if(a % 2 != 0) {
			System.out.println("남자입니다.");
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
