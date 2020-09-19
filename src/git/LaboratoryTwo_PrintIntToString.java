package git;

public class LaboratoryTwo_PrintIntToString {
	// n. For an arbitrary digit from 0 to 9, output its value to the console in words.
	// For example, for the number 9, the string "Nine" should be printed on the console.

	public static String PrintIntToString(int number) {
		String result = "";

		switch(number) {
		case 0: result = "Zero";
		break;
		case 1: result = "One";
		break;
		case 2: result = "Two";
		break;
		case 3: result = "Three";
		break;
		case 4: result = "Four";
		break;
		case 5: result = "Five";
		break;
		case 6: result = "Six";
		break; 
		case 7: result = "Seven";
		break;
		case 8: result = "Eigth";
		break;
		case 9: result = "Nine";
		break;
		case 10: result = "Ten";
		break;
		default: 
			System.out.println("Wrong number");
		}
		System.out.println(result);
		return result;
	}
}
