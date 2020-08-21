package Laboratory_Work;



public class LaboratoryArrays {

	

	// № 1 Создать массив из чётных чисел от 2 до 20.
	int[] taskArrayOne() {

		int[] array = new int[10];
		int temp = 2;

		for(int i = 0; i < array.length; i++) {
			array[i] = temp;
			temp += 2;
			System.out.println(array[i]);
		}
		return array;
	}


	// № 2  Массив от 1 до 99 нечётн. Вывести на экран, затем в обратном направлении.

	int[] taskArrayTwo() {

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


	// №3 Массив из 15 случайных чисел от 0 - 9. Подсчитать количество чётных элементов.

	int[] taskArrayThree() {

		int evenElements = 0;
		int[] array = new int[15];

		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
			if(array[i] % 2 == 0) {
				evenElements++;
			}
			System.out.println(array[i]);
		}
		System.out.println("Количество чётных элементов " + evenElements);
		return array;
	}

	//№4 Массив из 8 чисел от 1 до 10. Заменить каждый элемент с нечётным индексом на 0.

	int[] taskArrayFour() {

		int[] array = new int[8];

		System.out.println("До замены элементов по индексу:");
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10) + 1;	
			System.out.println(array[i]);
		}
		System.out.println("После замены элементов по индексу:");
		for(int i = 0; i < array.length; i++) {
			if(i % 2 != 0) {
				array[i] = 0;
			}
			System.out.println(array[i]);
		}
		return array;
	}

	//№5 Два массива из 5 случайных чисел (0 -5). Вывести оба. Посчитать сумму. Сравнить сумму обоих массив и указать в котором больше.

	void taskArrayFive() {

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
			System.out.println("Сумма элементов в первом массиве больше чем во втором");
		}
		else {
			System.out.println("Сумма элементов во втором массиве больше чем в первом");
		}
	}

	// №6 Создать массив из 4 случайных чисел от 1 до 99. Определить возрастает ли массив.

	int[] taskArraySix() {

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
			System.out.println("Массив возрастает");
		}
		else {
			System.out.println("Массив не возрастает");
		}
		return array;
	}

	// №7 Создать массив фибоначи до 20. 
	//  1, 1, 2, 3, 5, 8, 13, 21, 34, 55
	int getFibanachi() {

		int firstNomber = 1;
		int secondNomber = 1;
		int result = 0;

		System.out.println(firstNomber + "\n" + secondNomber);
		for(int i = 3; i <= 20; i++) {
			result = firstNomber + secondNomber;
			System.out.println(result);
			firstNomber = secondNomber;
			secondNomber = result;
		}
		return result;
	}

	// №8 Создать массив из 12 элементов ( -15 - 15) . Определить максимальный элемент в массиве. Сообщить его индекс.

	int[] taskArrayEight() {

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
		System.out.println("Максимальный элемент в массиве: " + maxElem);
		System.out.println("Индекс элемента: " + index);
		return array;
	}

	// №9 Создать массив из 11 элементов ( -1 - 1) . Определить какой элемент встречается чаще всего.

	int[] taskArrayNine() {

		int countZero = 0;
		int[] array = new int[11];

		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() < 0.5? -1 : 1);	
			if(array[i] == -1) {
				countZero++;
			}
			System.out.println(array[i]);
		}
		System.out.println("Минус один в массиве встречается:" + countZero + " раза");
		return array;
	}


	// №10 Создать массив из 10 элементов ( - 5 - 5) . Массив разделить на две половины. Посчитать сумму каждой половины и определить какая половина больше.

	int[] taskArrayTen() {

		int[] array = new int[10];
		int firstHalf = 0;
		int secondHalf = 0;

		for(int i = 0; i < array.length; i++) {
			array[i] = (int)((Math.random() * 12) - 6);
			System.out.println(array[i]);
		}
		for(int i = 0; i < array.length /2; i++) {
			firstHalf += array[i];
			System.out.println("Первый массив: " + array[i]);
		}
		System.out.println("Сумма первого массива: " + firstHalf);
		for(int i = array.length / 2; i < array.length; i++) {
			secondHalf += array[i];
			System.out.println("Второй массив: " + array[i]);
		}
		System.out.println("Сумма второго массива: " + secondHalf);
		if(firstHalf > secondHalf) {
			System.out.println("Первая половина массива больше второй");
		}
		else if(firstHalf == secondHalf) {
			System.out.println("Массивы ровны");
		}
		else {
			System.out.println("Второй массив больше первого");
		}
		return array;
	}
	// №11 --------- Многомерные массивы -------------
	//№1 Создать 2-мерный массив из 8 строк и 5 столбцов.Заполнить случайными числами от 10 до 99.
	int[][] taskGetMultiArrayOne() {

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
	//№2 Создать 2-мерный массив из 5 строк по 8 столбцов. Заполнить от -99 до 99. Вывести максимальное значение.
	int[][] taskGetMultiArrayTwo(){

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
		System.out.println("Индекс элемента:" + index);
		System.out.println("Максимальный элемент: " + maxElement);
		return multiArray;
	}
	//№3 Создать 2-мерный массив из 7 строк и 4 столбцов. Заполнить от -5 до 5. Определить индекс строки с наибольшей суммой элементов.
	int[][] getMultiArrayThree(){

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
			System.out.println("Сумма массива: " + temp[i] +" Индекс: " + i);
			if(maxArray < temp[i]) {
				result = i;
			}
		}
		System.out.println(result + " Индекс с максимальной суммой в массиве");
		return multiArray;
	}
	//№4 Создать 2-мерный массив из 6 строк и 7 столбцов. Заполнить случайными числами от 0 до 9.
	//Отсортировать

	void homeWorkFour_CreateAndSortArray() {

		final int minValue = 10;
		final int maxValue = 20;
		final int numberOfRows = 4;
		final int numberOfColumns = 3;

		System.out.println("Создание массива:");
		int[][] array = this.creatArrayWithRandomValues(numberOfRows, numberOfColumns, minValue, maxValue);
		this.printArray(array);
		System.out.println("Массив после сортировки:");
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
	//Сортировка одномерного массива
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
//Сортировка пузырьком
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

	//Перевод одномерного массива в двумерный
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
	//№5 Создать таблицу умножения.
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
