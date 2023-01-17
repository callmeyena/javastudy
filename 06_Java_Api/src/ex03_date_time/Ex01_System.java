package ex03_date_time;

public class Ex01_System {
	
	public static void ex01() {
		
		/*
		 	타임스탬프(임시파일의 이름으로 정할 때도 많이 사용)
		 	1. 현재 시간을 long 타입의 정수 값으로 가지고 있는 값을 의미한다.
		 	2. 1970년 01월 01일 0시부터 1000분의 1초마다 1씩 증가하고 있는 값이다.
		 */
		
		long timeStamp = System.currentTimeMillis(); // millisecond = 1000분의 1초 ㎳(밀리초)라고 부른다 (ㄹ+한자: 숫자 단위)
		System.out.println(timeStamp);
//		System.out.println(Long.MAX_VALUE);
	}
	
	public static void ex02() {
		// Nano Second 10억분의 1초 : 시간을 두 번 재서 얼마나 걸렸는지 재는 용도 ex) 체육시간 100미터 달리기 수행평가 같은거
		/*
		 	시간 단위
		 	second > ㎳(밀리초) > ㎲(마이크로초) > ㎱(나노초) > ㎰(피코초)		
		 */
		
		// String의 +(플러스)연산과 StringBuilder의 append 메소드 성능 확인하기
		String str = "";
		StringBuilder sb = new StringBuilder();
		
		// 시작시간
		long nanoTime1 = System.nanoTime();
		
		// 작업수행
		for(char ch = 'A'; ch <= 'Z'; ch++) {
//			str += ch;  // 126800ns
			sb.append(ch); // 12600ns
		}
		
		// 종료시간
		long nanoTime2 = System.nanoTime();
		
		// 결과 확인
		System.out.println("작업수행시간: " + (nanoTime2 - nanoTime1) + "ns");
		
		
	}

	public static void main(String[] args) {
//		ex01();
		ex02();

	}

}
