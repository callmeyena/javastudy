package ex01_String;

public class Ex02_StringBuffer {

	public static void main(String[] args) {
		
	/*
		 Java.lang.StringBuffer 클래스 / 자바 랭(귀지)패키지에 저장되어 있는 StringBuffer 클래스
		 1. String을 연결하는 클래스이다. => + 대신 쓰는 클래스
		 2. synchronized가 적용되어 멀티스레드(동시에 둘 이상의 자바 프로그램이 돈다고 생각하면 됨) 환경에서 사용이 가능하다.
		 3. 동작이 느리다.
	*/

	// StringBuffer 객체 생성	
	StringBuffer stringBuffer = new StringBuffer();
	
	// 문자열 추가(String의 +(플러스)연산자를 대신함)
	stringBuffer.append("co");
	stringBuffer.append("co");
	stringBuffer.append("nut");
	
	// StringBuffer에 저장된 문자열을 String으로 변환 (마지막 작업)
	String str = stringBuffer.toString(); // append, toString: 공부해야할 두가지 메소드
	System.out.println(str);
	
	
	
	
	
	
	} //

} //
