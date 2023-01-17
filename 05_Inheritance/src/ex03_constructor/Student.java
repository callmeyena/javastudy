package ex03_constructor;

/*
 	상속 관계의 생성자
 	1. 자식 클래스는 "반드시" 부모 클래스를 "먼저" 생성한다.
 	2. 자식(sub)클래스의 생성자를 호출하면(만들려면) "반드시" 부모 클래스의 생성자가 "먼저" 호출된다.
 	3. 부모 클래스의 생성자가 "디폴트 생성자" 형식이면 자식 클래스에서 부모 클래스의 생성자 호출을 생략할 수 있다.
 	4. 부모 클래스의 생성자를 호출할 때 super()를 사용한다.
 */

public class Student extends Person {
	
	
	
	// 생성자
	public Student() {
		super(); // 생략가능한 부모클래스의 생성자 호출(매개변수가 없는 디폴트 형식의 생성자는 생략 가능) / 디폴트 형식의 생성자가 아닐 때는 생략하면 안된다...아 ㅣㅅ발..진짜 모르겟따...ㅠ어떢하냐
		System.out.println("Student 생성");
	}
	
	
	
	/***********************************************/
	
	// 필드
	private String school; 
	
	// 생성자
	public Student(String name, String school) {
		super(name);
		this.school = school;
	}
	
	
	// 메소드 // 관계 학습하는 용도로 공부하기..
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
}
