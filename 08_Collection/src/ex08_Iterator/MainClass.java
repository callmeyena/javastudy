package ex08_Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass {
	
	/*
	 	Iterator 인터페이스 // 컬렉션이다: List, Set
	 	1. 특정 Collection(컬렉션)을 순회할 때 사용한다.
	 	2. 주요 메소드
	 		1) hasNext(): 남아있는 요소가 있으면 true를 반환 아니면 false반환
	 		주머니의 구슬을 담아놓고 하나씩 꺼낸다는 느낌.. => 주머니에 구슬이 있다 없다를 찾는...ㅎㅎ..ㅠ흑 => 남아있는게 있는지 없는지만 검사
	 		2) next(): 요소를 하나 꺼내는 것
	 */

	public static void ex01() { // List만드는 방법, 순회(?), Iterator 사용법
		
		List<String> list = new ArrayList<String>();
		
		list.add("동그랑땡");
		list.add("동태전");
		list.add("굴전");
		
		Iterator<String> itr = list.iterator(); // 리스트를 순회할 수 있는 반복자: Iterator / 리스트의 타입을 따라가야한다
		
		while(itr.hasNext()) { // for문이 대체되었다
			String food = itr.next();
			System.out.println(food);
		}
 	}
	
	public static void ex02() { // Set만드는 방법, 순회(?), Iterator 사용법
		
		Set<Integer> set = new HashSet<Integer>(); // List와 같은 소속 => 사용법이 거의 같다
		set.add(67);
		set.add(4);
		set.add(170);
		
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			Integer number = itr.next();
			System.out.println(number);
		}
	}
	public static void ex03() {
		
		Map<String, Object> map = new HashMap<String, Object>(); // 컬렉션은 List, Set만 있는거다~~~!!!!!! 그렇기 때문에 사용법 달라유
		
		map.put("name", "박예나");
		map.put("age", 28);
		map.put("isAlive", true); // .get() =>Key값을 전달해주는 방식이다
		
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> itr = keySet.iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			Object value = map.get(key);
			System.out.println(key + ":" + value); // key와 value를 둘 다 확인하는 방식
		} // 이로써 맵도 순회할 수 있다 => Key도 뺄 수 있고 Value도 뺄 수 있다.		
		
	}
	
	public static void ex04() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("가장 좋아하는 음식", "차돌박이");
		map.put("Mbti", "Enfp");
		map.put("가장 좋아하는 숫자", 17);
		
	}
	
	public static void main(String[] args) {
//		ex01();
//		ex02();
		ex03();
	}

}
