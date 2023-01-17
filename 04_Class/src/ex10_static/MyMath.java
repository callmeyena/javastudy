package ex10_static;

public class MyMath {
	
	/*
	 	static
	 	1. 정적 요소
	 	2. 객체 생성 이전에 클래스 영역에 만들어지는 요소 
	 		필드는 미리 생성되지 않기 때문에 ??
	 	3. 객체마다 생성되지 않고 클래스 별로 1개씩만 생성(해서 공유가넝) ex) pi 그림참고
	 	4. 클래스를 이용해서 호출하기 때문에 클래스 메소드(or 변수) (참고로 필드는 변수다)
	 	5. static요소는 다른 static요소만을 참조(사용)할 수 있음(non-static 요소는 참조할 수 없음)
	 */
	
	
	//필드
	public static final double PI = 3.141592; // 기울임체 스테틱메소드 특 
	// ctrl + shift x : 소문자 to 대문자 / ctrl + shift y : 대문자 to 소문자
	// 공유하는 메모리?는 public 처리 private ㄴㄴ

	
	
	// 메소드
	public static double getCircleArea(double radius) { // : 반지름 boder: 테두리)
			return PI * radius * radius; 
	}
	
	
	
	public static double max(double...numbers) {
		double max = Double.MIN_VALUE;
		for(int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		return max;
	}
	
	public static double min(double...numbers) {
		double min = Double.MAX_VALUE;
		for(int i = 0; i < numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
			}
		}
		return min;
	}
	
	
	
} // 메소드 끝
