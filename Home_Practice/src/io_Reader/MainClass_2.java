package io_Reader;

import java.io.File;
import java.io.FileReader;

public class MainClass_2 {

	public static void ex01() {
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex01.txt");
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			
		
		
	}
	
	public static void main(String[] args) {
		
		
	}

}
