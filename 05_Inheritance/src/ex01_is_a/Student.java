package ex01_is_a;

/*
 	is a 관계
 	1. 상속 관계로 만들 수 있는 관계이다.
 	2. Student is a Person (Person의 기능을 가지고 있는 Student => 확장된 클래스를 가짐)
 	3. 자식 is a 부모다.
 */

/*
 	부모 클래스
 	1. 슈퍼(super) 클래스라고 한다.
 	2. 자식 클래스에게 기능을 제공하는 입장
 
 */

public class Student extends Person { 
	
	public void study() {
		System.out.println("공부한다.");
	}

}
