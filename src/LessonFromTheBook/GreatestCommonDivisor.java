package LessonFromTheBook;

public class GreatestCommonDivisor {
	//	Наибольший общий делитель и наименьшее общее кратное этих чисел.
	//	The largest common divisor and the smallest common multiple of these numbers.

	public static int greatestCommonDivisor(int a, int b) {
		if (b == 0) {
			return Math.abs(a);
		}
		int previusMax = b;
		int remainder = a % b;
		// 0. 33, 21	33 % 21 == 12
		// 1. 21, 12	21 % 12 == 9
		// 2. 12, 9		12 % 9 == 3
		// 3. 9, 3		9 % 3 == 0
		// 4. 3, 0
		// 5. return 3
		return greatestCommonDivisor(previusMax, remainder);
	}

	public static int lcm(int a, int b) {		
		return a / greatestCommonDivisor(a,b) * b;

	}
}
