package ex04_op_number;

public class MainClass {
	
	// ex01 메소드 정의 = 메소드(기능)를 만든다
	public static void ex01() {
		
		int a = 5; // 대입연산자 = : 5를 a에 저장한다는 뜻
		int b = 2;
		
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b; // 몫 
		int mod = a % b; // 나머지
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod); // 복붙 생활화 하기
		
	}
	
	// ex02 메소드 정의(연습)
	public static void ex02() {
		
		int a = 5;
		int b = 2;
		
		double div = (double)a / b;
		System.out.println(div); // 2.5
		
		double c = 4.0;
		double d = 20.0;
		
		int div2 = (int)d / (int)c;  // (int)d는 성공 : 20 / but 자동 타입 변환으로 인해 다시 d가 double로 자동 변환 됨 (c가 double타입 이기 때문에) 
								// 따라서 int 타입의 변수를 내고 싶다면 c와 d 둘 다 int 타입으로 강제 타입 변환 해줘야함 한마디로 .0 : 자동 변환에 의해서 20.0 / 4.0 계산. 자동 타입 변환은 하나의 변수에만 적용해줘도 가능
								// 아니면 double 타입의 변수로 선언 후 double타입으로 계산하는 수 밖에..... 
		
		System.out.println(div2);
	}

	// ex03 메소드 정의(연습)
	public static void ex03() {
		
		int second = 90;
		
		int min = second / 60; // 1
		int sec = second % 60; // 30
		
		System.out.println(min);
		System.out.println(sec);
		
		int second2 = 120;
		
		int a = second2 / 30;
		int b = second2 % 50;
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
	// ex04 메소드 정의
	public static void ex04() {
		
		// 1 증가: ++
		// 1 감소: --
		
		// 전위 연산(pre operator)
		// ++a(증가) 또는 --a(감소)
		// 변수 a의 값 1을 증가(감소) 시킨 뒤에 사용하시오.
		
		int a = 10;
		System.out.println(++a);
		
		// 후위 연산(post operator)
		// b++(증가) 또는 b--(감소)
		// 변수 b의 값을 사용한 뒤에 1 증가(감소) 시키시오.
		
		int b = 10;
		System.out.println(b++);
		System.out.println(b);
	}

	
	public static void ex05() {
		
		// 대입 연산
		// 등호(=)의 오른쪽 값을 왼쪽으로 보내는 연산
		
		int a;
		a = 10;
		System.out.println(a);
		
//		a = 10 | 10 = a; 같지 않음!
		
				
	}

	// ex06 메소드 정의(연습)
	public static void ex06() {

		
		int x = 10;
		int y = 20;
		
		// 교환
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println(x); // 20
		System.out.println(y); // 10
		
		
	}
	
	// ex07 메소드 정의
	public static void ex07() {
		
		int account = 10000;
		
		account += 5000; // account = account + 5000;
		System.out.println(account);
		
		account -= 50000; // account = account - 50000;
		System.out.println(account);
				
	}
	
	// ex08 메소드 정의(연습)
	public static void ex08() {
		
		long account = 123456;
		
//		5% 이자 받으면 얼마임?
		double result;
		result = account * 1.05; //	result = account + account * 0.05;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		ex03();
//		ex08(); // ex08 메소드 호출 = 메소드를 사용하겠다
	}

}
