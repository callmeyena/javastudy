package ex07_abstract;

public class Student extends Person{
	// 오버라이드 메소드: 1) source - Override/Implement methods.. 2) ctrl + space key + enter
	
	@Override
	public void study() {
		System.out.println("Study");		
	}

	@Override
	public void school() {
		System.out.println("Go to school");
	}
	
} //
