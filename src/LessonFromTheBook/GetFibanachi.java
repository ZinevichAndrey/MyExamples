package LessonFromTheBook;

import java.math.BigInteger;

public class GetFibanachi {

	// Numbers Fibanachi
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
}
