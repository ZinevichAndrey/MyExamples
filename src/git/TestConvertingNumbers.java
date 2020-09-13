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
	void decimalToOctalArrayCorrct() {

	}


}
