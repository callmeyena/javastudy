package ex02_List;				// 진짜 조낸 중요 지대 중요 무지 중요

import java.util.ArrayList; 	// 제네릭
import java.util.Arrays;
import java.util.List; 			// 인터페이스

public class MainClass {
	
	public static void ex01() { 	// 존나지대개중요 무지 중요 공부 개열심히 ㄱㄱ
		
		// 배열 리스트(Array List) 선언 및 생성
		List<String> list = new ArrayList<String>(); // new ArrayList<String>(); 에서 String은 생략가능 <>은 적어줘야함 => 제약없는 배열 버전 그것이 리스트 ㅋ
		// => List, ArrayList 둘 다 import 입력해주기
		
		// 추가
		list.add("summer"); 		// 인덱스의 지정이 없으면 항상 마지막에 추가됨
		list.add("autumn");
		list.add("frog");
		list.add("winter");
		list.add(0, "spring");		// 인덱스 0에 spring 추가됨
									// add 중요
		// 수정
		list.set(2, "fall");		// 인덱스 [2]의 요소를 fall로 수정함
		
		// 삭제
		// list.remove("frog"); 	// 1. 삭제할 대상을 전달 
		list.remove(3); 			// 2. 삭제할 대상의 인덱스를 전달
		
		
		// 확인
		System.out.println(list);
		
		
	} //

	public static void ex02() {
		
		// ArrayList 초기화
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5); 		// 1,2,3,4,5로 초기화를 하였다
		
		// 리스트 길이 
		System.out.println("리스트 길이: " + list.size());
		
		// 개별 요소 확인
		System.out.println("첫 번째 요소: " + list.get(0)); 			 // 리스트의 첫번째 요소 가져오기
		System.out.println("마지막 요소: " + list.get(list.size() - 1)); // 리스트의 마지막 요소 가져오기
		
		// 리스트 순회
		// 모든 요소의 합계 구하기
		int total = 0;
		for(int i = 0, length = list.size(); i < length; i++) {
			total += list.get(i);
		}
		System.out.println("모든 요소의 합: " + total);
	}
	
	public static void ex03() {
		
		List<User> userList = new ArrayList<User>();
		
		for(int i = 0;  i < 3; i++) {
			User user = new User("user", "58886");
			userList.add(user);
			System.out.println(userList.get(i));
		}
		
		// 아이디만 출력하기
		for(int i = 0, length = userList.size(); i < length; i++) {
			System.out.println(userList.get(i).getId());
		}
	}
	public static void main(String[] args) {
//		ex01();
		ex02();
//		ex03();
		
	} //

}
