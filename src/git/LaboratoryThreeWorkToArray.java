package git;

public class LaboratoryThreeWorkToArray {	
	//1. ��� ������ �� ����� �����. ���������� �������� ������� ��� ����. � ���. �������. 
	//������� � ������� ����. � ���. �������.
	//2. ��� ������ �� ����� �����. ���������� ����������� ������ �� �����������.
	//3. ��� ������ �� ����� �����. ���������� ����� ������� �������� � ������� ��� �� �������.
	//4 ��� ������. ��������� ����� ������ � �������� ���������.
	//5 �������� ���������, ��������� � ������� ������� 3*5 ��������� ���������(�(i,j) < 10).
	//6.���� 5 �����. �� ������ �������:���� ������ �4 ����� �5, ������� �1 � �2,
	// ����� ������� �1 � �3

	//� 1
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
	//� 2
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
	//� 3
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
	//� 4
	

}
