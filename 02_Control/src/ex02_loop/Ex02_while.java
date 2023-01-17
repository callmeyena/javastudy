package ex02_loop;

public class Ex02_while {
	
	/*
		while 문
		1. 연속된 숫자를 만드는 for문과는 달리 (초기문, 증감문 없음) 특정 조건을 만족하면 반복하는 반복문 (어떤 데이터를 가져오는 경우(file, DB의 내용을 읽어주겠다할 때 )에 주로 사용하는 반복문
		2. 형식: while(조건문) {
			실행문
			}
	 */
	
	public static void ex01() {
		
		// 1 ~ 10 / 특별한 이유 없을 때는 for문 사용하기! 보여주기 위함임
		int a = 1;
		while(a <= 10) {
			System.out.println(a);
			a++;
	}
		
		
	} // ex01 메소드의 끝
	
	public static void ex02() { // 내가 가진 돈은 150,000원이고 1800원씩 출금하려고 하는데 몇번째까지 출금 할 수 있으며, 마지막 출금을 했을때 남은 돈은 얼마인가?
		
//		int account = 85000;
//		int money = 550;
//		int n = 0; // 출금횟수
		
//		while(account >= money) { // 출금의 조건이 내가가진 계좌의 돈이 출금해야할 돈보다 많아야 한다 {
//			System.out.print(++n + "번째 출금 결과 : ");
//			account -= money;
//			System.out.println("계좌 : " + account + "원");
//		}
		
		int account2 = 150000;
		int money2 = 1800;
		int f = 0;
		
		while(account2 >= money2) {
			
			System.out.println(f++ + "번째 출금 결과: ");
			account2 -= money2;
			System.out.println();
		}
		
		
			
		
	} // ex02 메소드의 끝

	public static void main(String[] args) {
		
//		ex01();
		ex02();

	}

}
