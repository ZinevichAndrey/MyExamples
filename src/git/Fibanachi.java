package git;
import java.math.BigInteger;

public class Fibanachi {
	//task ¹7 Create a Fibonacci array up to 20.
	static int getFibanachi(int number) {
		int firstNomber = 1;
		int secondNomber = 1;
		int result = 0;

		for(int i = 3; i <= number; i++) {
			result = firstNomber + secondNomber;
			firstNomber = secondNomber;
			secondNomber = result;
		}

		return result;
	}


}
