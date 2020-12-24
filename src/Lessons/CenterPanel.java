package Lessons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CenterPanel implements ActionListener {

	protected JPanel gamePanel;
	private Color color;
	private JButton answerButton, startGame;
	private JLabel userAnswerLabel;
	private JTextField answerTextField;
	private Font fontForLabel;
	private GuessTheNumber guessTheNumber;
	private boolean flag = false;

	public CenterPanel() {
		// TODO Auto-generated constructor stub
		this.setup();
		this.guessTheNumber = new GuessTheNumber();
	}

	private void setup() {
		this.gamePanel = new JPanel();
		this.color = new Color(216,176,238);
		this.gamePanel.setBackground(color);
		this.gamePanel.setLayout(null);
		this.startGame = new JButton("Start");
		this.fontForLabel = new Font("Comic Sans MS", Font.BOLD, 20);
		this.startGame.setFont(fontForLabel);
		this.startGame.setBounds(160, 50, 160, 80);
		this.gamePanel.add(startGame);
		this.userAnswerLabel = new JLabel("Enter a number from -100 to 100");
		this.userAnswerLabel.setBounds(0, 120, 420, 60);
		this.userAnswerLabel.setFont(fontForLabel);
		this.gamePanel.add(userAnswerLabel);
		this.answerTextField = new JTextField();
		this.answerTextField.setBounds(180, 220, 120, 60);
		this.answerTextField.setFont(fontForLabel);
		this.gamePanel.add(answerTextField);
		this.answerButton = new JButton("Suppose");
		this.answerButton.setBounds(120, 320, 240, 120);
		this.answerButton.setFont(fontForLabel);
		this.gamePanel.add(answerButton);
		this.answerButton.addActionListener(this);
		this.startGame.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.startGame) {
			this.guessTheNumber.startNewGame();
			this.userAnswerLabel.setText("Let's play baby !");
			this.flag = true;
		}
		else if(this.flag != true) {
			this.userAnswerLabel.setText("Error! Press Start!");
		}
		else if(e.getSource() == this.answerButton) {
			int temp = Integer.parseInt(this.answerTextField.getText());
			this.answerTextField.requestFocus();
			this.answerTextField.selectAll();
			if(this.guessTheNumber.getNumber() != temp) {
				GuessTheNumber.increaseCount();
				if(this.guessTheNumber.getNumber() < temp) {
					this.userAnswerLabel.setText("You're taking it too high baby!");
				}
				else if(this.guessTheNumber.getNumber() > temp) {
					this.userAnswerLabel.setText("You're weak, but not to the same extent!");
				}
			}
			else {
				this.userAnswerLabel.setText("Congratulations baby!!!");
			}
		}
	}






}
