


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Shafaqut
 *
 */
public class ShoppingCartTest {

	ShoppingCart cart; 
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		cart = new ShoppingCart();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link ShoppingCart#addProduct(Product)}.
	 */
	@Test
	public void testAddProduct() {
		Product prod1 = new Product (ProductType.Apple, 0.60, 1);
		Product prod2 = new Product (ProductType.Orange, 0.25, 1);
		
		cart.addProduct(prod1);
		cart.addProduct(prod2);
		Assert.assertEquals(2, cart.getProducts().size());
		
	}

	

}
