package ex01_one_dim;

public class Ex01_array {

	/*
	 	배열이란?
	 	1. 여러개의 변수를 하나의 이름으로 관리하는 자료 구조(structure)
	 	2. 배열의 구성 요소
	 		1) 배열명: 모든 변수의 대표 이름
	 		2) 인덱스: 각 변수를 구분하기 위한 위치 정보 / 0부터 시작하는 정수값
	
	 	배열의 사용 방법
	 	1. 배열의 선언
	 		1) int[] arr; => 권장
	 		2) int arr[];
	 	2. 배열의 생성 -> 변수와는 다르게 선언과 생성이 분리 되어있음
	 		arr = new int[5];
	 */
	
	
	/* 
	 	배열요소
	 	1. 배열의 각 변수를 의미
	 	2. 배열명[인덱스]
	 	3. 배열의 생성되면 자동으로 초기화 된다.
	 		정수타입의 배열: 0, 실수타입의 배열: 0.0, boolean타입의 배열: false, 참조 타입의 배열: null 값으로 초기화 된다. (값이 없음을 의미)
	 		* 변수는 값이 있으나 쓰레기 값이라 사용 불가. 값을 줘야지만 사용 가넝 
	 
	 */
	
	public static void ex01() {
		
		int[] arr; // 배열 선언
		
		
		arr = new int[5]; // 배열 생성
		
		System.out.println(arr[0]); 
		System.out.println(arr[1]); 
		System.out.println(arr[2]); 
		System.out.println(arr[3]); 
		System.out.println(arr[4]); 
	}
	
	public static void ex02() {
		
		int[] arr = new int[5]; // 배열 선언 + 생성 / 1번
		
		// 배열 요소 순회(하나씩 접근하기)
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]); // 2번
		} // 두가지 코드가 완벽하게 동일/ 2번 코드법 공부하기
		
		
		
	}
	
	public static void ex03() {
		
		// 배열 길이
		int length = 5;
		
		// 배열 선언 + 생성
		int[] arr = new int[length];
		
		// 배열 순회
		for(int i = 0; i < length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void ex04() {
		
		// 배열 선언 + 생성
		int[] arr = new int[5];
		
		// 배열 순회
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int[] arr2 = new int[5];
		
		for(int n = 0; n < arr2.length; n++) {
			System.out.println(arr2[n]);
		}
	} // 최종 버전(배열 순회의 코드조합)
	
	public static void ex05() { //연습
		
		// 점수를 배열로 관리하기
		int[] scores = new int[5];
		
		// 각 점수를 배열에 저장하기
		scores[0] = 100;
		scores[1] = 70;
		scores[2] = 98;
		scores[3] = 56;
		scores[4] = 10;
		
		// 합계(평균), 최대/최소 값 구하기
		int total = 0; // zero
		int max = 0; // 가장 작은 값
		int min = 100; // 가장 큰 값(가질 수 있는 최대의 정수값으로 minimum값을 초기화 해줘야한다)
		
		for(int i = 0; i < scores.length; i++) {
			total += scores[i];
			if(max < scores[i]) {
				max = scores[i];
			}
			if(min > scores[i]) {
				min = scores[i];
			}
		}
		
		System.out.println("합계: " + total + "점");
		System.out.println("평균: " + (double)total / scores.length + "점");
		System.out.println("최대:" + max + "점");
		System.out.println("최소:" + min + "점");
		
	}
	
	public static void ex06() { // 연습
		
		// 점수를 배열로 관리하기
				int[] scores = new int[5];
				
				// 각 점수를 배열에 저장하기
				scores[0] = 100;
				scores[1] = 70;
				scores[2] = 98;
				scores[3] = 56;
				scores[4] = 10;
				
				
				
				// 합계(평균), 최대/최소 값 구하기
				int total = scores[0]; // 배열의 첫 번째 요소를 초기화로 저장하고, 배열의 두 번째 요소부터 순회한다. wow놀라워라
				int max = scores[0]; 
				int min = scores[0]; 
				
				for(int i = 1; i < scores.length; i++) { // scores[0]을 total값에 이미 초기화 했기 때문에 index 0을 제외한 1부터 반복문 시작
					total += scores[i];
					if(max < scores[i]) {
						max = scores[i];
					}
					if(min > scores[i]) {
						min = scores[i];
					}
				}
				
				System.out.println("합계: " + total + "점");
				System.out.println("평균: " + (double)total / scores.length + "점");
				System.out.println("최대:" + max + "점");
				System.out.println("최소:" + min + "점");
				
	} // ex06 메소드의 끝 // 배열순회 최종버전
	
	public static void ex07() {
		
		// 배열 초기화
		int[] arr = {10, 20, 30};
		
		// 배열 순회
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	
	public static void ex08() { // 연습
		
		String[] weekName = {"토", "일", "월", "화", "수", "목", "금"};
		
		int day = 13;
		
		System.out.println(day + "일은 " + weekName[day % weekName.length] + "요일이다.");
	}
	
	public static void ex09() {
		
		String[] seoson = {"겨울", "봄", "여름", "가을"};
		
		int month = 10;
		
		System.out.println(month + "월은 " + seoson[month % 12 / 3] + "이다.");
		
	}
	
	
	public static void main(String[] args) {
//		ex01();
//		ex02();
//		ex03();
		ex04();
//		ex05();
//		ex06();
//		ex07();
//		ex08();
//		ex09();
		

	}

}
