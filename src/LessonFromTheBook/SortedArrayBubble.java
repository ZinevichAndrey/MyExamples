package LessonFromTheBook;

import java.util.Arrays;

public class SortedArrayBubble {

	int[] array = {4, 3, 2, 5, 6, 22, 11, 19, 423};

	//	Sorted numbers in descending order.
	public void sortNumbersByDescendingTheBubble() {
		int temp;
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for(int i = 0; i < this.array.length - 1; i++) {
				if(this.array[i] < this.array[i + 1]) {
					isSorted = false;
					temp = this.array[i];
					this.array[i] = this.array[i + 1];
					this.array[i + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(this.array));
	}

	// Sort items using the bubble method.
	public int[] bubbleSort() {
		boolean isSorted = false;
		int temp;
		while(!isSorted) {
			isSorted = true;
			for(int i = 0; i < this.array.length -1; i++) {
				if(this.array[i] > this.array[i + 1]) {
					isSorted = false;
					temp = this.array[i];
					this.array[i] = this.array[i + 1];
					this.array[i + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(this.array));
		return this.array;
	}
}


