package ex02_finally;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		// finally 블록
		// 항상 마지막에 실행되는 블록으로 필요 없다면 생략할 수 있다.
		Scanner sc = null; 				 // 초기화 값 생성(예외처리 되면 sc에 저장할 값이 없음 따라서 아래 close를 실행할 수 없기 때문에 null 초기값 주기
		
		try { 							 // 변수 선언된 위치 확인하는 연습 해보기
			sc = new Scanner(System.in); // 선언과 생성 분리
			System.out.println("나이를 입력하세요 >>> ");
			int age = sc.nextInt();
			System.out.println(age >= 20 ? "주류 구매 가능" : "주류 구매 불가능"); 
//			sc.close(); 				 // 컴퓨터의 자원을 받는 모든 것들은 나중에 자원을 반납을 해줘야한다 => 예외처리가 되면 close문 실행 안됨
		} catch(Exception e) {
			System.out.println("예외 발생");
		} finally {
			sc.close(); 				 // finally 블록은 자원(resource)을 = close() 반납할 때 주로 사용한다.
		}
	} // 메소드 끝

} //
