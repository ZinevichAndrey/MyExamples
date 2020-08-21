package Laboratory_Work;

import java.math.BigInteger;
import java.text.DecimalFormat;

public class Laboratory1 {

	/*
	 * 1. Обычное создание двух массивов
	 * 2. Вывести два массива 
	 * 3. Вывести цифры от 1 до 9 на экран в ввиде пирамиды
	 * 4. Вычислить с помощью цикла передаваемое значение в квадрате 
	 * 5.Программа расчёта факториала для произвольно числа n < 10; 
	 * 6.Даны два действительных числа. Необходимо получить их сумму, разность, и произведение.Результат вывести на консоль.
	 * 
	 * 7.Определить время падения материального тела с заданной высоты. Вывести в консоль результат.
	 * 8. Составить программу для нахождениея длины катета прямоугольного треугольника(Б), если известна длина гипотенузы (С), и катета(А). Результат вывести в консоль.
	 * 
	 * Лабораторная работа №4
	 * 
	 * 
	 * 
	 */

	private String[] massEquation = {"a = 1", "c = a + 1", "m = 2", "n = 3", "Решение уравнений"}; 
	private String[] massFindingRoots = {"b = 6", "d = b * 2 -1", "p = 4", "g = 5", "Нахождение корней"};
	private int factorial = 1;
	private BigInteger temporarily;
	private BigInteger result = BigInteger.valueOf(1);


	//№1 -2
	void outputToTheConsolMass() {
		for(int i = 0; i < this.massEquation.length; i++) {
			System.out.print(this.massEquation[i] + "\t");	
		}
		System.out.println("");
		for(int i = 0; i < this.massFindingRoots.length; i++) {
			System.out.print(this.massFindingRoots[i] + "\t");
		}
	}

	// №3
	static void outputNumbers() {
		for(int i = 1; i < 10; i++) {
			System.out.println("");
			for(int j = 1; j < i + 1; j++) {
				System.out.print(j);
			}
		}
	}

	//№4
	int squaring(int squaring) {
		int result = 1;
		for(int i = 0; i < squaring; i++) {
			result += squaring;
		}
		System.out.println(this.result);
		return result;
	}

	//№5

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


	//№6
	static void calculation(int first, int second) {
		int sum =  first + second;
		int subtract = first - second;
		int times = first * second;
		int divided = first / second;
		int modulDivided = first % second;
		System.out.println("Первое число:" + first + " Второе число:" + second);
		System.out.print("Сумма двух чисел:" + sum +"\nРезультат вычитания:" + subtract + "\nРезультат перемножения:" + times + "\nРезультат деления:" + divided + "\nОстаток от деления:" + modulDivided);
	}

	// №7
	public static double timeToFall(double height) {
		final double accelerationOfGravity = 9.81;	
		double temp = Math.abs(height);
		double temporarily = (temp / accelerationOfGravity) * 2 ;
		double result = Math.sqrt(temporarily);
		return result;	
	}

	// Нахождение длины гипотенузы , если известны катеты(а,б).	
	//№8
	public static double CalculationHipotenuse(double firstKatet, double secondKatet) {
		double temp = (firstKatet * firstKatet) + (secondKatet * secondKatet);
		double resultHipotenuse = Math.sqrt(temp);
		DecimalFormat decimalFormat = new DecimalFormat("0.000");
		System.out.println(decimalFormat.format(resultHipotenuse));
		return resultHipotenuse;
	}

}
