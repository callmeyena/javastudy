package io_practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class MainClass {
	
	
	// 문제7. System.in은 키보드로부터 바이트 데이터를 입력 받는 InputStream이다.
	// System.in으로부터 문장 1개를 입력 받아서 출력하시오.
	// Scanner 대신 BufferedReader를 사용하시오.
	public static void ex01() {
		
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("문장 입력 >>> ");
			String sentence = br.readLine();
			
			System.out.println("입력 된 문장: "  + sentence);
		} catch (IOException e) {
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
	
	public static void main(String[] args) {
		ex01();
		
		
		
	}

}
