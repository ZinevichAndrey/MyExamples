package LessonFromTheBook;

import java.util.Scanner;

public class SetArray {
	int[] array = {4, 3, 2, 5, 6, 22, 11, 19, 423};
	private Scanner scan;

	//1 Enter n integers from the console and put them into an array. Output to the console:
	//one. Even and odd numbers.
	public void setArray() {
		this.scan = new Scanner(System.in);
		for(int i = 0; i < this.array.length; i++) {
			if(this.scan.hasNextInt()) {
				this.array[i] = this.scan.nextInt();
			}
			else {
				System.out.println("Вы ввели не число!");
				break;
			}
		}
	}
	//1.1
	public void evenNumbers() {
		int evenNumbers;
		for(int i = 0; i < this.array.length; i++) {
			if(this.array[i] % 2 == 0) {
				evenNumbers = this.array[i];
				System.out.println("Even numbers: " + "\n" + evenNumbers);
			}	
		}
	}
	//1.2
	public void oddNumbers() {
		int oddNumbers;
		for(int i = 0; i < this.array.length; i++) {
			if(this.array[i] % 2 != 0) {
				oddNumbers = this.array[i];
				System.out.println("Odd numbers: " + "\n" + oddNumbers);
			}	
		}
	}
}
