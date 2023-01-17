package ex08_this;

public class User {
	
	/*
	 	this
	 	1. 현재 객체의 참조값
	 	2. 클래스의 내부에서만 사용 할 수 있다.
	 	3. 클래스의 구성요소(필드, 메소드)를 호출 할 때 사용할 수 있다.
	 		1) 필드: this.필드
	 		2) 메소드: this.메소드()
	*/
	
	// 필드
	String id; // this.id
	String pw; // tihis.pw
	
	// 생성자
	User(String id, String pw) {
		this.id = id;
		this.pw = pw;
		
	}

	// 메소드
	void printThis() {
		System.out.println(this);
	}
	
	
	
	
	void info() {
		System.out.println("ID: " + id); // this 안붙임. 정해진 몇몇 메소드에만 사용한다.
		System.out.println("PW: " + pw);
	}
}
