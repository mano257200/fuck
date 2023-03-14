package hi.hi;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	
	    public static App objCalculator;
		@Before
		public void setUp() throws Exception {
			objCalculator=new App();
		}
		@After
	    public void tearDown() throws Exception{
	    	System.out.println("Closing");
	    }
		@Test
		public void additionTest() {
			assertEquals(23,objCalculator.addition(10,13));
		}
		public void subtractionTest() {
			assertEquals(-1,objCalculator.subtraction(12,13));
		}
		public void multiplicationTest() {
			assertEquals(156,objCalculator.multiplication(12,13));
		}
		public void divisionTest() {
			assertEquals(0,objCalculator.division(12,13));
		}

	}
