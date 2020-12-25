package LessonFromTheBook;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class LessonOne {

	private int[] array = new int[10];
	private int[] arrayPrimeNumbers = new int[this.array.length];
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
				System.out.println("�� ����� �� �����!");
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
	//3 Numbers that are divisible by 3 or 9.
	public void numbersDivisibleByThreeOrNine() {
		int divisibleBuThreeOrNine;
		for(int i = 0; i < this.array.length; i++) {
			if(this.array[i] % 3 == 0 || this.array[i] % 9 == 0) {
				divisibleBuThreeOrNine = this.array[i];
				System.out.println("divisible numbers by three or Nine:" + "\n" + divisibleBuThreeOrNine);
			}
		}
	}
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
	//5. Sort items using the bubble method.
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

	//	6. ��� ����������� �����, � ���������� ������ ������� ��� ���������� ����.

	//	7. ���������� ����� �������� � ���������� ����� ������� ���� �����.

	//	8. Prime numbers
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
	//	9. ��������������� ����� � ������� ��������.
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
	//	10. ����� � ������� �������� ������� ������������� �����.

	//	11. ����������� �����.

	//	12. Numbers Fibanachi
	static BigInteger getFibanachi(int number) {
		BigInteger result = BigInteger.valueOf(1);
		BigInteger firstNomber = BigInteger.valueOf(1);
		BigInteger secondNomber = BigInteger.valueOf(1);

		switch(number) {
		case 1 : return BigInteger.valueOf(1);	
		case 2 : return BigInteger.valueOf(2); 
		}
		if(number <= 0) {
			System.out.println(BigInteger.valueOf(0));
			return BigInteger.valueOf(0);
		}
		else if(number >= 100) {
			throw new ArithmeticException();
		}
		for(int i = 3; i <= number; i++) {
			result = firstNomber.add(secondNomber);
			firstNomber = secondNomber;
			secondNomber = result;	
		}
		return result;
	}


	//	13. �����-����������, �������� ������� � ������ � �������� ������� ���������.

	//	14. ��������, ������� ����� ��������� �������� ���������.

	//	15. ������ ���������� ����� p = m/n ��� ������ ���� ����� ������-������� ����� n � m, ������������� ������.

	//	16. ��������� ����������� ������� ��� ������� �������������� �����.
		
}
