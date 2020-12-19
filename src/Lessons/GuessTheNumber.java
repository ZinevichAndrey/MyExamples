package Lessons;

public class GuessTheNumber {

	private int number;
	protected int result = 0;
	protected static int count = 0;

	private int generatedRandomNumber() {
		int min = -100;
		int max = 100;
		return (int)(Math.random() * (max - min + 1) + min);
	}

	public void startNewGame() {
		this.number = this.generatedRandomNumber();
		
	}
	
	public int getNumber() {
		return this.number;
	}

	public static int increaseCount() {
		count++;
		return count;
	}



}
