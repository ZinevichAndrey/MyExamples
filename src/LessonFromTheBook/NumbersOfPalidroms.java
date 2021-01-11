package LessonFromTheBook;

public class NumbersOfPalidroms {
	// Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
	// Numbers are palindromes whose values are the same in forward and reverse order.	

	public boolean getNumbersOfPalidroms(int numbers) {
		boolean result = true;
		String intToString = "";
		intToString = Integer.toString(numbers);
		char[] temp = new char[intToString.length()];
		char[] temp2 = new char[intToString.length()];

		for(int i = 0, j = temp.length - 1; i < temp.length; i++, j--) {
			temp[i] = intToString.charAt(i);
			temp2[j] = intToString.charAt(j);
			if(temp[i] == temp2[j]) {
				result = true;
			}
			else {
				return false;
			}
		}
		return result;
	}

}
