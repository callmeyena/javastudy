package ex06_default_constructor;

public class MainClass {
	
		/* 
	 	생성자(Constructor)
		1. 객체를 생성할 때 사용되는 메소드
		2. new 키워드 이후에 호출된다
		3. 특징: 
			1) 생성자의 이름은 Class의 이름과 같다
			2) 일반적인 메소드 구성요소(반환타입, 이름, 매개변수)를 가지고 있는 메소드와 달리 생성자 메소드는 반환타입이 존재하지 않는다. void는 반환타입이 없다는 뜻임
			3) 매개 변수는 일반 메소드와 동일하게 사용한다.
		*/
	
		/*
		 디폴트 생성자(Default_Constructor)
		 1. 개발자가 생성자를 만들지 않으면 자동으로 사용되는 생성자이다.
		 2. 매개변수가 없고, 본문이 비어 있는 형태이다. => 아무 일도 안한다 => 하지만 객체를 만들려면 생성자를 생성해야함
		 */

	public static void main(String[] args) {
		
		// User 객체 생성(생성자가 자동으로 호출되는 지점)
		User user = new User();
		
		// info 메소드 호출
		user.info();
		

	}

}
