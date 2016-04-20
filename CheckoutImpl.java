
public class CheckoutImpl implements Checkout {

	public double calcProdTotals(Product prod) {
		double prodCost=0.0;
		//prodCost= prod.getQuantity()*prod.getPrice();
		prodCost= applyOffers(prod);
		return prodCost;
	}
	
	public double calcFinalBill(ShoppingCart cart) {
		double total=0.0;
        for(Product product : cart.getProducts()){
            total = total + calcProdTotals(product);
        }
		
		return total;
	}

	@Override
	public double applyOffers(Product prod) {
		
		int tempQuantity=0;
		double prodCost=0.0;
		
		switch (prod.getProductName()) {
        case Apple:
        	// BOGOFF adjust prices 
            if (prod.getQuantity() > 1) {
            	tempQuantity = prod.getQuantity()-(prod.getQuantity()/2);
            } else {
            	tempQuantity = prod.getQuantity();
            }
            prodCost = tempQuantity * prod.getPrice();
            break;

        case Orange:
            // 3 for 2 adjust prices
            if (prod.getQuantity() > 2) {
            	tempQuantity = prod.getQuantity()-(prod.getQuantity()/3);
            } else {
            	tempQuantity = prod.getQuantity();
            }
            prodCost = tempQuantity * prod.getPrice();
            break;

        default:           
            break;
    }
		return prodCost;
	}
	
}
