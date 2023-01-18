package ex03_singleton;

public class MainClass { // singleton 매우 많이 필요함 개중요함 열공 조낸때려야됨

	public static void main(String[] args) {
		
		// User 객체 가져오기
		User user1 = User.getInstance();
		User user2 = User.getInstance();

		// 같은 User인가?
		System.out.println(user1 == user2);
	}

}
