package git;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.math.BigInteger;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestFibanachi {

	@Test
	void testGetFibanachiMinValue() {
		int numberForTest = Integer.MIN_VALUE;
		BigInteger expected = BigInteger.valueOf(0);
		BigInteger actual = Fibanachi.getFibanachi(numberForTest);
		Assert.assertEquals("equals",expected, actual);
	}

	@Test
	void testGetFibanachiMinusOne() {
		int numberForTest = -1;
		int actual = 0;
		BigInteger expected = Fibanachi.getFibanachi(numberForTest);
		Assert.assertEquals("equals",expected, actual);
	}

	@Test
	void testGetFibanachiSuccessful() {
		int[][] numbersForTests = {
				{0, 0},
				{1, 1}, 
				{5, 5}, 
				{12, 144}, 
				{20, 6765}, 
				{30, 832040}
		};
		for(int i = 0; i < numbersForTests.length; i++) {
			int[] temp = numbersForTests[i];
			Assert.assertEquals("array length needs to be two", 2, temp.length);
			int testNumber = temp[0];
			int expectedNumber = temp[1];
			BigInteger actualNumber = Fibanachi.getFibanachi(testNumber);
			Assert.assertEquals("equal numbers", expectedNumber, actualNumber);
		}	
	}

	@Test
	void testGetFibanachiFail() {
		int[][] numbersForTests = {
				{0, 1},
				{1, 13}, 
				{5, 55}, 
				{12, 1424}, 
				{20, 665}, 
				{30, 832840}
		};

		for(int i = 0; i < numbersForTests.length; i++) {
			int[] temp = numbersForTests[i];
			Assert.assertEquals("array length needs to be two", 2, temp.length);
			int testNumber = temp[0];
			int expectedNumber = temp[1];
			BigInteger actualNumber = Fibanachi.getFibanachi(testNumber);
			Assert.assertNotEquals("Not equal numbers", expectedNumber, actualNumber);
		}
	}

	@Test
	void testGetFibanachiHundred() {
		try {
			int numberForTest = 100;
			BigInteger expected = Fibanachi.getFibanachi(numberForTest);
		}
		catch(ArithmeticException ae) {
			Assert.assertNotEquals("", ae.getMessage());
		}
	}

	@Test
	void testGetFibanachiIncorrect() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> {
			int numberForTest = Integer.MAX_VALUE;
			BigInteger expected = Fibanachi.getFibanachi(numberForTest);
		});
		assertEquals(exception.getClass(), ArithmeticException.class);	
	}
	
}
