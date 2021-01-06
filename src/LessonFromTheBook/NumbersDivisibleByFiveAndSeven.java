package LessonFromTheBook;

public class NumbersDivisibleByFiveAndSeven {
	int[] array = {4, 3, 2, 5, 6, 22, 11, 19, 423};

	//4 Numbers that are divisible by 5 and 7.
	public void numbersDivisibleByFiveAndSeven() {
		int divisibleByFiveAndSeven;
		for(int i = 0; i < this.array.length; i++) {
			if(this.array[i] % 5 == 0 && this.array[i] % 7 == 0) {
				divisibleByFiveAndSeven = this.array[i];
				System.out.println("Divisible numbers by five and seven:" + "\n" + divisibleByFiveAndSeven);
			}
		}
	}

}
