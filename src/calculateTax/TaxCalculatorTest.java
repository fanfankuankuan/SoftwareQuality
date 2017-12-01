package calculateTax;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.*;

public class TaxCalculatorTest {
	private static final double DELTA = 1e-15;
	private TaxCalculator cal;
	
	@Before
	public void setUp() throws Exception {
		   cal = new TaxCalculator();
	 }
	
	@After
	public void tearDown() throws Exception{
		
	}
		
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test  
    public void testAssertNotNull() {  
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Status should be 1 or 2.");
		cal.calculateTax(0, 100);
    }
	
	@Test
	public void testAssertNotNegative() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Status should be 1 or 2.");
		cal.calculateTax(-1, 100);
	}
	@Test
	public void testAssertNotNegative2(){
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Income should not be negative.");
		cal.calculateTax(1, -2);
	}
	public void testAssertNotNegative3() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Status should be 1 or 2.");
		cal.calculateTax(-1, -2);
	}
	@Test
	public void testAssertNotRightInput() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Status should be 1 or 2.");
		cal.calculateTax(3, 0);
	}
	@Test
	public void testCalculateTaxWithValidXis1AndY_1() {
		assertEquals(0, cal.calculateTax(1, 0), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis1AndY_2() {
		assertEquals(0, cal.calculateTax(1, 10), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis1AndY_3() {
		assertEquals(0, cal.calculateTax(1, 5990), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis1AndY_4() {
		assertEquals(0, cal.calculateTax(1, 6000), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis1AndY_5() {
		assertEquals(1, cal.calculateTax(1, 6010), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis1AndY_6() {
		assertEquals(4899, cal.calculateTax(1, 54990), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis1AndY_7() {
		assertEquals(4900, cal.calculateTax(1, 55000), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis1AndY_8() {
		assertEquals(4902, cal.calculateTax(1, 55010), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis1AndY_9() {
		assertEquals(14898, cal.calculateTax(1, 104990), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis1AndY_10() {
		assertEquals(14900, cal.calculateTax(1, 105000), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis1AndY_11() {
		assertEquals(14903, cal.calculateTax(1, 105010), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis1AndY_12() {
		assertEquals(31397, cal.calculateTax(1, 159990), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis1AndY_13() {
		assertEquals(31400, cal.calculateTax(1, 160000), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis1AndY_14() {
		assertEquals(31404, cal.calculateTax(1, 160010), DELTA);
	}
	
	@Test
	public void testCalculateTaxWithValidXis2AndY_1() {
		assertEquals(0, cal.calculateTax(2, 0), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis2AndY_2() {
		assertEquals(0, cal.calculateTax(2, 10), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis2AndY_3() {
		assertEquals(0, cal.calculateTax(2, 9990), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis2AndY_4() {
		assertEquals(0, cal.calculateTax(2, 10000), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis2AndY_5() {
		assertEquals(1, cal.calculateTax(2, 10010), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis2AndY_6() {
		assertEquals(5999, cal.calculateTax(2, 69990), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis2AndY_7() {
		assertEquals(6000, cal.calculateTax(2, 70000), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis2AndY_8() {
		assertEquals(6002, cal.calculateTax(2, 70010), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis2AndY_9() {
		assertEquals(15998, cal.calculateTax(2, 119990), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis2AndY_10() {
		assertEquals(16000, cal.calculateTax(2, 120000), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis2AndY_11() {
		assertEquals(16003, cal.calculateTax(2, 120010), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis2AndY_12() {
		assertEquals(54997, cal.calculateTax(2, 249990), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis2AndY_13() {
		assertEquals(55000, cal.calculateTax(2, 250000), DELTA);
	}
	@Test
	public void testCalculateTaxWithValidXis2AndY_14() {
		assertEquals(55004, cal.calculateTax(2, 250010), DELTA);
	}
}
