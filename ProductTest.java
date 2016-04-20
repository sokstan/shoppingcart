
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
public class ProductTest {
	Product prod;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		prod = new Product (ProductType.Apple, 0.60, 1);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link Product#Product(java.lang.String, double, int)}.
	 */
	
	@Test
	public void testProduct() {
		
		Assert.assertEquals("Apple", prod.getProductName().toString());
		Assert.assertEquals(0.60, prod.getPrice(),0.001);
		Assert.assertEquals(1, prod.getQuantity());
	}



	

}
