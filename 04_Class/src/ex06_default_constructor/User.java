package ex06_default_constructor;

public class User {
	
	// 생성자를 만들지 않으면 "디폴트 생성자"가 사용된다(눈에 보이지 않지만)
	
//	User() { 
//		System.out.println("My first constructor");
//	}
	
	// 필드
	String id;
	String pw;
	
	// 메소드
	void info() {
		System.out.println("ID: " +  id);
		System.out.println("PassWord: " + pw);
		
	}
	

}
