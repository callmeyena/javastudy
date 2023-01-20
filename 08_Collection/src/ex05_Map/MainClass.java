package ex05_Map;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class MainClass { 	// 맵 만드는 법, 맵 순회 코드 읽을 줄 알아야함 아주 많이 사용하는 구조이니 정리 제발 부탁 예나야
	
	public static void ex01() {
		
		/* HashMap 
		 	1. 하나의 데이터(Entry)가 2개의 요소로 구성된다.
		 	2. 용어 정리
		 		1) Entry: 하나의 데이터(key와 value가 묶여 있는 것을 Entry라고 부른다)
		 		2) Key	: Entry의 구성 요소, "식별자 역할"을 수행(배열의 인덱스와 같은 역할)
		 		3) Value: Entry의 구성요소, 실제 데이터(배열에 저장된 데이터와 같은 역할, 실제 저장된 값)
		 	3. 주로 "Key"는 String을 사용한다. "(변수 이름)"
		 	4. 주로 Value는 Object를 사용한다.(변수의 저장된 값)
		 	5. "Key는 중복이 불가능"하고(변수 이름이라고 생각하면 이해가 쉽다), Value는 중복이 가능하다.
		 	
		 	Map은 하나의 객체 / List<Map<String, Object>> 웹툰 여러편 가져오기
		*/
		
		// Person 정보를 HashMap으로 만들기 / 1번
		Map<String, Object> person = new HashMap<String, Object>(); // 뒤쪽 부분은 타입값 생략 가능 // 사용 많이 함
		
		// 추가 / 2번
		// put(Key, Value)
		person.put("name", "홍길동");
		person.put("age", 30);	// 객체 대신 HashMap도 많이 사용 // Entry가 두개! / 위의 1,2번이 대부분으로 사용함. 여기에 열공하자
		
		// 수정
		// put(Key, Value)
		person.put("age", 40); // 기존의 Key와 동일한 Key를 전달하면 해당 Key값의 Value가 수정된다.
		
		// 삭제
		// remove(Key)
//		person.remove("age");
		int age = (int)person.remove("age"); // 삭제된 Value가 반환된다. Value는 Object 타입이므로 캐스팅해야 사용할 수 있다.
		System.out.println("삭제된 나이: " + age); 
		
		// 중복 관리할 때 HashSet, 키워드를 찾아서 특정 그룹에서만 필요로 하는걸 찾겠다. Key관리때문에 Hash를 쓰는거다.
		
		// 확인
		System.out.println(person);	
	}
	
	public static void ex02() {
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Spring", "봄");
		dictionary.put("Summer", "여름");
		dictionary.put("Autumn", "가을");
		dictionary.put("Winter", "겨울");
		
		// Value 가져오기
		// get(Key) 메소드는 Key만 전달하면 Value를 가져올 수 있다.
		String season = dictionary.get("Winter");
	}

	public static void ex03() {
		
		Map<String, String> dictionary = new HashMap<String,String>();
		
		dictionary.put("Spring", "봄");
		dictionary.put("Summer", "여름");
		dictionary.put("Autumn", "가을");
		dictionary.put("Winter", "겨울");
		
		// Map 순회하기
		// 1번 Key만 모두 가져온 뒤, 해당 Key값을 가진 Value 가져오기 / 중복된 데이터를 저장하지 않는 구조 Set
		Set<String> KeySet = dictionary.keySet();
		for(String key : KeySet) {
			System.out.println(key + ":" + dictionary.get(key));
			}
		
		// 2번 Entry를 모두 가져온 뒤, Key와 Value로 분리하기 // 쌤이 이게 더 좋다하심
		for(Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}

	public static void ex04() {
		// 제목(title), 저자(author), 가격(price)으로 구성되는 책(book) : HashMap
		Map<String, Object> book1 = new HashMap<String, Object>();
		book1.put("title", "어린왕자");
		book1.put("author", "생텍쥐베리");
		book1.put("price", 10000);
		
		Map<String, Object> book2 = new HashMap<String, Object>();
		book2.put("title", "난쟁이가 쏘아올린 작은 공");
		book2.put("author", "조세희");
		book2.put("price", 12000);
		
		Map<String, Object> book3 = new HashMap<String, Object>();
		book3.put("title", "모순");
		book3.put("author", "양귀자");
		book3.put("price", 10000);
		
		// 책(book) 3권이 저장된 ArrayList
		List<Map<String, Object>> books = new ArrayList<Map<String,Object>>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		// for문 순회
		// List의 순회
		for(int i = 0, length = books.size(); i < length; i++) {
			// Map의 순회(List에 저장된 요소가 Map이다.) 이것도 이해하고 사용해야함 공부하자
			System.out.println((i + 1) + "번째 책의 정보");
			Map<String, Object> book = books.get(i);  // books.get(i) = books[i]와 같다
			for(Entry<String, Object> entry : book.entrySet()) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
				
			}
		}
	}
	// 배열대신 ArrayList, 객체 대신 Map
	public static void main(String[] args) {
//		ex01();
//		ex03();
		ex04();

	}

}
