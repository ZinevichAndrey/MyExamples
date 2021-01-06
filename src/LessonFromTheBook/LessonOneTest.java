package LessonFromTheBook;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigInteger;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class LessonOneTest {

	@Test
	void testFibanachi() {
		BigInteger actual = GetFibanachi.getFibanachi(12);
		BigInteger expected = BigInteger.valueOf(144);
		assertEquals(expected, actual, "Equals");
	}

	@Test
	void testArrayFibanachi() {
		int[][] numbersForTests = {
				{0, 0},
				{5, 5},
				{20, 6765},
				{15, 610}
		}; 
		for(int i = 0; i < numbersForTests.length; i++) {
			int[] temp = numbersForTests[i];
			Assert.assertEquals("array length needs to be two", 2, temp.length);
			int testNumber = temp[0];
			int expectedNumber = temp[1];
			BigInteger actualNumber = GetFibanachi.getFibanachi(testNumber);
			Assert.assertEquals("equal numbers", expectedNumber, actualNumber);
		}
	}

}
