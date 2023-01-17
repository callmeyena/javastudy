package ex01_variable;

public class MainClass {

	// single comment: 주석(설명)
	
	/*
	 *  multiple comment: 여러줄 주석
	 */
	
	
	/* 키워드 이름 규칙
		1. 프로젝트: 마음대로
		2. 패키지(폴더): 모두 소문자로 작성/ 실무에서는 회사 도메인과 앱 이름으로 작성(com.samsung.galaxy)
		3. 클래스(파일): (맨 첫글자도 대문자임) 단어의 첫 글자만 대문자로 작성하고 나머지는 소문자 Upper Camel Case 방식 ex) HelloWorldKorea
		4. 메소드: (맨 첫글자는 소문자임) 첫 글자만 대문자로 작성하고 나머지는 소문자/ Lower Camel Case 방식 ex) helloWorldKorea/ 클래스를 구성하는 요소들
		5. 변수: (맨 첫글자는 소문자임) 첫 글자만 대문자로 작성하고 나머지는 소문자/ Lower Camel Case 방식 ex) helloWorldKorea
		6. 상수: 모두 대문자로 작성 BUT 가독성 개떨어지기 땜시 단어 사이에 언더바를 만들어줘야함 Snake Case 방식 ex) HELLO_WOLRD
		
		프로젝트 > 패키지 > 클래스 > 메소드 > 변수 = 상수
	 
	*/
	
	/* main 메소드
	 	1. Java가 실행될 때 main 메소드가 실행됨
	 	2. 열려있는 main 메소드가 없으면 최근에 실행에 성공한 main 메소드를 실행함/ 무조건 main 메소드 하나는 열려있어야함
	 */
	
	
	public static void main(String[] args) {
		// 코드는 들여쓰기~!가 잘 되어 있어야 한다ㅋ 알겠니 ㅋ 들여쓰기: tab key 사용
		// 변수 선언하기(어떤 데이터를 저장할 것인가? 어떤 이름을 사용할 것인가?)
		
		// 타입의 구분
		// 1. primitive type 기본형(소문자로 되어있음), 값을 저장하는 타입
		// 2. reference type 참조형(맨 첫 글자가 대문자임 / 모든 클래스는 참조형(reference type)), 값이 저장된 참조값을 저장하는 타입
		
		// 논리 타입-> 이름에 is를 많이 사용하는 편
		
		boolean isGood = true;
		boolean isAlive = false;
		System.out.println(isAlive);
		System.out.println(isGood);
		
		// 문자 타입(Character): 1글자
		char ch1 = 'A';
		char ch2 = '홍';
		char ch3 = '\n'; // 라인피드 당연함 줄 바꿈이라는 뜻임
		char ch4 = '\t'; // tab
		char ch5 = '\''; // 작은 따옴표를 문자로 쓰겠다는 듯임
		char ch6 = '\"'; // 큰 따옴표
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		
		// 정수 타입
		int age = 27; // 21억 4천 7백만 정도 기준
		long money = 10000000000L; 
		System.out.println(age);
		System.out.println(money);
		
		// 정수 구분의 기준
		System.out.println(Integer.MAX_VALUE);
		
		// 실수 타입
		double leftEye = 1.0;
		double rightEye = 0.4;
		System.out.println(leftEye);
		System.out.println(rightEye);
		
		// 문자열 타입(여러 글자를 의미 즉, 글자수의 제한이 없음)
		String name = "박예나"; // Java에서 기본 타입과 같은 사용법을 제공하는 것
		System.out.println(name);
		String country = new String("Korea is ㅈㄴ good"); // 대부분의 참조타입 사용법
		System.out.println(country);
		
		// 상수 선언하기(final 키워드가 필요+ 상수는 무조건 다 대문자로 선언해야함)
		final double PI = 3.141592;
		System.out.println(PI);
		
		

	}

}
