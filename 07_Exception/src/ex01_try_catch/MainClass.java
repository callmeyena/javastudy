package ex01_try_catch;

import java.io.FileReader;
import java.util.Scanner;

public class MainClass {
	
	public static void ex01() { // try&catch 안하면 안돌아가는 코드가 존재한다! 그때는 꼭 try&catch 처리 해줘야 함
		
		try {
			
			String[] season = new String[4];
			
			season[0] = "spring";
			season[1] = "summer";
			season[2] = "autumn";
			season[3] = "winter";
			season[4] = "what??";
			
			
			for(String str: season) {
				System.out.println(str.substring(0, 3));
			}
		} catch(Exception e) { // 예외 e라고 처리 // Unchecked Exception의 경우 RuntimeException으로도 처리 가능
							   // Exception은 모든 예외들의 부모이기 때문에 못받는 게 없다
			System.out.println("ArrayIndexOutOfBoundsException 발생");
			
		}
		
	} //

	public static void ex02() { // Unchecked Exception
		
		try {
			
			String input = "1,2,3,,4,5";
			String[] numbers = input.split(",");
			int[] iNumbers = new int[numbers.length];
			
			for(int i = 0; i < numbers.length; i++) {
				iNumbers[i] = Integer.parseInt(numbers[i]);
				System.out.println(iNumbers[i]);
			}
		} catch(NumberFormatException e) { // UnChecked Exception 이므로 RuntimeException 가능 // 모든 예외는 Exception으로 처리 가능
			System.out.println("NumberFormatException 발생");
		}
	
	}

	public static void ex03() {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("덧셈식을 입력하시오 (예: 1+2) >>>>");
			String expr = sc.next();
			String[] item = expr.split("[+|-|*|/|%]");
			int number1 = Integer.parseInt(item[0]);
			int number2 = Integer.parseInt(item[1]);
			System.out.println(number1 + number2);
			sc.close();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("+를 포함해서 입력하세요.");
		} catch(NumberFormatException e) {
			System.out.println("정수 덧셈만 가능합니다.");
		} catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
		} // catch 다중 패치 블록이 가능한데, 마지막 catch블록은 Exception으로 모든 예외를 처리한다.	
	} //

	public static void ex04() {
		
		try {
		FileReader fr = new FileReader("sample.txt"); 
		// 만약 sample.txt가 없으면 어떻게 할 것인지 대비책이 없기 때문에 빨간줄 뜸 => 예외처리(try&catch) 하셈 => 필수적으로 예외처리 해야됨 => Checked Exception
		fr.close(); // 빨간줄(오류) 나타나는 거 없애기 => 말그대로 클로즈
		} catch(Exception e) {
			System.out.println("예외 처리");
		}		
	}
	
	public static void main(String[] args) {
//		ex01();
//		ex02();
//		ex03();
		ex04();

	}

} //
