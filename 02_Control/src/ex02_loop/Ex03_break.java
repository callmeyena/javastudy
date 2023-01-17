package ex02_loop;

public class Ex03_break {
	
	/*
	  break문
	  1. switch문 종료 시킬 수 있음
	  2. 반복문(for, while) 종료 시킬 수 있음
	 */
	
	public static void ex01() {
		
	/*
	 무한루프
	 1. 끝나지 않는 반복문
	 2. 형식: 1) for(;;) 2) while(true) : 가장 흔하게 볼 수 있는 무한루프 형식
	 */
		
		// 1 ~ 10
		
		int a = 1;
		while(true) {
			
			if(a > 10) {
				break;
			}
			
			System.out.println(a);
			a++;
		}
	}
	
	public static void ex02() {
		
		// 모금
		
		int goal = 100000;
		int money = 60;
		int total = 0;
		int n = 0;
		
		while(true) {
			
			// 1회 모금액 60원 현재 60원 
			// 2회 모금액 60원 현재 120원
			// ?회 모금액 60원 현재 100000원 초과시 stop
			if(total >= goal) {
				break;
			}
			
			total += money;
			System.out.println(++n + "회 모금액" + money + "원 현재 모금액 " + total + "원");
			
			
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		ex02(); 
		// 이번 예제들은 for문에 적합하기 때문에 집에서 이 예제를 통해 for문으로 만들어보기

	}

}
