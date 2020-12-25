package nonsenseGame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Window extends JFrame {

	private JPanel panel;
	private JButton buttonStart;
	private JLabel labelInfo;
	private JTextField textAnswer;
	private String answerColor = "";
	private String answerName = "";
	private String answerAction = "";
	private int answerQuest = 0;
	private GameStatus gameStatus = GameStatus.NEW_GAME;

	public Window() {
		// TODO Auto-generated constructor stub
		this.setSize(600,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Game for fun :)");
		this.panel = new JPanel();
		this.add(this.panel);
		this.panel.setLayout(new GridLayout(3,0));
		this.labelInfo = new JLabel("����� ����", SwingConstants.CENTER);
		this.panel.add(this.labelInfo);
		this.textAnswer = new JTextField();
		this.textAnswer.setHorizontalAlignment(JTextField.CENTER);
		this.textAnswer.requestFocus();
		this.textAnswer.selectAll();
		this.panel.add(this.textAnswer);
		this.buttonStart = new JButton("Start");
		this.panel.add(this.buttonStart);

		this.setVisible(true);
		this.buttonStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				buttonStart.setText("Next");

				if(event.getSource() == buttonStart) {
					updateGameStatus();
				}
			}
		});
	}

	public void updateGameStatus() {
		switch(this.gameStatus) {
		case NEW_GAME: 
			this.setColor();
			this.gameStatus = GameStatus.SETUP_1;
			break;
		case SETUP_1:
			this.setName();
			this.gameStatus = GameStatus.SETUP_2;
			break;
		case SETUP_2:
			this.setAction();
			this.gameStatus = GameStatus.SETUP_3;
			break;
		case SETUP_3:
			this.setNumber();
			this.gameStatus = GameStatus.PLAY;
			break;
		case PLAY:
			this.choosingAQuest();
			this.gameStatus = GameStatus.NEW_GAME;
			break;
		}	
	}

	public void setColor() {
		this.textAnswer.requestFocus();
		this.textAnswer.selectAll();
		this.labelInfo.setText("������� ����:");
		this.answerColor = this.textAnswer.getText();
	}

	public void setName() {
		this.textAnswer.requestFocus();
		this.textAnswer.selectAll();
		this.labelInfo.setText("������� ���:");
		this.answerName = this.textAnswer.getText();
	}

	public void setAction() {
		this.textAnswer.requestFocus();
		this.textAnswer.selectAll();
		this.labelInfo.setText("������� ��������:");
		this.answerAction = this.textAnswer.getText();
	}

	public void setNumber() {

		this.textAnswer.requestFocus();
		this.textAnswer.selectAll();
		this.labelInfo.setText("�������� ���� �� ��� �������:");
		// ����� ������� �������� ������� ���������� ���������� ����!!!
		try {
			this.answerQuest = Integer.parseInt(this.textAnswer.getText());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	protected void choosingAQuest() {
		
		switch(this.answerQuest) {
		case 1: 
			this.labelInfo.setText(this.answerColor + " ���� " + this.answerName + " ������ � ������ ��� �� ����� " + this.answerAction);
			break;
		case 2: 
			this.labelInfo.setText(this.answerColor + " ������� �� ����� " + this.answerName + " ����� ������ ���� � " + this.answerAction);
			break;
		case 3: 
			this.labelInfo.setText("������� ���� " + this.answerColor + " � ��� �� � ������ ��� " + this.answerName + " ��� ������ ��� �������� ������ ��� ��������� " + this.answerAction);
			break;
		default:if(this.answerQuest >= 4) {
			this.labelInfo.setText("�� ����� ����� �� �������� � ��������� ������������. ������� ������ �����:");
		}
		}
	}

}

enum GameStatus{
	NEW_GAME,
	SETUP_1,
	SETUP_2,
	SETUP_3,
	PLAY;
}
