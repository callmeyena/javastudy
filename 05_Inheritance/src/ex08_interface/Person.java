package ex08_interface;

/*
 	인터페이스(interface) => 거의 추상 클래스의 일부이기 때문에 abstract를 생략해도 무방하다. +public도 지워도 됨(여전히 동작은 public)
 	1. 추상 클래스의 한 형태이다.
 	2. JDK 1.7 이전에는 추상 메소드로만 구성된 추상 클래스를 의미한다.
 	3. JDK 1.8 이후에는 본문이 있는 default 메소드, static 메소드를 추가 할 수 있다.
 	4. 인터페이스는 주로 final 상수, 추상메소드를 가진다.
 	5. 인터페이스의 추상 메소드는 public abstract를 모두 생략 할 수 있다.
 	
 	// 추상이 필요한 대부분은 인터페이스를 쓴다.
 */

public interface Person { // 클래스가 아니라 인터페이스
	
	// default 메소드 = 본문이 있는 메소드
	public default void eat() {
		System.out.println("Eat");
	}
	
	public default void sleep() {
		System.out.println("Sleep");
	}
	
	// 추상(abstract)메소드 = 본문이 없는 메소드 / abstract를 생략했을 뿐이지 여전히 추상 메소드임
	public void study();

}
