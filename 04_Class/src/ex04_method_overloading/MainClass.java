package ex04_method_overloading;

public class MainClass {
	
	
	

	public static void main(String[] args) {
		// Calculator 객체 => class 를 가지는 변수를 객체라고 부르기로 함
		
		// Calculator 객체 선언
		Calculator  calc;
		
		// Calculator 객체 생성
		calc = new Calculator();

		// addition(Calculator의 double addition(double a, double b) 메소드 호출하기
		double result = calc.addition(1.5, 2.5); // 다시 calc로 값이 돌아옴 => 그 값을 double 타입 result에 저장
		 System.out.println(result);
		 
		 // addition(double[] numbers) 호출
		 double[] arr = {1.1, 2.2, 3.3};
		 double result2 = calc.addition(arr); // 서로 다른 타입(매개변수의 타입이 다름) 때문에 같은 이름의 오버로딩 가능
		 System.out.println(result2);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

} // 메인메소드의 끝
