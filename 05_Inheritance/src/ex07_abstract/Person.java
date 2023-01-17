package ex07_abstract;


/*
 	추상 메소드(abstract method)
 	1. 본문이 없는(중괄호가 없는) 메소드이다.
 	2. 중괄호를 없앤뒤, 세미콜론을 붙이고, 메소드(void study ()) 앞에 abstract 키워드를 추가한다.	
 */

/*
 	추상 클래스(abstract class) ex) 사람, 도형
 	1. 추상 메소드를 1개 이상 가진 클래스이다.
 	2. abstract 키워드를 클래스 앞에 추가한다.
 	3. 추상 클래스를 상속받는 클래스(Student)는 "반드시" "모든" "추상메소드"를 오버라이드(Override)해야 한다.
 	4. 추상 클래스는 객체 생성이 불가능 하다.(new Person이 불가능) => 본문이 없는 메소드를 가지고 있기 때문에 => 본문이 없으면 메모리에 저장할 수 없다.
 	
 */

// 현재까지 가장 안전한 코드
public abstract class Person { // 2번
	
	public void eat() {
		System.out.println("Eat");
	}
	
	public void sleep() {
		System.out.println("Sleep");
	}
	
	public abstract void study(); // 이 메소드는 일종의 링크같은 역할. 연결만 해주는 거 / 본문이 없으면 본문(중괄호)을 안만든다 => 본문이 없는 메소드 => 추상메소드(본문이 없다, 형태가 없다) / 1번
		
	// 본문이 없으면 본문(중괄호)을 지워라 -> 본문을 지우고 1) abstract 메소드, abstract 클래스 입력 -> 자식 클래스(Student)에 @Override 해주기
	
	public abstract void school();
}
