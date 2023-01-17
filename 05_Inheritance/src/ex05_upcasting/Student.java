package ex05_upcasting;

public class Student extends Person {

	@Override
	public void study() {
		System.out.println("Study");
	}
	
	public void allnight() {
		System.out.println("stay all night");
	}
}
