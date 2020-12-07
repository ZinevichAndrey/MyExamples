package git;

import java.util.ArrayList;
import java.util.Collections;

public class LaboratoryThreeWorkToArray {	
	//1. Дан массив из целых чисел. Необходимо поменять местами его макс. и мин. элемент. 
	//Вывести в консоль макс. и мин. элемент.
	//2. Дан массив из целых чисел. Необходимо упорядочить массив по возрастанию.
	//3. Дан массив из целых чисел. Необходимо найти среднее значение и вывести его на консоль.
	//4 Дан массив. Посчитать сумму чётных и нечётных элементов.
	//5 Напишите программу, выводящую в консоль таблицу 3*5 случайных элементов(а(i,j) < 10).
	//6.Даны 5 строк. На основе условия:Если строка с1 равна с2, сложить с4 и с5,
	// иначе сложить с3 и с4

	//№ 1
	int[] raplaceToMinAndMaxElement(int[] array) {
		int length = array.length;
		int min = array[0];
		int max = array[0];
		int indexMin = 0;
		int indexMax = 0;

		for(int i = 0; i < length; i++) {
			if(min > array[i]) {
				min = array[i];
				indexMin = i;
			}
			if(max < array[i]) {
				max = array[i];
				indexMax = i;
			}
		}
		array[indexMax] = min;
		array[indexMin] = max;
		System.out.println("Min element: " + min + ". Max Element: " + max);

		return array;
	}
	//For Tests
	void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
	//№ 2
	int[] boobleSortFromSmallestToLargest(int[] array) {
		int length = array.length;
		int temp = 0;

		for(int i = 0; i < length; i++) {
			for(int j = length - 1; j > i; j--) {
				if(array[j - 1] > array[j]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}

		return array;
	}
	//№ 3
	int findingMiddleValue(int[] array) {
		int length = array.length;
		int result = 0;

		for(int i = 0; i < length; i++) {
			result += array[i];
		}
		result /= length;
		System.out.println(result);

		return result;
	}
	//№ 4
	void getSumOddAndEvenElements(int[] array) {
		int length = array.length;
		int evenSum = 0;
		int oddSum = 0;

		for(int i = 0; i < length; i++) {
			if(array[i] % 2 == 0) {
				evenSum += array[i];
			}
			else {
				oddSum += array[i];
			}
		}
		System.out.println("Even: " + evenSum);
		System.out.println("Odd: " + oddSum);
	}
	//№ 5
	void assemblyProgramm() {
		int[][] array = getArray(3, 5);
		printArray(array);
	}

	int[][] getArray(int lines, int columns){
		int[][] array = new int[lines][columns];  

		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random() * 10);
			}
		}

		return array;
	}

	void printArray(int[][] array) {
		int length = array.length;
		int lengthIn = array[0].length;

		for(int i = 0; i < length; i++) {
			for(int j = 0; j < lengthIn; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
	//№ 6
	String stringEuqalsAndConcat(String first, String second, String three, String four, String five) {
		if(first.equals(second)) {
			return four.concat(five);
		}
		else {
			return three.concat(four);
		}
	}

}
