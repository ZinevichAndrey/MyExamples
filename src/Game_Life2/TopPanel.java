package Game_Life2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class TopPanel extends JPanel implements ActionListener {

	private GameSettings gameSettings;

	private JButton initButton; 
	private JButton startButton; 
	private JButton exitButton; 
	private JTextField currentXTextField;
	private JTextField currentYTextField;
	private JLabel currentXInfoLabel;
	private JLabel currentYInfoLabel;
	private MainPanel mainPanel;
	
	
	public void setGameSettings(GameSettings gameSettings) {
		this.gameSettings = gameSettings;
		this.update();
	}

	public TopPanel(GameSettings gameSettings, MainPanel mainPanel) {
		// TODO Auto-generated constructor stub
		this.gameSettings = gameSettings;
		this.mainPanel = mainPanel;
		this.setBackground(Color.BLUE);
		this.setup();
		this.update();
	}
	




	private void setup() {
		this.initButton = new JButton("Init");
		this.startButton = new JButton("Start");
		this.exitButton = new JButton("Exit");
		this.initButton.setPreferredSize(new Dimension(70,40));
		this.currentXInfoLabel = new JLabel("Nomber of rows(X):");
		this.currentYInfoLabel = new JLabel("Nomber of lines(Y):");
		this.currentXTextField = new JTextField();
		this.currentYTextField = new JTextField();
		this.currentXInfoLabel.setForeground(Color.WHITE);
		this.currentYInfoLabel.setForeground(Color.WHITE);
		this.currentXTextField.setPreferredSize(new Dimension(100, 30));
		this.currentYTextField.setPreferredSize(new Dimension(100, 30));
		this.add(this.currentXInfoLabel);
		this.add(this.currentXTextField);
		this.add(this.currentYInfoLabel);	
		this.add(this.currentYTextField);
		this.add(this.initButton);
		this.add(this.startButton);
		this.add(this.exitButton);
		this.initButton.addActionListener(this);
		this.startButton.addActionListener(this);
		this.exitButton.addActionListener(this);
		this.currentXTextField.addActionListener(this);
		this.currentYTextField.addActionListener(this);
		
	}

	public void update() {
		//this.currenXTextField.getText();
		this.currentXTextField.setText(String.valueOf(this.gameSettings.getLineCountXValue()));
		this.currentYTextField.setText(String.valueOf(this.gameSettings.getLineCountYValue()));
		if(this.gameSettings.getIsGameRunning()) {
			this.startButton.setText("Stop");
		}
		else {
			this.startButton.setText("Start");
		}
		this.mainPanel.update();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.initButton) {
			System.out.println("Init");
			this.gameSettings.setIsGameRunning(!this.gameSettings.getIsGameRunning());
		}
		else if(e.getSource() == this.startButton) {
			System.out.println("Start");
		//	this.gameSettings.setIsGameRunning(!this.gameSettings.getIsGameRunning());
		}
		else if(e.getSource() == this.exitButton) {
			System.exit(0);
		} 

		this.gameSettings.setLineCountXValue(Integer.valueOf(this.currentXTextField.getText()));
		this.gameSettings.setLineCountYValue(Integer.valueOf(this.currentYTextField.getText()));
		this.update();
	}
}
