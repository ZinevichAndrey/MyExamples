package git;

import java.math.BigInteger;
import java.text.DecimalFormat;

public class Laboratory1 {

	/* 1. Normal creation of two arrays
	 * 2. Display the two arrays
	 * 3. Display numbers from 1 to 9 on the screen in a pyramid
	 * 4. Use the loop to calculate the passed value squared
	 * 5.Program for calculating the factorial for an arbitrary number n < 10;
	 * 6.Two real numbers are given. You need to get their sum, difference, and product.Output the result to the console.
	 * 7.Determine the time when a material body falls from a given height. Output the result to the console.
	 * 8. Create a program to find the length of the cathet of a right triangle (B), if you know the length of the hypotenuse (C), and the cathet(A).
	 * Output the result to the console.
	 */

	private String[] massEquation = {"a = 1", "c = a + 1", "m = 2", "n = 3", "Solving Equations"}; 
	private String[] massFindingRoots = {"b = 6", "d = b * 2 -1", "p = 4", "g = 5", "Finding roots"};
	private int factorial = 1;
	private BigInteger temporarily;
	private BigInteger result = BigInteger.valueOf(1);

	//�1 -2
	void outputToTheConsolMass() {
		for(int i = 0; i < this.massEquation.length; i++) {
			System.out.print(this.massEquation[i] + "\t");	
		}
		System.out.println("");
		for(int i = 0; i < this.massFindingRoots.length; i++) {
			System.out.print(this.massFindingRoots[i] + "\t");
		}
	}
	// �3
	static void outputNumbers() {
		for(int i = 1; i < 10; i++) {
			System.out.println("");
			for(int j = 1; j < i + 1; j++) {
				System.out.print(j);
			}
		}
	}
	//�4
	int squaring(int squaring) {
		int result = 1;
		for(int i = 0; i < squaring; i++) {
			result += squaring;
		}
		System.out.println(this.result);

		return result;
	}
	//�5
	BigInteger factorial(int factorial){
		this.result = BigInteger.valueOf(1);
		if(factorial < 0 || factorial >= 1677) {
			throw new ArithmeticException();
		}
		for(int i = 1; i <= factorial; i++) {	
			this.temporarily = BigInteger.valueOf(i);
			this.result = result.multiply(this.temporarily);
		}
		System.out.println(this.result);

		return this.result;
	}
	//�6
	static void calculation(int first, int second) {
		int sum =  first + second;
		int subtract = first - second;
		int times = first * second;
		int divided = first / second;
		int modulDivided = first % second;
		System.out.println("First number: " + first + " Second number: " + second);
		System.out.print("Summ two numbers: " + sum +"\nResult subtraction:" + subtract + "\nResult times:" + times + "\nResult divided:" + divided + "\nModul of divided:" + modulDivided);
	}
	// �7
	public static double timeToFall(double height) {
		final double accelerationOfGravity = 9.81;	
		double temp = Math.abs(height);
		double temporarily = (temp / accelerationOfGravity) * 2 ;
		double result = Math.sqrt(temporarily);

		return result;	
	}
	// Find the length of the hypotenuse when you know the other two sides(a,b)
	//�8
	public static double CalculationHipotenuse(double firstKatet, double secondKatet) {
		double temp = (firstKatet * firstKatet) + (secondKatet * secondKatet);
		double resultHipotenuse = Math.sqrt(temp);
		DecimalFormat decimalFormat = new DecimalFormat("0.000");
		System.out.println(decimalFormat.format(resultHipotenuse));

		return resultHipotenuse;
	}

}
