package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {

	SimpleCalculator calc;

	@Before
	public void setup() {
		calc = new SimpleCalculator();
	}
	@Test
	public void testAdd() {
		assertEquals(calc.add(0, 2), 2);
	}

	@Test
	public void testSubtract() {
		assertEquals(calc.subtract(5,3), 2);
	}

	@Test
	public void testMultiply() {
		assertEquals(calc.multiply(2,3), 6);
	}

	@Test
	public void testDivide() {
		assertEquals(calc.divide(9,3), 3);
	}
}
