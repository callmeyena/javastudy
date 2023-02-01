package practice_06;

import java.util.Scanner;

public class Practice_01 {
	
	// 문제4. 0~9 사이 난수를 100개 생성하시오.
	// 발생한 0~9 사이의 각 난수들이 생성된 횟수(빈도수)를 그래프화 하여 출력하시오.
	// 예시)
	// 0 : #### 4
	// 1 : ############ 12
	// 2 : ############ 12
	// 3 : ##### 5
	// 4 : ######## 8
	// 5 : ########### 11
	// 6 : ############ 12
	// 7 : ################## 18
	// 8 : ####### 7
	// 9 : ########### 11
	public static void ex02() {
		
		
		
	}
	
	
	// 문제6. 4계절이 저장되어 있는 영한 사전(2차원 배열)을 이용하여 문제를 해결하시오.
		// 예시)
		// 봄을 영어로 하면? >>> spring
		// 정답
		// 여름을 영어로 하면? >>> sumer
		// 오답
		// 가을을 영어로 하면? >>> fall
		// 정답
		// 겨울을 영어로 하면? >>> win
		// 오답
	public static void ex01() {
		
		/*
		 	1. 2차원 배열 선언 및 생성
			2. 배열 순회
			3. 스캐너 생성
			4. 입력 변수 선언+생성
			5. 입력 받은 변수와 idx j열의 비교
		 */
		
		Scanner sc = new Scanner(System.in);
		String[][] dictionary = {
				{"봄", "spring"},
				{"여름", "summer"},
				{"가을", "fall"},
				{"겨울", "winter"}
		};
		
		for(int i = 0; i < dictionary.length; i++) {
			System.out.print(dictionary[i][0] + "을 영어로 하면? >>> ");
			String answer = sc.next();
			if(answer.equalsIgnoreCase(dictionary[i][1])) {
				System.out.println("정답");
			} else {
				System.out.println("오답");
			}
		}
		sc.close();
		
	
	}

	public static void main(String[] args) {
		ex01();
//		ex02();
		
		
	}

}
