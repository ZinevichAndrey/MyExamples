package Laboratory_Work;


import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class TimeToFallTests {
	// ������������ ������� ������� � ����������� ������.
	@Test
	void testTimeToFallOneMetr() {
		double x = Laboratory1.timeToFall(1);
		double actual = 0.4516;
		assertEquals(x, actual,0.0001,"Equals");
	}
	@Test
	void testTimeToFallMinusOneMetr() {
		double x = Laboratory1.timeToFall(-1);
		double actual = 0.4516;
		assertEquals(x, actual,0.0001,"Equals");
	}
	@Test
	void testTimeToFallZeroMetr() {
		double x = Laboratory1.timeToFall(0);
		double actual = 0;
		assertEquals(x, actual,0.0001,"Equals");
	}
	
	@Test
	void testTimeToFallMax() {
		double distance = Double.MAX_VALUE;
		double time = Laboratory1.timeToFall(distance);
		double expected = 6.053942254165036E153;	
		assertEquals(time, expected,0.0001,"Must be equal");
		
	}

	// ������������ �����������
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
