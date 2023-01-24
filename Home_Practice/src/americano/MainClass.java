package americano;

public class MainClass {

	public static void main(String[] args) {
		
		CoffeeBean coffeeBean = new CoffeeBean("브라질");
		
		Espresso espresso1 = new Espresso(coffeeBean, 50);
		Espresso espresso2 = new Espresso(coffeeBean, 50);
		
		Americano americano = new Americano(2, 100);
		americano.addEspresso(espresso1);
		americano.addEspresso(espresso2);
		
		americano.info();
		
		
		
	} // 

} //
