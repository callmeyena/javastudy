package ex04_method_overloading;

public class Calculator { // 계산기 타입
	
	/*
	 	메소드 오버로딩
	 	1. 같은 이름의 메소드를 여러 개 만들 수 있다. 고로 배열을..만드는.....뭐?
	 	2. 제한조건
	 		1) 메소드 이름이 같아야 한다.
	 		2) 매개변수의 타입이나 개수가 달라야 한다.
	 		3) 주의! 반환타입은 메소드 오버로딩과 연관이 없다.
	 */
	
	double addition(double a, double b) {
		return a + b; // addition을 호출한 곳으로 a + b한 값을 다시 돌려주시오
		// 1.5 + 2.5 => calc로 감
	}
	
	double addition(double[] numbers) { // arr이 여기로 호출되면서 numbers 로 이름이 변경됨
										// 전달하는 배열이름과 받는 배열 이름이 달라도 상관 없음 => 같은 기능의 메소드는 같은 이름을 쓰시오 어차피 받는 매개변수가 다르니께
 		double total = 0.0;
		for(int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
		
	}
	
	
}
