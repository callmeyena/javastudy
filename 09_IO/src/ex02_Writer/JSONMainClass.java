package ex02_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONMainClass { // 조낸 중요...힝입니다............ㅠ개중요
	
	/*
		 	JSON
		 	1. JavaScript Object Notation
		 	2. 하나의 객체는 {} 로 표기하고, 여러가지 객체가 들어간(?) 배열은 [] 로 표기한다.
		 	3. 프로퍼티(property)와 값(value)으로 데이터를 구성한다.
	 */
	
	/*
		 	JSON-JAVA (JSON in Java) 라이브러리
		 	1. 객체: JSONObject 클래스 (Map 기반으로 제작된 클래스)
		 	2. 배열: JSONArray  클래스 
	 */
	
	public static void ex01() {
		
		// 목표. 아래 JSON 만들기
		/*
		 	{
		 		"model": "세탁기",
		 		"maker": "삼성",
		 		"price": 100
		 	}
		 */
		
		JSONObject product = new JSONObject(); // Object 만드는 법 (=> JSONObject를 여러개 만들면 JSONArray 클래스에 저장하기.)
		
		product.put("model", "세탁기");
		product.put("maker", "삼성");
		product.put("price", 100);
		
		System.out.println(product.toString());	
	}

	public static void ex02() {
		
		// 목표. 아래 JSON 배열 만들기
		/*
		 	[
			 	{
			 		"model": "세탁기",
			 		"maker": "삼성",
			 		"price": 100
			 	},
			 	{
			 		"model": "냉장고",
			 		"maker": "LG",
			 		"price": 200
			 	}
		 	]
		 */
		
		JSONObject product1 = new JSONObject();
		product1.put("model", "세탁기");
		product1.put("maker", "삼성");
		product1.put("price", 100);
		
		JSONObject product2 = new JSONObject();
		product2.put("model", "냉장고");
		product2.put("maker", "LG");
		product2.put("price", 200);
		
		JSONArray products  = new JSONArray();
		products.put(product1);
		products.put(product2);
		
		System.out.println(products.toString());
	}
	
	public static void ex03() {	// JSON 중에서도 중요한 것!!
		
		// String 형식의 JSON 데이터
		String str = "{\"name\":\"james\",\"age\":30,\"height\":180.5,\"isAlive\":true}";		// 안에다 쓰지 말고 밖에서 먼저 써준다음 복붙하기
		
		// JSONObject 객체 생성
		JSONObject obj = new JSONObject(str);
		
		// JSONObject 객체를 구성하는 프로퍼티 값 가져오기
		String name = obj.getString("name");
		int age = obj.getInt("age");
		double height = obj.getDouble("height");
		boolean isAlive = obj.getBoolean("isAlive");
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(isAlive);
		
	}

	public static void ex04() { // JSON 중에서도 중요: 원하는 값 꺼내서 사용하는 것
				
		// String 형식의 JSON 데이터
		String str = "[{\"model\":\"세탁기\",\"maker\":\"삼성\",\"price\":100},{\"model\":\"냉장고\",\"maker\":\"LG\",\"price\":200}]";
		
		// JSONArray 객체 생성
		JSONArray products = new JSONArray(str);
		
		// 1. 일반 for문
		for(int i = 0; i < products.length(); i++) {
			JSONObject obj = products.getJSONObject(i);
			String model = obj.getString("model");
			String maker = obj.getString("maker");
			int price = obj.getInt("price");
			
			System.out.println(model + "," + maker + "," + price);
		}			

		System.out.println();
		
		// 2. 향상 for문
		for(Object obj : products) {					// 향상 for문에서는 JSONObject 타입 사용 불가
			JSONObject product = (JSONObject)obj;		// 가장 최상위 클래스인 Object를 대입후 JSONObject에 다시 casting
			String model = product.getString("model");
			String maker = product.getString("maker");
			int price = product.getInt("price");
			
			System.out.println(model + "," + maker + "," + price);
		}
		
		
	}	//
	
	public static void ex05() {

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
		 
		 JSONArray arr = new JSONArray(products);
		 String content = arr.toString();
		 
		 
		 File dir = new File("C:" + File.separator + "storage");
		 
		 if(dir.exists() == false) {
			 dir.mkdirs();
		 }
		 
		 File file = new File(dir, "product.json");
		 
		 try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			 bw.write(content); 

		 } catch(IOException e) {
			 e.printStackTrace();
		 }
}
		
	public static void main(String[] args) {
//		ex01();
//		ex02();
//		ex03();
//		ex04();
		ex05();
		
	}

}
