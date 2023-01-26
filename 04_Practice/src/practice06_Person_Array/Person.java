
package practice06_Person_Array;

public class Person {	// 진짜 많이 만드는 클래스의 대표 일명 'Bean' java 커피의 콩,, 아귀여워ㅎㅎ
	
	// "디폴트 생성자"는 생성자 하나도 안만들었을 때만 쓰고 쓸 수 있는거임
	// 하나라도 생성자를 만들면 디폴트 생성자는 사용되지 않습니다.
	

	// 필드
	private String name;
	private int age;
	
	// 생성자
	public Person() {}  // new Person() 
						// 이름과 나이가 없는 사람이니 나중에 이름과 나이를 바꿔줄 수 있는 메소드가 필요하겠구나 라고 생각해야된다씨앙.. => getter and setter 설정
	public Person(String name, int age) {  // new Person("alice", 20)
		this.name = name;
		this.age = age;
	}

	// 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

