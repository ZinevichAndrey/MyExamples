package nonsenseGame;

import java.util.Scanner;

public class GameLogic {

	Scanner scan = new Scanner(System.in);
	private String color = "";
	private String name = "";
	private String action = "";
	private int number = 0;

	private void setColor() {
		this.color = scan.nextLine();
	}

	private void setName() {
		this.name = scan.nextLine();
	}

	private void setAction() {
		this.action = scan.nextLine();
	}

	protected String getColor() {
		return this.color;
	}

	protected String getName() {
		return this.name;
	}

	protected String getAction() {
		return this.action;
	}

	private void setNumber() {
		this.number = scan.nextInt();
	}

	protected void choosingAQuest() {
		do {
			this.setNumber();
			switch(this.number) {
			case 1: System.out.println(this.getColor() + " пони " + this.getName() + " только и делала что всё время " + this.getAction());
			break;
			case 2: System.out.println(this.getColor() + " енотька по имени " + this.getName() + " очень любила есть и " + this.getAction());
			break;
			case 3: System.out.println("Катюшка была " + this.getColor() + " а так же её второе имя " + this.getName() + " своё второе имя получила потому что постоянно " + this.getAction());
			break;
			default:if(this.number >= 4) {
				System.out.println("Вы ввели число не входящее в квестовую состовляющую. Введите другое число:");
			}
			}
		}
		while(this.number >= 3);
	}

	public void init() {
		System.out.println("Введите цвет:");
		this.setColor();
		System.out.println("Введите имя: ");
		this.setName();
		System.out.println("Введите действие: ");
		this.setAction();
		System.out.println("Выберите одну из трёх доступных историй:");
		this.choosingAQuest();
	}
}
