package ex03_singleton;

public class User { // singleton : 객체를 하나만 만들 수 있다. User를 하나만 만들 수 있다는 뜻

	// static 필드 (미리 User를 하나 만들어 둔다.)
	private static User user = new User();
	
	// private 생성자 (외부에서는 생성자를 호출할 수 없다. = User에서는 생성자를 만들 수 없다.)
	private User() {
		
	}
	
	// static 메소드(static 필드를 사용하기 위해서)
	// user 필드를 외부에서 사용할 수 있도록 반환하는 일종의 Getter를 만드는 것
	public static User getInstance() {
		return user;
	}
	
}
