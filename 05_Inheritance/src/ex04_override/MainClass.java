package ex04_override;

public class MainClass {

	public static void main(String[] args) {
		
		Espresso coffee1 = new Espresso();
		coffee1.taste();
		coffee1.color();
		
		Americano coffee2 = new Americano();
		coffee2.taste();
		coffee2.color();
		

	}

}
