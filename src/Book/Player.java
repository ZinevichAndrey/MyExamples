package Book;

import java.util.Scanner;

public class Player {
	private int answer;

	public int getAnswer() {
		return this.answer;
	}

	public void setAnswer() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� �����: ");
		if(scan.hasNextInt()) {
			this.answer = scan.nextInt();
		}
		else {
			System.out.println("�� ����� �� �����!");
			this.setAnswer();
		}
	}


}
