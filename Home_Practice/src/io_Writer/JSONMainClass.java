package io_Writer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;

public class JSONMainClass {

	public static void main(String[] args) {

		Map<String, Object> person1 = new HashMap<String, Object>();
		person1.put("name", "박예나");
		person1.put("age", 28);
		person1.put("contry", "서울");
		
		Map<String, Object> person2 = new HashMap<String, Object>();
		person2.put("name", "진정연");
		person2.put("age", 28);
		person2.put("contry", "캐나다");
		
		Map<String, Object> person3 = new HashMap<String, Object>();
		person3.put("name", "황미애");
		person3.put("age", 16);
		person3.put("contry", "서울");
		
		List<Map<String, Object>> people = Arrays.asList(person1, person2, person3);
		
		JSONArray arr = new JSONArray(people); 
		System.out.println(arr.toString());
		
		
		
		
	}
	
	
	

}
