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
			case 1: System.out.println(this.getColor() + " ���� " + this.getName() + " ������ � ������ ��� �� ����� " + this.getAction());
			break;
			case 2: System.out.println(this.getColor() + " ������� �� ����� " + this.getName() + " ����� ������ ���� � " + this.getAction());
			break;
			case 3: System.out.println("������� ���� " + this.getColor() + " � ��� �� � ������ ��� " + this.getName() + " ��� ������ ��� �������� ������ ��� ��������� " + this.getAction());
			break;
			default:if(this.number >= 4) {
				System.out.println("�� ����� ����� �� �������� � ��������� ������������. ������� ������ �����:");
			}
			}
		}
		while(this.number >= 3);
	}

	public void init() {
		System.out.println("������� ����:");
		this.setColor();
		System.out.println("������� ���: ");
		this.setName();
		System.out.println("������� ��������: ");
		this.setAction();
		System.out.println("�������� ���� �� ��� ��������� �������:");
		this.choosingAQuest();
	}
}
