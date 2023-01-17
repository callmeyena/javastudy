package ex01_one_dim;

public class Ex03_advanced_for {  // 배열에서만 사용할 수 있는 배열전용 for문이다 => 향상 for문
	
	public static void ex01() {
		
		int[] scores = {75, 89, 95, 100, 50};
		
		int total = 0;
		int max = 0;
		int min = 100;
		for(int n : scores) {
			total += n;
			if(max < n) {
				max = n;
			}
			if(min > n) {
				min = n;
			}
		}
		
		System.out.println(total);
		System.out.println(max);
		System.out.println(min);
		
	}
	// 어려웠던 문제들 다시 풀기 -> 안보고 풀 수 있는가 부터 체크 and 코드 외우면 좋다

	public static void ex02() {
		
		String[] files = {"hello.txt", "hi.txt", "안녕.txt"};
		
		for(String file : files) {
			System.out.println(file);
		}
		
		String[] files2 = {"sibal.txt", "jonna.txt", "difficult.txt", "what r u talking about?.txt"};
		for(String a : files2) {
			System.out.println(a);
		}
	}
	
	public static void ex03() {
		// 합계(평균), 최소, 최대
		
		int[] scores = {100, 95, 68, 42};
		
		int total = 0;
		int max = 0;
		int min = 100;
		
		for(int a : scores) {
			total += a;
			if(max < a) {
				max = a;
			}
			if(min > a) {
				min = a;
			}
		}
		System.out.println(total);
		System.out.println(max);
		System.out.println(min);
		
		String[] files = {"hi.txt", "wow.txt", "say hi.txt"};
		
		for(String s : files) {
			System.out.println(s);
		}		
		
	}
	
	public static void main(String[] args) {
//		ex02();
		ex03();
//		ex01();

	}

}
