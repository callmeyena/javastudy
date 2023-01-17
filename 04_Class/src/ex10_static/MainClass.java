package ex10_static;

public class MainClass {

	public static void main(String[] args) { // main실행시 JVM가 실행해줌
		
		// static 요소는 객체를 이용해서 호출할 수 있으나, 권장하지 않는다.
		 
		MyMath myMath = new MyMath();
		System.out.println(myMath.PI);
		
		MyMath yourMath = new MyMath();
		System.out.println(yourMath.PI);
		
		// static 요소는 클래스를 이용해서 호출하는 것이 바람직하다.
		System.out.println(MyMath.PI);
		System.out.println(MyMath.getCircleArea(1.5));
		System.out.println(MyMath.max(1.1, 2.2, 3.3));
		System.out.println(MyMath.max(1.1, 2.2, 3.3, 4.4));
		System.out.println(MyMath.max(1.1, 2.2, 3.3, 4.4, 5.5));
		
		
		System.out.println(MyMath.min(1.1, 2.2, 3.3));
		System.out.println(MyMath.min(2.2, 3.3, 4.4));
		System.out.println(MyMath.min(3.3, 4.4, 5.5));
		

	}

}
