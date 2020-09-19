package git;

public class LaboratoryTwo_ConvertingNumbers {

	//1. Converting numbers from decimal to binary
	//2. Converting numbers from decimal to octal
	//3. Converting numbers from decimal to hexadecimal

	// ¹1
	public static String decimalToBinary(int number) {
		String result = "";
		short binary = 0;
		if(number < 0) {
			throw new ArithmeticException();
		}
		else if(number == 0) {
			result = "0";
		}
		while(number > 0) {
			binary = (short)(number % 2);
			number /= 2;
			result = binary + result;
		}
		System.out.println(result);

		return result;
	}
	// ¹2
	public static String decimalToOctal(int number) {
		String result = "";
		short binary = 0;
		if(number < 0) {
			throw new ArithmeticException();
		}
		else if(number == 0) {
			result = "0";
		}
		while(number > 0) {
			binary = (short)(number % 8);
			number /= 8;
			result = binary + result;
		}
		System.out.println(result);

		return result;
	}
	// ¹3
	public static String decimalToSixteen(int number) {
		String result = "";
		short binary = 0;
		if(number < 0) {
			throw new ArithmeticException();
		}
		else if(number == 0) {
			result = "0";
		}
		while(number >= 1) {
			binary = (short)(number % 16);
			number /= 16;
			if(binary < 10) {
				result = binary + result;
			}
			else {
				switch(binary) {
				case 10: result = "A" + result;
				break;
				case 11: result = "B" + result;
				break;
				case 12: result = "C" + result;
				break;
				case 13: result = "D" + result;
				break;
				case 14: result = "E" + result;
				break;
				case 15: result = "F" + result;
				break;
				}
			}
		}
		System.out.println(result);

		return result;
	}

}


