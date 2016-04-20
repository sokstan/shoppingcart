

public class Product {

	private ProductType productName;
	private double price;
	private int quantity;
	
	
	public Product(ProductType productName, double price, int quantity) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public ProductType getProductName() {
		return productName;
	}
	public void setProductName(ProductType productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
