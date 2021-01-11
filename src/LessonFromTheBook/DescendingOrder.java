package LessonFromTheBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class DescendingOrder {
	// Числа в порядке убывания частоты встречаемости чисел.
	// Numbers in descending order of frequency of occurrence of numbers.

	public int[] sort(int[] numbers) {
		boolean flag = false;
		int temp;
		int[] result = new int[numbers.length];
		while(!flag) {
			flag = true;
			for(int i = 0; i < numbers.length - 1; i++) {
				if(numbers[i] > numbers[i + 1]) {
					flag = false;
					temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
				}
			}
		}
		System.arraycopy(numbers, 0, result, 0, numbers.length);

		return result;
	}

	public List<Pair> getFrequency(int[] array) {
		List<Pair> returnValue = new ArrayList<>();
		int[] sortedArray = this.sort(array);
		if(sortedArray.length == 0) {
			return returnValue;
		}
		Pair pair = new Pair(sortedArray[0], 0);
		for(int j = 0; j < sortedArray.length; j++) {
			if(pair.value == sortedArray[j]) {
				pair.count ++;
			}
			else {
				returnValue.add(pair);
				pair = new Pair(sortedArray[j], 1);
			}
		}
		returnValue.add(pair);
		return returnValue;
	}

	public List<Pair> getFrequencyMap(int[] array) {
		List<Pair> returnValue = new ArrayList<>();
		HashMap<Integer, Pair> mapValues = new HashMap<>();
		for(int i = 0; i < array.length; i++) {
			int value = array[i];
			Pair previusPair = mapValues.get(value);
			if(previusPair == null) {
				previusPair = new Pair(value, 0);
			}
			previusPair.count++;

			mapValues.put(value, previusPair); 
		}
		returnValue = new ArrayList<>(mapValues.values()) ;
		Collections.sort(returnValue);
		return returnValue;
	}



}
