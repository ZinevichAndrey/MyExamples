package LessonFromTheBook;

public class WithoutTheSameNumbers {

	// Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
	//All three-digit numbers that do not have the same decimal notation.
	public void withoutTheSameNumbers(int...numbers) {
		String temp = "";
		for(int i = 0; i < numbers.length; i++) {
			temp = String.valueOf(numbers[i]);
			if(temp.charAt(0) != temp.charAt(1) && temp.charAt(0) != temp.charAt(2)) {
				System.out.println(numbers[i]);
			}
		}
	}
}
