package LessonFromTheBook;

import java.util.Arrays;

public class PrimeNumbers {
	int[] array = {4, 3, 2, 5, 6, 22, 11, 19, 423};
	int[] arrayPrimeNumbers = new int[this.array.length];

	// Prime numbers up to 100
	public int[] primeNumbers() {
		int count = 0;
		for(int i = 0; i < this.array.length; i++) {
			if(this.array[i] % 2 != 0 && this.array[i] % 3 != 0 && this.array[i] % 5 != 0 && this.array[i] != 1 && this.array[i] % 7 != 0) {
				this.arrayPrimeNumbers[count] = this.array[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(this.arrayPrimeNumbers));
		return this.arrayPrimeNumbers;
	}
}
