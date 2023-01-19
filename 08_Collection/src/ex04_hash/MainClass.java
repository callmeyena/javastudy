package ex04_hash;

import java.util.HashSet;
import java.util.Set;

public class MainClass {	// 객체를 비교하려면 equals를 사용해야한다. 자동완성에 맡기자!

	public static void main(String[] args) {
		
		User user1 = new User("Yena", "78945");
		User user2 = new User("Yena", "78945"); // 똑같은 사람이라는 걸 모름 => 비교를 못했기 때문에
		
		Set<User> set = new HashSet<User>();
		set.add(user1);
		set.add(user2);
		
		System.out.println(set);
	}

}
