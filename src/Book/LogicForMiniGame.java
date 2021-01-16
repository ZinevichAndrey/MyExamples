package Book;

public class LogicForMiniGame {

	private int guessTheNumber;
	private Player p1;
	private Player p2;
	private int max = 100;
	private int min = 0;

	private int getRandomNumber() {
		return this.guessTheNumber = (int)(Math.random() * (max - min + 1)) + min;
	}

	public void answersThePlayers() {
		p1 = new Player();
		p2 = new Player();
		this.getRandomNumber();

		while(true) {
			System.out.println("Ответ первого игрока:");
			p1.setAnswer();
			if(p1.getAnswer() != this.guessTheNumber) {
				System.out.println("Неверный ответ:");
				this.getValueRandom(p1);
			}
			else {
				System.out.println("Вы победили");
				return;
			}
			System.out.println("Ответ второго игрока:");
			p2.setAnswer();
			if(p2.getAnswer() != this.guessTheNumber) {
				System.out.println("Неверный ответ:");
				this.getValueRandom(p2);
			}
			else {
				System.out.println("Вы победили");
				return;
			}
		}

	}

	private void getValueRandom(Player player) {
		if(player.getAnswer() > this.guessTheNumber) {
			System.out.println("Число меньше");
		}
		else if(player.getAnswer() < this.guessTheNumber) {
			System.out.println("Число больше");
		}
	}

}
