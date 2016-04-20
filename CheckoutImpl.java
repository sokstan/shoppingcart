
public class CheckoutImpl implements Checkout {

	public double calcProdTotals(Product prod) {
		double prodCost=0.0;
		prodCost= prod.getQuantity()*prod.getPrice();
		return prodCost;
	}
	
	public double calcFinalBill(ShoppingCart cart) {
		double total=0.0;
        for(Product product : cart.getProducts()){
            total = total + calcProdTotals(product);
        }
		
		return total;
	}

	
	
}
