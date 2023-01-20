package americano;

public class CoffeeBean {
	
	private String origin;
	
	CoffeeBean(String origin) {
		this.origin = origin;
	}
	
	public void info() {
		System.out.println("원산지: " + origin);
	}

}
