package ex02_Runnable;

public class MainClass {

	public static void main(String[] args) {
		
		// Runnable 객체 new Soldier()를 Thread 객체를 생성할 때 전달해준다.
		
		Thread sol1 = new Thread(new Soldier("김상사", new Gun(3))); // new Soldier가 Runnable 객체
		Thread sol2 = new Thread(new Soldier("박중사", new Gun(4)));
		
		sol1.start();	// run메소드 이지만 호출은 start로 불러주기
		sol2.start();
	}

}
