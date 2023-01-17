package ex03_parsing;

public class MainClass {

	public static void main(String[] args) {
		
		// 구문 분석(parsing)
		// 문자열을 기본 타입으로 변환 하는 과정을 의미한다
		
		String strScore = "90";
		String strMoney = "10000000000";
		String strEye = "0.7";
		
		// String -> int로 변환
		int score = Integer.parseInt(strScore); // ★★암기★
		System.out.println(score);
		
		// String -> long으로 변환
		long money = Long.parseLong(strMoney); // 클래스가 부르는 메소드
		System.out.println(money);

		// String -> double로 변환
		double eye = Double.parseDouble(strEye);
		System.out.println(eye);
		

	}

}
