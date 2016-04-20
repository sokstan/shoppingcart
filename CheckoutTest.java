
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CheckoutTest {
	
	ShoppingCart cart;
	CheckoutImpl bill;
	Product prod1;
	Product prod2;
	

	@Before
	public void setUp() throws Exception {
		cart = new ShoppingCart();
		bill = new CheckoutImpl();
		
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testCalculateBillTwoOfEachProduct() {
		prod1 = new Product (ProductType.Apple, 0.60, 2);
		prod2 = new Product (ProductType.Orange, 0.25, 2);
		cart.addProduct(prod1);
		cart.addProduct(prod2);
		
		Assert.assertEquals(1.70, bill.calcFinalBill(cart),0.001);
		
		
	}
	
	@Test
	public void testCalculateBillThreeApplesOneOrange() {
		prod1 = new Product (ProductType.Apple, 0.60, 3);
		prod2 = new Product (ProductType.Orange, 0.25, 1);
		cart.addProduct(prod1);
		cart.addProduct(prod2);
		
		Assert.assertEquals(2.05, bill.calcFinalBill(cart),0.001);
		
		
	}

	@Test
	public void testCalculateBillZeroApplesAndOranges() {
		prod1 = new Product (ProductType.Apple, 0.60, 0);
		prod2 = new Product (ProductType.Orange, 0.25, 0);
		cart.addProduct(prod1);
		cart.addProduct(prod2);
		
		Assert.assertEquals(0.0, bill.calcFinalBill(cart),0.001);
		
		
	}


}
