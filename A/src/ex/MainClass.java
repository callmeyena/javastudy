package ex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class MainClass {
	
	public static void ex01() { 		// add 메소드 생성 방법 // 데이터 추가 수정 무조건 가능
		
		List<String> list1 = new ArrayList<String>(); // element	1.7 이후로 생성자는 타입 명시를 생략할 수 있다. <>();
		List<Integer> list2 = new ArrayList<Integer>(); // 기본형 사용 불가이기 때문에 Integer
		List<Car> list3 = new ArrayList<Car>();
		
		
		// add 메소드는 마지막 요소로 추가한다. (순서가 있다 => 중구난방이 아님)
		list1.add("봄"); // add 집중 공부 하기 add는 한 번에 하나씩
		list1.add("여름");
		list1.add("가을");
		list1.add("겨울");
		
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		
		
		list3.add(new Car("벤츠", 100));
		list3.add(new Car("BMW", 200));
		
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
	}
	
	public static void ex02() { 		// List 초기화 방법
		
		List<String> list1 = Arrays.asList("봄", "여름", "가을", "겨울");
		List<Integer> list2 = Arrays.asList(10, 20, 30, 40);
		List<Car> list3 = Arrays.asList(
				new Car("벤츠", 100), 
				new Car("BMW", 200)
		);
		
//		list1.add("암튼계절"); // 초기화(asList) 후 데이터 추가 및 수정 불가
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
	}
	
	public static void ex03() {
		
		List<String> list = Arrays.asList("봄", "여름", "가을", "겨울");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		System.out.println(list.size());
		
		
		for(int i = 0, length =  list.size(); i < length; i++) {
			System.out.println(list.get(i));
		}
		
		// 향상 for문
		for(String str : list) {
			System.out.println(str);
		}
		
		List<Car> list3 = Arrays.asList(
				new Car("벤츠", 100), 
				new Car("BMW", 200)
		);
		
		for(int i = 0, length = list3.size(); i < length; i++) {
			System.out.println(list3.get(i));
		}
		
		// 향상 for문
		for(Car car : list3) {
			System.out.println(car);
		}
		
		
	}

	// Map
	public static void ex04() {
		
		Map<Integer, Car> map = new HashMap<Integer, Car>();
		
		// 데이터 추가
		map.put(1, new Car("벤츠", 100));
		map.put(2, new Car("BMW", 200));
		
		// Value 확인
		System.out.println(map.get(1)); // Key가 1인 Value 가져오기
		System.out.println(map.get(2)); // Key가 2인 Value 가져오기
		
	}

	public static void ex05() { 		// Map 순회 // Map안에도 여러개의 데이터가 들어갈 수 있다.
		
		Map<Integer, Car> map = new HashMap<Integer, Car>();
		
		map.put(1, new Car("벤츠", 100));		// Key가 1, Value가 new Car("벤츠", 100)인 Entry가 등록
		map.put(2, new Car("BMW", 200)); 		// Key가 2, Value가 new Car("BMW", 200)인 Entry가 등록
		
		for(Entry<Integer, Car> entry : map.entrySet()) { // 들어있는 Entry의 값을 빼주는 메소드가 entrySet
			System.out.println("Key는 " + entry.getKey() + " 이고, Value는 " + entry.getValue());		
		}	// 이 방법이 제일 많다.
		
		for(Integer key : map.keySet()) { // key 값 만 뺄 수 있다
			System.out.println("Key는 " + key + "이고, Value는 " + map.get(key) + "이다.");
		}
		
	}
	
	// map + list
	public static void ex06() {
		
		
		Map<Integer, Car> home1 = new HashMap<Integer, Car>();
		home1.put(1, new Car("벤츠", 100));
		home1.put(2, new Car("BMW", 200));
		
		Map<Integer, Car> home2 = new HashMap<Integer, Car>();
		home2.put(1, new Car("테슬라", 300));
		home2.put(2, new Car("람보르기니", 400));
	
		
		
		List<Map<Integer, Car>> list = new ArrayList<Map<Integer,Car>>();
		list.add(home1);
		list.add(home2);
		
		Map<Integer, Car> map1 = list.get(0);
//		System.out.println(map1);
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		
		Map<Integer, Car> map2 = list.get(1);
//		System.out.println(map2);
		System.out.println(map2.get(1));
		System.out.println(map2.get(2));
		
		for(Map<Integer, Car> map : list) {
			for(Integer key: map.keySet()) {
				System.out.println(map.get(key));				
			}
		}
	
		
		
		 Map<String, Object> product1 = new HashMap<String, Object>();
		 product1.put("model", "세탁기");
		 product1.put("maker", "삼성");
		 product1.put("price", 100);	// value가 저장하려는 데이터! value가 중요한 것....
		 
		 Map<String, Object> product2 = new HashMap<String, Object>();
		 product2.put("model", "냉장고");
		 product2.put("maker", "LG");
		 product2.put("price", 200);
		 
		 Map<String, Object> product3 = new HashMap<String, Object>();
		 product3.put("model", "TV");
		 product3.put("maker", "삼성");
		 product3.put("price", 300);
		
		 List<Map<String, Object>> products = Arrays.asList(product1, product2, product3);
		 
		 for(Map<String, Object> product : products) {
			 System.out.println("모델: " + product.get("model"));
			 System.out.println("제조사: " + product.get("maker"));
			 System.out.println("가격: " + product.get("price"));
		 }
	}
	
	// try & catch
	public static void ex07() {
		
		FileWriter fw = null;
		FileReader fr = null;
		
		try {
			
			fw = new FileWriter("sample.txt");
			fr = new FileReader("sample.txt");
			fw.close();
			fr.close();
		} catch(FileNotFoundException e) { // 예외처리는 catch 위에서부터 순서대로 받는다/ 밑으로 갈수록 큰 exception 적는게 좋은듯?
		} catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	public static void ex08() throws FileNotFoundException, IOException {
		
		FileWriter fw = new FileWriter("sample.txt"); // IOException 해결
		FileReader fr = new FileReader("sample.txt"); // FileNotFoundException 해결
		
		
		fr.close();
		fw.close();		
		
		BufferedReader br = null;
		if(br == null) {
			throw new RuntimeException();	// unchecked Exception => 꼭 문법적인 체크는 하지 않는다는 것
		}
	}
	
	public static void ex09() {
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter("sample.txt");
			fw.write(1);
//			fw.close(); // 예외가 발생하게 되면 fw를 close하지 못하게 됨 그래서 무조건적으로 실행하는 finally로 보내는 것
			
		}  catch(Exception e) {
			
			System.out.println(e.getMessage()); // by Zero
			
		} finally {		// 예외 발생 여부와 상관 없이 언제나 무조건 실행 되기 때문에(오류가 있든, 없든 실행 됨)
			
			try {
				
				fw.close();
			
		} catch(IOException e) {
			e.printStackTrace(); // fw.close의 exception
		}
	}
	
	}
	
	public static void main(String[] args) {
		
//		ex01();
//		ex02();
//		ex03();
//		ex04();
//		ex05();
		ex06();
		
		/*
		try {
			ex08();
		} catch(FileNotFoundException e) {
			System.out.println("sample.txt 파일이 없음");
		} catch(IOException e) {
			System.out.println("sample.txt 파일을 생성할 수 없음");
		} catch(RuntimeException e) {
			System.out.println("RuntimeException 발생"); // 각자 다른 Exception 처리를 구분하기 위해서 표기(?)
		}
		 */
	} 

}
