package ex02_random;

public class Ex01_Math_random { // 열공
	
	public static void ex01() {
		
		// java.lang.Math 클래스
		double randNumber = Math.random(); // 0.0 <= 난수 < 1.0 / 간단한 100분율 처리 가능
		
		if(randNumber < 0.1) { // 10% 확률
			System.out.println("대박");
		} else {
			System.out.println("꽝");
		}
		
	}
	

	public static void main(String[] args) {
		ex01();
		
		

	}

}
