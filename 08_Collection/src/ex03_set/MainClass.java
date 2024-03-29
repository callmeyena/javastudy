package ex03_set; 

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainClass {		// 집합의 개념이 필요할 때 참고하셈
	
	/*
	 	Set 
	 	1. 저장된 요소들의 인덱스가 없다. => 저장 순서가 없다.(순서라는 개념 자체가 없음)
	 	2. 중복 저장이 되지 않는다.(동일한 데이터를 저장하지 않음) => 중복없는거 관리할 때는 개짱임
	 	그리고 set은 인덱스가 없기 때문에 향상 for문을 사용해줘야 한다.
	*/

	public static void ex01() {
		
		// HashSet 객체 선언 및 생성
		Set<String> set = new HashSet<String>();
		
		// 추가
		set.add("spring");
		set.add("spring");
		set.add("spring");
		set.add("summer");
		set.add("autumn");
		set.add("winter");
		
		// 제거
		set.remove("winter");
		
		// 확인
		System.out.println(set);			
	}
	
	public static void ex02() {
		
		// HashSet 객체의 초기화
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5)); // 리스트를 준다?
		
		// 인덱스가 없기 때문에 향상 for문만 가능
		for(Integer n : set) {
			System.out.println(n);
		}
		
	}
	
	public static void ex03() {
		
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 4, 5, 6, 7));
		
		// 교집합
		set1.retainAll(set2);	// set1의 교집합 결과가 저장된다.
		
		System.out.println(set1);
		System.out.println(set2);
	}
	
	public static void ex04() {
		
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 4, 5, 6, 7));
		
		// 합집합
		set1.addAll(set2);	// set1의 합집합 결과가 저장된다.
		
		System.out.println(set1);
		System.out.println(set2);
	}
	
	public static void ex05() {
		
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 4, 5, 6, 7));
		
		// 차집합
		set1.removeAll(set2);	// set1의 차집합 결과가 저장된다.
		
		System.out.println(set1);
		System.out.println(set2);
	}
	
	public static void ex06() {	// 연습
		
		Set<Integer> lotto = new HashSet<Integer>(Arrays.asList());
		
		// 1 ~ 45: 6개 랜덤으로 발생
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random() * 45) + 1);
		}
		System.out.println(lotto);
	}
	
	public static void main(String[] args) {	
//		ex01();
//		ex02();
//		ex03();
//		ex04();
//		ex05();
		ex06();
	}

}
