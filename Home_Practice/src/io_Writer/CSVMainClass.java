package io_Writer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVMainClass {

	public static void main(String[] args) {
		
		Map<String, Object> product1 = new HashMap<String, Object>();
		product1.put("model", "Airpods");
		product1.put("maker", "Apple");
		product1.put("price", 190000);
		
		Map<String, Object> product2 = new HashMap<String, Object>();
		product2.put("model", "Ipad");
		product2.put("maker", "Apple");
		product2.put("price", 600000);
		
		Map<String, Object> product3 = new HashMap<String, Object>();
		product3.put("model", "Macbook");
		product3.put("maker", "Apple");
		product3.put("price", 3000000);
		
		List<Map<String, Object>> products = Arrays.asList(product1, product2, product3);
		
		File dir = new File("C:" + File.separator + "storage_pr");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "product.csv");
		
		try (PrintWriter out = new PrintWriter(file)) {
			
			
			for(int i = 0; i < products.size(); i++) {
				Map<String, Object> product = products.get(i);
				out.println(product.get("model") + "," + product.get("maker") + "," + product.get("price"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
