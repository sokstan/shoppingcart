
public class ShoppingApp {

	public static void main(String[] args) {
		
		Product firstProd = new Product(ProductType.Apple,0.60,2);
		Product secondProd = new Product(ProductType.Orange,0.25,2);
		ShoppingCart cart = new ShoppingCart();
		CheckoutImpl checkout = new CheckoutImpl();
		
		cart.addProduct(firstProd);
		cart.addProduct(secondProd);
		
		System.out.println("Your total shopping bill is "+ "£"+checkout.calcFinalBill(cart));

	}

}
