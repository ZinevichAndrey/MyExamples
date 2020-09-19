package git;

public class LaboratoryThreeWorkToArray {	
	//1. Дан массив из целых чисел. Необходимо поменять местами его макс. и мин. элемент. 
	//Вывести в консоль макс. и мин. элемент.
	//2. Дан массив из целых чисел. Необходимо упорядочить массив по возрастанию.
	//3. Дан массив из целых чисел. Необходимо найти среднее значение и вывести его на консоль.
	//4 Дан массив. Посчитать сумму чётных и нечётных элементов.
	//5 Напишите программу, выводящую в консоль таблицу 3*5 случайных элементов(а(i,j) < 10).
	//6.Даны 5 строк. На основе условия:Если строка с4 равна с5, сложить с1 и с2,
	// иначе сложить с1 и с3

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
	

}
