package ex02_random;

import java.util.Random;

public class Ex02__random {
	
	/*
	 	import // 얘만 공부하자
	 	1. 어떤 패키지에 속한 클래스인지 명시하는 코드이다.
	 	2. java.util.Random 클래스의 경우 import java.util.Random; 방식으로 사용된다. [ import (정확한 클래스 이름); ]
	 	3. import java.util.*; 방식으로 java.util 패키지의 모든 클래스를 import 할 수 있다.
	 	4. import를 생략할 수 있는 경우
	 		1) java.lang 패키지의 클래스 / java. lang => 가장 기본이라고 부르는 패키지
	 		2) 동일한 패키지의 클래스
	 		위의 두 경우가 아니면 무족권 import가 들어가야함.
	 	5. import 방식: 클래스를 입력할 때 "항상" 자동 완성(ctrl + space)을 이용한다.
	 */
	
	/*
	 	java.util.Random / java.lang.String str = "hello"; 이게 정석 / 안쓴답니다.
	 	1. 시드(seed)를 이용해서 난수를 생성한다. => 콩 심은데 콩 나고 팥심은 데 팥 난다
	 	2. 기본적으로 현재 시간을 시드(seed)로 사용한다. ex) 두 사람이 정말 똑같은 시간에 실행을 했다면 발생되는 난수가 똑같다. 근데 말이 안됨
	 	3. 동일한 시드(seed)를 사용하면 동일한 난수가 발생한다.
	*/
	
	public static void ex01() {
		
		Random random = new Random(); // 자동완성으로 입력하기
		
		// 실수 난수
		double randNumber1 = random.nextDouble(); // 0.0 <= 난수 < 1.0
		System.out.println(randNumber1);
		
		// 정수 난수
		int randNumber2 = random.nextInt(); // int 범위 내의 난수가 발생한다
		System.out.println(randNumber2);
		
		int randNumber3= random.nextInt(10); // 바운드 값을 10으로 줌 / 10개(0 ~ 9) 난수 발생
		System.out.println(randNumber3);
	}

	public static void ex02() {
		
	
		
		
	} //
	

	public static void main(String[] args) {
		ex01();	

	}

}
