package ex;

public class Car {
	
	private String model;
	private int price;
	
	
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}


	@Override	// 객체의 sysout을 도와주는 toString , arraylist는 toString 만들어져 있음
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}
	
	

}
