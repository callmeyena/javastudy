package ex01_String;

public class Ex03_StringBuilder { // StringBuffer와 같은 역할을 수행함/ String연결하는 클래스 

	public static void main(String[] args) {
		
	/*
		 Java.lang.StringBuffer 클래스 / 자바 랭(귀지)패키지에 저장되어 있는 StringBuffer 클래스
		 1. String을 연결하는 클래스이다. => + 대신 쓰는 클래스
		 2.싱글스레드 환경에서만 사용이 가능하다.
		 3. 동작이 빠르다.
	*/
	
		// StringBuilder 객체 생성
		StringBuilder sb = new StringBuilder();
		
		// 문자열 연결
		sb.append("app");
		sb.append("le");
		
		// StringBuilder를 String으로 변환
		String str = sb.toString();
		System.out.println(str);

	}

}
