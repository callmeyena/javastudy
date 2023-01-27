package bakery;

public class MainClass {

	public static void main(String[] args) {
		
		Customer custmoer = new Custmoer(10000);
		
		Bakery tourLesJours = new Bakery(10, 1000, 10000);
		Bakery parisBaguette = new Bakery(10, 500, 20000);
		
		
		customer.info();
		tourLesJours.info();
		parisBaguette.info();
	}

}
