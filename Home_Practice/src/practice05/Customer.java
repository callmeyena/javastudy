package practice05;

public class Customer {
	
	private int myMoney;
	private int myPoint;
	private Cart myCart;
	
	public Customer(int myMoney, int myPoint) {
		this.myMoney = myMoney;
		this.myPoint = myPoint;
		this.myCart = new Cart(10);
	}

	// getter & setter
	public int getMyMoney() {
		return myMoney;
	}
	
	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}
	
	public int getMyPoint() {
		return myPoint;
	}
	
	public void setMyPoint(int myPoint) {
		this.myPoint = myPoint;
	}
	
	public Cart getMyCart() {
		return myCart;
	}
	
	public void setMyCart(Cart myCart) {
		this.myCart = myCart;
	}
	
	// 메소드(카트에 물건 담기)
	public void addToCart(Product product) {
//		myCart.addToCart
	}
	
	
	

	
} //
