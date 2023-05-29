import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a=1234;
		int b=8765;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = 9999;
		assertEquals(expected,actual);
	}
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(actual ,expected);
	}
	@Test
	public void testMultiple() {
		int a = 5;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		int expected = 50;
		assertEquals(actual,expected);
	}
	@Test
	public void testDivide() {
		int a = 4;
		int b= 2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		int expected = 2;
		assertEquals(actual,expected);
		
	}
	@Test
	public void testExpo() {
		int a = 2;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.expo(a, b);
		int expected = 8;
		assertEquals(actual,expected);
	}

}
