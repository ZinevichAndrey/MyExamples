package git;
import java.math.BigInteger;

public class Fibanachi {
	//task ¹7 Create a Fibonacci method.
	static BigInteger getFibanachi(int number) {
		BigInteger result = BigInteger.valueOf(1);
		BigInteger firstNomber = BigInteger.valueOf(1);
		BigInteger secondNomber = BigInteger.valueOf(1);

		if(number <= 0) {
			return result.valueOf(0);
		}
		else if(number == 1) {
			return result.valueOf(1);
		}
		else if(number == 2) {
			return result.valueOf(1);
		}
		else if(number >= 46) {
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
