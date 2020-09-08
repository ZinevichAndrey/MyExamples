package Laboratory_Work;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;

class TimeToFallTests {
	//Testing the time of falling from a certain height.
	@Test
	void testTimeToFallOneMetr() {
		double actual = Laboratory1.timeToFall(1);
		double expected = 0.4516;
		assertEquals(expected, actual, 0.0001, "Equals");
	}

	@Test
	void testTimeToFallMinusOneMetr() {
		double actual = Laboratory1.timeToFall(-1);
		double expected = 0.4516;
		assertEquals(expected, actual, 0.0001, "Equals");
	}

	@Test
	void testTimeToFallZeroMetr() {
		double actual = Laboratory1.timeToFall(0);
		double expected = 0;
		assertEquals(expected, actual, 0.0001, "Equals");
	}

	@Test
	void testTimeToFallMax() {
		double distance = Double.MAX_VALUE;
		double actual = Laboratory1.timeToFall(distance);
		double expected = 6.053942254165036E153;	
		assertEquals(expected, actual, 0.0001, "Must be equal");		
	}
	// Testing the factorial
	@Test
	void testFactorialZero() {
		Laboratory1 laboratory1 = new Laboratory1();
		BigInteger expected = laboratory1.factorial(0);
		BigInteger actual = BigInteger.valueOf(1);
		assertEquals(expected, actual, "Must be equals");	
	}

	@Test
	void testFactorialTwelve() {
		Laboratory1 laboratory1 = new Laboratory1();
		BigInteger expected = laboratory1.factorial(12);
		BigInteger actual = BigInteger.valueOf(479001600);
		assertEquals(actual, expected, "Must be equals");	
	}

	@Test
	void testFactorialMinusOne() throws ArithmeticException {
		try {
			Laboratory1 laboratory1 = new Laboratory1();
			BigInteger expected = laboratory1.factorial(-1);
		}
		catch(ArithmeticException ae) {
			Assert.assertNotEquals("", ae.getMessage());	
		}
	}

	@Test
	void testFactorialException() throws IOException{
		Laboratory1 laboratory1 = new Laboratory1();
		Exception exception = assertThrows(Exception.class, () -> {
			laboratory1.factorial(200); 
			throw null;
		});
		Assert.assertNotNull(exception);
		Assert.assertNull(exception.getMessage());
		assertEquals(exception.getClass(), NullPointerException.class);
	}

	@Test
	void testFactorialNotException() throws IOException{
		Laboratory1 laboratory1 = new Laboratory1();
		Exception exception = assertThrows(Exception.class, () -> {
			laboratory1.factorial(2); 
			throw null;
		});
		Assert.assertNotNull(exception);
		Assert.assertNull(exception.getMessage());
		assertEquals(exception.getClass(), NullPointerException.class);
	}

}
