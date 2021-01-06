package LessonFromTheBook;

public class NumbersDivisibleByThreeOrNine {
	int[] array = {4, 3, 2, 5, 6, 22, 11, 19, 423};

	// Numbers that are divisible by 3 or 9.
	public void numbersDivisibleByThreeOrNine() {
		int divisibleBuThreeOrNine;
		for(int i = 0; i < this.array.length; i++) {
			if(this.array[i] % 3 == 0 || this.array[i] % 9 == 0) {
				divisibleBuThreeOrNine = this.array[i];
				System.out.println("divisible numbers by three or Nine:" + "\n" + divisibleBuThreeOrNine);
			}
		}
	}
}
