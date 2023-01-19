package practice05; // Tip: System. arraycopy

public class Cart {
	
	private Product[] products;
	private int prodCount;
	
	public Cart(int cartSize) {
		products = new Product[cartSize];
	}

	
	// getter & setter
	public Product[] getProducts() {
		return products;
	}
	
	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	public int getProdCount() {
		return prodCount;
	}
	
	public void setProdCount(int prodCount) {
		this.prodCount = prodCount;
	}
	
	
	


} //
