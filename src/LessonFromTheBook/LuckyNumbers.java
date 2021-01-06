package LessonFromTheBook;

public class LuckyNumbers {
	// Lucky numbers.
	private int [] numbers = new int[100];
	private int[] evenNumbers = new int[this.numbers.length / 2];
	protected int[] result;

	public void setup() {
		this.fillTheArray();
		this.EliminateEvenNumbers();	
	}

	private int[] fillTheArray() {
		for(int i = 0; i < this.numbers.length; i++) {
			this.numbers[i] = i + 1;
		}	
		return this.numbers;
	}

	private int[] EliminateEvenNumbers() {
		int count = 0;
		for(int i = 0; i < this.numbers.length; i+= 2) {
			if(this.numbers[i] % 2 != 0) {
				this.evenNumbers[count] = this.numbers[i];
				count++;
			}
		}
		return this.evenNumbers;
	}

	public int[] replicate(int[] array, int n) {
		this.result = new int[array.length - array.length / n];
		int j = 0;
		for (int i = 0; i != array.length; i++) {
			if ((i + 1) % n != 0) {
				result[j++] = array[i];
			}
		}
		return result;
	}

	public int[] getArray(){
		return this.evenNumbers;
	}

	public void show(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
