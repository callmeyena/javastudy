package io_practice;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class OutputStream {

	public static void main(String[] args) {
	
		File file = new File("C:" + File.separator + "storage", "ex2.bin");
		
		BufferedReader br = null;
		StringBuilder sb = null;
		String line = null;
		
		try {
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			sb = new StringBuilder();
			
			while((line = br.readLine()) != null) { 
				sb.append(line + "\n");
			}
			
			System.out.println(sb.toString());
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}		
		
} 