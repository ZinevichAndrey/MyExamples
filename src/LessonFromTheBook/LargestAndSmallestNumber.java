package LessonFromTheBook;

public class LargestAndSmallestNumber {
	int[] array = {4, 3, 2, 5, 6, 22, 11, 19, 423};

	//2 The largest and smallest number.
	public void largestAndSmallestNumber() {
		int large = this.array[1];
		int small = this.array[1];
		for(int i = 0; i < this.array.length; i++) {
			if(this.array[i] > large) {
				large = this.array[i];
			}
			else if(this.array[i] < small) {
				small = this.array[i];
			}
		}
		System.out.println("\n" +"large:" + "\n"+ large);
		System.out.println("Small:" +"\n" + small);

	}
}
