package ex04_override;

public class Americano extends Espresso {

	
	/*
	 	메소드 오버라이드(Method Override)
	 	1. 부모 클래스의 메소드와 "동일한 메소드 형식"으로 자식 클래스가 새로운 메소드를 만드는 것이다. => 부모가 만든 메소드를 자식이 다시 만든다(수정해서 사용하는 느낌)
	 	2. 부모 클래스의 메소드를 사용할 수 없기 때문에(다른 부분이 있으니까 ex) 에스프레소는 쓰고 아메리카노는 덜쓰다 라고 표현해야되니까? 형식만 같고 수정을 해서 사용할 수 있다), 
	 	//	새로운 메소드를 다시 만드는 것이다.
	 	3. 자식 클래스가 메소드를 다시 만들 때는 나 다시 만든(override) 메소드야 라고 티내야됨 => 애너테이션(Annotation) 중 @Override를 추가 한다. 
	 */
	
	@Override
	public void taste() {
		System.out.println("Americano tastes less bitter than Espresso");
	}
	
	@Override
	public void color() {
		System.out.println("Americano looks like dark brown ");
	}

	
	
}
