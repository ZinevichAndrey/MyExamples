package LessonFromTheBook;

public class LuckyNumbers {
	// Lucky numbers.
	private int [] numbers = new int[100];
	int[] evenNumbers = new int[this.numbers.length / 2];
	private int[] result;


	public int[] fillTheArray() {
		for(int i = 0; i < this.numbers.length; i++) {
			this.numbers[i] = i + 1;
		}	
		return this.numbers;
	}

	public int[] EliminateEvenNumbers() {
		int count = 0;
		for(int i = 0; i < this.numbers.length; i+= 2) {
			if(this.numbers[i] % 2 != 0) {
				this.evenNumbers[count] = this.numbers[i];
				count++;
			}
		}
		return this.evenNumbers;
	}

	//”далить каждое 3 число при первом прогоне. ѕри втором удалить каждое седьмое число !,


	public void show(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
