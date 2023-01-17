package ex05_ellipsis;

public class Calculator {
	
	/*
	  매개변수 생략(개수를 생략한다는 뜻)
	  1. 전달되는 인수의 개수가 정해지지 않은 경우에 사용한다.
	  2. 말 줄임표(...)를 활용한다.
	  3. 실제로는 배열로 처리 됨(내부적으로)
	 */
	
	double addition(double... numbers) { // 몇개가 넘어오든 numbers라는 배열로 받아서 처리할거임 // (반환타입이 double 인 메소드명 addition(매개변수는 double의 배열타입의 쏘매니 숫자들도 ㅇㅋ)
		double total = 0.0;
		for(int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}
	

}
