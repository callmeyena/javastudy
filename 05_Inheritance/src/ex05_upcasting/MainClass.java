package ex05_upcasting;


	/*	업캐스팅(upcasting)
	 	1. 자식 클래스 객체를 부모 클래스 타입으로 저장할 수 있다. (자식을 저장할 때 대부분 부모 타입을 쓴다 Student를 만들때 보통 Person 타입으로 만듦)
	 	2. 강제로 캐스팅 하지 않아도 자동을 처리된다.
	 */
	
	/*	업캐스팅의 장점
	 	1. 하나의 클래스로 여러가지 객체를 저장할 수 있다.
	 	2. 부모 타입으로 모든 자식 객체를 저장할 수 있다. 최고의 장점 ㅋ ex) Person[] 타입에 Alba, Student 을 저장 할 수 있다. wow 관리하기 쌉용이
	 	// ex) Person person = new Student(); 자식을 부모 타입에 저장할 수 있다.
	 */
	
	/*
	 	업캐스팅의 단점
	 	1. 부모타입으로 저장 되기 때문에 부모 클래스의 메소드만 호출 할 수 있다.
	 	2. 자식 클래스의 메소드를 호출할 수 있도록, 부모 클래스에도 자식 클래스에서 호출할 메소드를 추가해준다.=> 이게 바로 @OVerride ==> 동적 바인딩
	 */
	// 업캐스팅 장단점 전부 기억해야함 공부 둘 다 하셈

	// 업캐스팅의 해결책: 1. Override 2. downcasting
public class MainClass {
	public static void main(String[] args) {
		
		// 부모 타입  선언
		Person person;
		
		// 자식 객체 생성
		person = new Student();
		person = new Alba();

		// 메소드
		person.eat();
		person.sleep();
		person.drink();
	
		
		person.study();
		person.allnight();
		
		
		person.work();
		person.owe();
		
	/*
	 	Person person;
	 	person = new Student();
	 	person.studey() 의 동작 방식
	 	
	 	1. Person 타입의 person이므로 Person 클래스의 study 메소드를 호출한다.
	 	2. study 메소드를 실행하기 위해서 person 객체를 확인한다.
	 	3. person은 = new Student()이므로 Student 클래스의 study 메소드를 가져온다.
	 	4. 최종적으로 Student 클래스의 study 메소드가 실행되는 것이다.
	 */
		
	

	}

} //
