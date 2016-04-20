
/**
 * @author Shafaqut
 *
 */
public interface Checkout {

	public double calcProdTotals (Product prod);
	public double calcFinalBill (ShoppingCart cart);
	public double applyOffers (Product prod);
	
	
}
