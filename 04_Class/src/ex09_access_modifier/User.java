package ex09_access_modifier;

public class User {
	
	/*
	 	접근 제어 지시자(Access Modifier)
	 	1. Private: 클래스 내부에서만 접근할 수 있다.
	 	2. default: 동일한 패키지에서만 접근할 수 있다.
	 	3. protected: 동일한 패키지 또는 상속 관계의 클래스에서만 접근할 수 있다.
	 	4. public: 누구나 접근할 수 있다. => 같은 패키지, 다른 패키지, 다른 프로젝트 누구든 쌉가
	 	
	 	1, 4 번만 공부
	 */
	
	/*  정보은닉(Information Hiding) 
	 	1. 클래스의 내부 정보를 외부에 노출하지 않는 것을 말한다.
	 	2. 클래스의 내부 정보는 "필드"를 의미하므로 "필드 값"을 외부에 공개하지 않는걸 말한다
	 	3. "필드" 는 private 하게 처리한다.
	 	4." 메소드" 는 public 하게 처리한다. "필드"에 접근하기 위해서는 "메소드"를 통해서 접근해야한다 = 우회해서 접근해야됨
	*/
	
	/*
	 	Getter 와 Setter 
	 	1. Getter
	 		1) 필드값을 외부로 반출하는 메소드
	 		2) get + 필드 이름을 가지는데 이를 수정하면 안된다. (예외 boolean)
	 	2. Setter
	 		1) 외부로부터 필드값을 받아오는 메소드
	 		2) set + 필드 이름을 가지는데 이를 수정하면 안된다. (예외 boolean: get에 is가 붙어있음. boolean타입은 is 붙여서 이름 만들어주기)
	 
	 */
	
	
	
	// 필드(는 바꿀 수도 없고 직접 볼 수도 없어야함 / 거의 100%는 다 필드에 private 붙여줘야함)
	// 메소드 // !각각 메소드가 뭘 하는지(각각의 역할) + public, private 메소드 정확하게 알아오자
	private String id; 
	private String pw;
	private boolean isVip;
	
	// Source - Generate getter and setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public boolean isVip() {
		return isVip;
	}
	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}


}
