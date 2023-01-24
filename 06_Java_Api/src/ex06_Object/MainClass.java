package ex06_Object;

public class MainClass {
	
	/*
	 	java.lang.Object 클래스 (java.lang: 가장 기본이 되는 패키지라 import를 하지 않는다.)
	 	1. 모든 클래스의 최상위 슈퍼 클래스이다.
	 	2. 별도의 슈퍼 클래스를 명시 하지 않는 경우 Object 클래스가 슈퍼 클래스이다. / extends 가 따로 써있지 않는 경우엔 Object가 슈퍼(부모) 클래스임
	 	3. 모든 것을 저장할 수 있는 만능 타입이다.
	 	4. Object 타입으로 저장된 객체는 Object 클래스의 메소드만 호출할 수 있으므로 다시 원래 객체 캐스팅해서 사용해야 한다. ★★
	 */	
	
	 /*
	  	Object 메소드의 주요 메소드
	  	1. equals 
	  		1) 동등 비교 할 때 사용하는 메소드
	  		2) 동등 비교하는 객체들의 참조값을 비교함(객체의 내용물(값)을 비교하지 못한다) // 뭔말인지 모르겠으면 외우셈
	  		3) 객체의 값으로 동등 비교를 수행하기 위해서는 equals 메소드를 Override(오버라이드) 해야함 ★★
	  	2. toString // 정보가 잘 왔는지 확인하는 용도로 사용하기 때문에 잘 쓸 수 있어야함
	  		1) 문자열로 변환할 때 사용하는 메소드
	  		2) "객체이름" + @ + 참조값 형식으로 변환함
	  		3) 원하는 형식으로 변경하려면 toString 메소드를 "오버라이드" 해야 함 ★★
	 */

	public static void ex01 () {
		
		Object person = new Person();		// Object 클래스는 모든 객체를 저장할 수 있다.
		
		person.equals(person);
		
		if(person instanceof Person) {
			((Person) person).eat();		// Object 객체는 사용하기 위해서 항상 원래 타입으로 캐스팅 해줘야 한다.
			((Person) person).sleep();
		}
		
	} // 
	
	public static void ex02() {
		
		// name이 같으면 같은 person으로 처리하기로 한 시스템이다.
		
		Person person1 = new Person("차은우");
		Person person2 = new Person("차은우");
		
		if(person1.equals(person2)) { // Object 클래스의 equals는 참조값을 비교한다(서로 다른 두 객체(메모리 두 개)이기 때문에 다른 것) / 문자열을 비교하는게 아님
			System.out.println("같은 person이다.");
		} else {
			System.out.println("다른 person이다 ");
		}
		
		
		
	}
	
	public static void ex03() {
		
		Person person = new Person("박보검");
		
		System.out.println(person.toString());	// .toString 메소드는 호출을 생략함 => 생략해도 똑같이 입력 됨	
		System.out.println(person); 			// hash code: 참조값
	}
	
	public static void main(String[] args) {
		ex03();
//		ex02();
	}

}
