package americano;

public class Espresso {
	
	private CoffeeBean coffeeBean;
	private int water;
	
	public Espresso(CoffeeBean coffeeBean, int water) {
		this.coffeeBean = coffeeBean;
		this.water = water;
	}

	
	
	public CoffeeBean getCoffeeBean() {
		return coffeeBean;
	}

	public void setCoffeeBean(CoffeeBean coffeeBean) {
		this.coffeeBean = coffeeBean;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}
	
	public void info() {
		coffeeBean.info();
		System.out.println("물 ml: " + water + "ml");
	}
	


}
