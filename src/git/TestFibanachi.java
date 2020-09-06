package git;


import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestFibanachi {
	
//	@Test
//	void testGetFibanachiMinValue() {
//		int numberForTest = Integer.MIN_VALUE;
//		int actual =  6765;
//		int expected = Fibanachi.getFibanachi(numberForTest);
//		Assert.assertEquals("equals",expected, actual);
//	}
//
//	@Test
//	void testGetFibanachiMinusOne() {
//		int numberForTest = -1;
//		int actual =  6765;
//		int expected = Fibanachi.getFibanachi(numberForTest);
//		Assert.assertEquals("equals",expected, actual);
//	}

	@Test
	void testGetFibanachiSuccessful() {
		int[][] bigPacket = {
				{0, 0},
				{1, 1}, 
				{5, 5}, 
				{12, 144}, 
				{20, 6765}, 
				{30, 832040}
		};
		//Пакет с пакетами (Массив с массивами) , сперва влазим в большой пакет, затем хватаем пакет поменьше, затем уже влазим внутрь.
		for(int i = 0; i < bigPacket.length; i++) {
			int[] smallPacket = bigPacket[i];
			Assert.assertEquals("array length needs to be two", 2, smallPacket.length);
			int testNumber = smallPacket[0];
			int expectedNumber = smallPacket[1];
			int actualNumber = Fibanachi.getFibanachi(testNumber);
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
				{30, 83240}
		};
	
		for(int i = 0; i < numbersForTests.length; i++) {
			int[] temp = numbersForTests[i];
			Assert.assertEquals("array length needs to be two", 2, temp.length);
			int testNumber = temp[0];
			int expectedNumber = temp[1];
			int actualNumber = Fibanachi.getFibanachi(testNumber);
			Assert.assertNotEquals("Not equal numbers", expectedNumber, actualNumber);
		}
	}

//	@Test
//	void testGetFibanachiHundred() {
//		int numberForTest = 100;
//		int actual =  6765;
//		int expected = Fibanachi.getFibanachi(numberForTest);
//		Assert.assertEquals("equals",expected, actual);
//	}
//
//	@Test
//	void testGetFibanachiEigth() {
//		int numberForTest = Integer.MAX_VALUE;
//		int actual =  6765;
//		int expected = Fibanachi.getFibanachi(numberForTest);
//		Assert.assertEquals("equals",expected, actual);
//	}

//	@Test
//	void testGetFibanachiIncorrect() {
//		int numberForTest = Integer.MAX_VALUE;
//		int actual =  6765;
//		int expected = Fibanachi.getFibanachi(numberForTest);
//		Assert.assertNotEquals("equals", expected, actual);
//	}
}
