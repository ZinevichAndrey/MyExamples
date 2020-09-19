package git;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class TestConvertingNumbers {
	//Binary tests
	@Test
	void decimalToBinarySixteen() {
		int numberForTest = 16;
		String actual = LaboratoryTwo_ConvertingNumbers.decimalToBinary(numberForTest);
		String expected = "10000";
		Assert.assertEquals("equal", expected, actual);	
	}

	@Test
	void decimalToBinaryIncorrect() throws Exception {
		Exception exception = assertThrows(Exception.class, () ->{
			int numberForTest = Integer.MIN_VALUE;
			String throwException = LaboratoryTwo_ConvertingNumbers.decimalToBinary(numberForTest);
		});
		assertEquals(exception.getClass(), ArithmeticException.class);
	}

	@Test
	void decimalToBinaryArrayCorrect() {
		int[][] arrayNumbersForTest = {
				{0, 0},
				{5, 101},
				{32, 100000},
				{864, 1101100000}
		};
		for(int i = 0; i < arrayNumbersForTest.length; i++) {
			int[] temp = arrayNumbersForTest[i];
			Assert.assertEquals("array length needs to be two", 2, temp.length);
			int testNumber = temp[0];
			String expectedNumber = String.valueOf(temp[1]);
			String actualNumber = LaboratoryTwo_ConvertingNumbers.decimalToBinary(testNumber);
			Assert.assertEquals("equal numbers", expectedNumber, actualNumber);
		}
	}

	@Test
	void decimalToBinaryArrayFail() {
		int[][] arrayNumbersForTest = {
				{0, 01},
				{5, 1011},
				{32, 10000},
				{864, 1101000}
		};
		for(int i = 0; i < arrayNumbersForTest.length; i++) {
			int[] temp = arrayNumbersForTest[i];
			Assert.assertEquals("array length needs to be two", 2, temp.length);
			int testNumber = temp[0];
			String expectedNumber = String.valueOf(temp[1]);
			String actualNumber = LaboratoryTwo_ConvertingNumbers.decimalToBinary(testNumber);
			Assert.assertNotEquals("equal numbers", expectedNumber, actualNumber);
		}
	}
	//Octal tests
	@Test
	void decimalToOctalArrayCorrect() {
		int[][] arrayNumberForTest = {
				{0, 0},
				{23, 27},
				{12, 14},
				{865, 1541},
				{3298, 6342}
		};
		for(int i = 0; i < arrayNumberForTest.length; i++) {
			int[] temp = arrayNumberForTest[i];
			Assert.assertEquals("array length needs to be two", 2, temp.length);
			int testNumber = temp[0];
			String expectedNumber = String.valueOf(temp[1]);
			String actualNumber = LaboratoryTwo_ConvertingNumbers.decimalToOctal(testNumber);
			Assert.assertEquals("equal number", expectedNumber, actualNumber);
		}
	}

	@Test
	void decimalToOctalArrayIncorrect() {
		int[][] arrayNumberForTest = {
				{0, 20},
				{23, 237},
				{12, 114},
				{865, 151},
				{3298, 634321}
		};
		for(int i = 0; i < arrayNumberForTest.length; i++) {
			int[] temp = arrayNumberForTest[i];
			Assert.assertEquals("array length needs to be two", 2, temp.length);
			int testNumber = temp[0];
			String expectedNumber = String.valueOf(temp[1]);
			String actualNumber = LaboratoryTwo_ConvertingNumbers.decimalToOctal(testNumber);
			Assert.assertNotEquals("equal number", expectedNumber, actualNumber);
		}
	}

	@Test
	void decimalToOctalExceptionTest() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> {
			int numberForTest = Integer.MIN_VALUE;
			String exceptionTest = LaboratoryTwo_ConvertingNumbers.decimalToOctal(numberForTest);
		});
		Assert.assertEquals(exception.getClass(), ArithmeticException.class);
	}

	//Tests for decimalToSixteen
	@Test
	void decimalToSixteenArrayCorrect() {
		int[] arrayForTest = {24, 81, 0, 896, 321, 423, 15};
		String[] expected = {"18", "51", "0", "380", "141", "1A7", "F"};

		for(int i = 0; i < arrayForTest.length; i++) {
			Assert.assertEquals("The length of both arrays must be equal", arrayForTest.length, expected.length);
			int testNumber = arrayForTest[i];
			String expectedNumber = expected[i];
			String actualNumber = LaboratoryTwo_ConvertingNumbers.decimalToSixteen(testNumber);
			Assert.assertEquals("Equal number", expectedNumber, actualNumber);
		}
	}

	@Test
	void decimalToSixteenArrayIncorrect() {
		int[] arrayForTest = {24, 81, 0, 896, 321, 423, 15};
		String[] expected = {"118", "513", "30", "3580", "14F1", "1AD7", "2F"};

		for(int i = 0; i < arrayForTest.length; i++) {
			Assert.assertEquals("The length of both arrays must be equal", arrayForTest.length, expected.length);
			int testNumber = arrayForTest[i];
			String expectedNumber = expected[i];
			String actualNumber = LaboratoryTwo_ConvertingNumbers.decimalToSixteen(testNumber);
			Assert.assertNotEquals("Equal number", expectedNumber, actualNumber);
		}
	}

	@Test
	void decimalToSixteenExceptionTest() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> {
			int numberForTest = Integer.MIN_VALUE;
			String throwTest = LaboratoryTwo_ConvertingNumbers.decimalToSixteen(numberForTest);
		});
		Assert.assertEquals(exception.getClass(), ArithmeticException.class);
	}

	@Test 
	void decimalToSixteenExceptionTestTwo() throws Exception{
		Exception exception = assertThrows(Exception.class, () -> {
			int numberForTest = -23;
			String throwTest = LaboratoryTwo_ConvertingNumbers.decimalToSixteen(numberForTest);
		});
		Assert.assertEquals(exception.getClass(), ArithmeticException.class);
	}

}
