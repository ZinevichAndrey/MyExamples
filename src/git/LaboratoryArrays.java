package git;

public class LaboratoryArrays {
	// task ¹ 1 Create an array of even numbers from 2 to 20.
	int[] createArrayOfEvenNumbers() {
		int[] array = new int[10];
		int temp = 2;

		for(int i = 0; i < array.length; i++) {
			array[i] = temp;
			temp += 2;
			System.out.println(array[i]);
		}

		return array;
	}
	//task ¹ 2 Create an array from 1 to 99 odd. Display it on the screen, then in the opposite direction.
	int[] createArrayAndOppositeDirection() {
		int[] array = new int[50];
		int count = 1;

		for(int i = 0; i < array.length; i++) {
			array[i] = count;
			System.out.println(array[i]);
			count+= 2;
		}
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}

		return array;
	}
	//task ¹3 Create an array of 15 random numbers from 0 to 9. Count the number of even elements.
	int[] createArrayAndCountEvenElements() {
		int evenElements = 0;
		int[] array = new int[15];

		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
			if(array[i] % 2 == 0) {
				evenElements++;
			}
			System.out.println(array[i]);
		}
		System.out.println("Count even elements: " + evenElements);

		return array;
	}
	//task ¹4 Create an array of 8 numbers from 1 to 10. Replace each element with an odd index with 0.
	int[] createArrayAndReplace() {
		int[] array = new int[8];

		System.out.println("Before replacing items by index:");
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10) + 1;	
			System.out.println(array[i]);
		}
		System.out.println("After replacing items by index:");
		for(int i = 0; i < array.length; i++) {
			if(i % 2 != 0) {
				array[i] = 0;
			}
			System.out.println(array[i]);
		}

		return array;
	}
	//task ¹5 Create two arrays of 5 random numbers (0 -5). 
	//Print both. Calculate the amount. Compare the sum of both arrays and specify which one is larger.
	void createTwoArraysAndCompareSumOfBoth() {
		int[] firstArray = new int[5];
		int[] secondArray = new int[firstArray.length];
		int sumFirstArray = 0;
		int sumSecondArray = 0;

		for(int i = 0; i < firstArray.length; i++) {
			firstArray[i] = (int)(Math.random() * 6);
			secondArray[i] = (int)(Math.random() * 6);	
			sumFirstArray += firstArray[i];
			sumSecondArray += secondArray[i];
			System.out.println("First:" + firstArray[i]);
			System.out.println("Second:" + secondArray[i]);
		}
		System.out.println("Sum first:" + sumFirstArray);
		System.out.println("Sum second: " + sumSecondArray);
		if(sumFirstArray > sumSecondArray) {
			System.out.println("The sum of the elements in the first array is greater than in the second");
		}
		else {
			System.out.println("The sum of the elements in the second array is greater than in the first");
		}
	}
	//task ¹6 Create an array of 4 random numbers from 1 to 99. determine if an array is increasing.
	int[] createArrayAndDetemineIncreasingArray() {
		int[] array = new int[4];
		boolean flag = true;

		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 98) + 1;
			System.out.println(array[i]);
		}
		for(int i = 1; i < array.length; i++) {
			if(array[i -1] > array[i]) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("The array is increasing");
		}
		else {
			System.out.println("The array is not increasing");
		}

		return array;
	}
	//task ¹8 Create an array of 12 elements (-15 - 15) . Determine the maximum element in the array. Report its index.
	int[] createArrayAndDetermineMaxElement() {
		int[] array = new int[12];
		int index = 0;

		for(int i = 0; i < array.length; i++) {
			array[i] = (int)((Math.random() * 32) - 16);
			System.out.println(array[i]);	
		}
		int maxElem = array[0];
		for(int i = 0; i < array.length; i++) {
			if(maxElem < array[i]) {
				maxElem = array[i];
				index = i;
			}
		}
		System.out.println("Maximum element in the array: " + maxElem);
		System.out.println("index it is element: " + index);

		return array;
	}
	//task ¹9 Create an array of 11 elements (-1 - 1) . Determine which element is most common.
	int[] determineWhichElementsAreMore() {
		int countMinusOne = 0;
		int[] array = new int[11];

		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() < 0.5? -1 : 1);	
			if(array[i] == -1) {
				countMinusOne++;
			}
			System.out.println(array[i]);
		}
		System.out.println("Minus one occurs in the array:" + countMinusOne + " times");

		return array;
	}
	//task ¹10 Create an array of 10 elements (- 5 - 5) .
	//Divide the array into two halves.Calculate the sum of each half and determine which half is larger.
	int[] DivideTheArray() {
		int[] array = new int[10];
		int firstHalf = 0;
		int secondHalf = 0;

		for(int i = 0; i < array.length; i++) {
			array[i] = (int)((Math.random() * 12) - 6);
			System.out.println(array[i]);
		}
		for(int i = 0; i < array.length /2; i++) {
			firstHalf += array[i];
			System.out.println("First array: " + array[i]);
		}
		System.out.println("Summ first array: " + firstHalf);
		for(int i = array.length / 2; i < array.length; i++) {
			secondHalf += array[i];
			System.out.println("Second array: " + array[i]);
		}
		System.out.println("Summ second array: " + secondHalf);
		if(firstHalf > secondHalf) {
			System.out.println("The first half of the array is larger than the second");
		}
		else if(firstHalf == secondHalf) {
			System.out.println("Arrays equals");
		}
		else {
			System.out.println("The second array is larger than the first");
		}

		return array;
	}
	// ¹11 --------- Multidimensional array -------------
	//task ¹1 Create a 2-dimensional array of 8 rows and 5 columns. Fill in with random numbers from 10 to 99.
	int[][] createDimensionalArray() {
		int[][] multiArray = new int[8][5];

		for(int i = 0; i < multiArray.length; i++) {
			for(int j = 0; j < multiArray[i].length ;j++) {
				multiArray[i][j] = (int)(Math.random() * 90) + 10;
				System.out.print(multiArray[i][j] + "\t");
			}
			System.out.println();
		}

		return multiArray;
	}
	//task ¹2 Create a 2-dimensional array of 5 rows of 8 columns. Fill in from -99 to 99. Print the maximum value.
	int[][] createDimensionalArrayAndPrintMaxValue(){
		int[][] multiArray = new int[5][8];
		int maxElement = 0;
		String index = "";

		for(int i = 0; i < multiArray.length; i++) {
			for(int j = 0; j < multiArray[i].length; j++) {
				multiArray[i][j] = (int)(Math.random() * 200) - 100;
				if(maxElement < multiArray[i][j]) {
					maxElement = multiArray[i][j];
					index = i + " " + j;
				}
			}
			System.out.println();
		}
		System.out.println("Index of element:" + index);
		System.out.println("Maximum of element: " + maxElement);

		return multiArray;
	}
	//task ¹3 Create a 2-dimensional array of 7 rows and 4 columns. Fill in from -5 to 5.
	//Determine the index of the row with the largest sum of elements.
	int[][] createMultiArray(){
		int[][] multiArray = new int[7][4];
		int[] temp = new int[multiArray.length];
		int result = 0;

		for(int i = 0; i < multiArray.length; i++) {
			for(int j = 0; j < multiArray[i].length; j++) {
				multiArray[i][j] = (int)(Math.random() * 11) - 5;
				temp[i] += multiArray[i][j];
				System.out.print(multiArray[i][j] + "\t");
			}
			System.out.println();
		}
		for(int i = 0; i < temp.length; i++) {
			int maxArray = temp[0];
			System.out.println("Summ of array: " + temp[i] +" Index: " + i);
			if(maxArray < temp[i]) {
				result = i;
			}
		}
		System.out.println(result + " The index with the maximum sum in the array");

		return multiArray;
	}
	//¹4 Create a 2-dimensional array of 6 rows and 7 columns. Fill in with random numbers from 0 to 9. Sort
	void homeWorkFour_CreateAndSortArray() {
		final int minValue = 10;
		final int maxValue = 20;
		final int numberOfRows = 4;
		final int numberOfColumns = 3;

		System.out.println("create array:");
		int[][] array = this.creatArrayWithRandomValues(numberOfRows, numberOfColumns, minValue, maxValue);
		this.printArray(array);
		System.out.println("Array after sorting:");
		int[] sortedArray = this.sortOneLineArray(array);
		int[] bubbleSort = this.bubbleSort(sortedArray);
		int[][] sortArray = this.oneDimensionalToTwoDimensional(bubbleSort, numberOfRows, numberOfColumns);	
		this.printArray(sortArray);
	}

	int[][] creatArrayWithRandomValues(int numberOfRows, int numberOfColumns, int minValue, int maxValue){
		int[][] returnValue = new int[numberOfRows][numberOfColumns];

		for(int i = 0; i < returnValue.length; i++) {
			for(int j = 0; j < returnValue[i].length; j++) {
				returnValue[i][j] = this.getRandomValue(minValue, maxValue);
			}
		}

		return returnValue;
	}

	int getRandomValue(int minValue, int maxValue) {
		int distance = maxValue - minValue + 1;
		int randDistanceValue = (int)(Math.random() * distance);
		int randomValue = randDistanceValue + minValue;

		return randomValue;
	}
	//Sorting a one-dimensional array
	int[] sortOneLineArray(int[][] array) {
		int[] oneLineArray = new int[array.length * array[0].length];
		int temp = 0;
		boolean flag = false;

		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				oneLineArray[i * array[i].length + j] = array[i][j];
			}
		}

		return oneLineArray;
	}
	//Sorting by bubble
	int[] bubbleSort(int[] array){
		for(int i = array.length-1 ; i > 0 ; i--){
			for(int j = 0 ; j < i ; j++){
				if(array[j] < array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}

		return array;
	}
	//Converting a one-dimensional array to a two-dimensional array
	int[][] oneDimensionalToTwoDimensional(int[] array, int numberOfRows, int numberOfColumns){
		if(array.length != (numberOfRows * numberOfColumns)) {
			System.out.println("Fr");
			throw new IndexOutOfBoundsException();	
		}
		int[][] newArray = new int[numberOfRows][numberOfColumns];

		for(int i = 0; i < newArray.length; i++) {
			for(int j = 0; j < newArray[i].length; j++) {
				newArray[i][j] = array[(i * newArray[i].length) + j];
			}
		}	

		return newArray;
	}

	void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ "\t");		
		}
		System.out.println();
	}

	void printArray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");	
			}
			System.out.println();
		}
	}
	//¹5 Create a multiplication table.
	void multiplicationTable() {
		for(int i = 1; i < 11; i++) {
			for(int j = 1; j < 11; j++) {
				System.out.println(i + " : " + j + " = " + i * j );
				//	System.out.print(i * j + "\t");
			}
			//	System.out.println();
		}
	}
}
