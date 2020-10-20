package graphic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Summator extends JFrame {
	/*Adder. Create an application that is a 640x480 shape.
	Place three text boxes and one button on the form
	"Payment". When the button is pressed, the values entered in the first two text
	the fields are added and the result is written in the third field.
	 */
	private	int width = 640;
	private	int heigth = 480;
	private	JTextField firstTxt, secondTxt;
	private	JLabel firstLabel, secondLabel, resultLabel, programmLabel, result;
	private JButton start;

	public Summator() {
		// TODO Auto-generated constructor stub
		JPanel panel = new JPanel();
		add(panel);
		setSize(width, heigth);
		setTitle("Summator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		firstTxt = new JTextField();
		this.firstTxt.setBounds(20, 150, 100, 25);
		panel.add(this.firstTxt);
		programmLabel = new JLabel("Summator programm");
		this.programmLabel.setOpaque(true);
		this.programmLabel.setBackground(Color.YELLOW);
		Font font = new Font("Times Roman", Font.BOLD, 30);
		this.programmLabel.setFont(font);
		this.programmLabel.setBounds(150, 20, 320, 80);
		panel.add(this.programmLabel);
		this.firstLabel = new JLabel("First number:");
		this.firstLabel.setForeground(Color.RED);
		this.firstLabel.setBounds(20, 110, 120, 50);
		panel.add(this.firstLabel);
		this.secondTxt = new JTextField();
		this.secondTxt.setBounds(250, 150, 100, 25);
		panel.add(this.secondTxt);
		this.secondLabel = new JLabel("Second number:");
		this.secondLabel.setForeground(Color.MAGENTA);
		this.secondLabel.setBounds(250, 110, 120, 50);
		panel.add(this.secondLabel);
		this.start = new JButton("Start");
		this.start.setBounds(400, 120, 120, 80);
		Font font1 = new Font("TimesRoman", Font.ITALIC, 35);
		this.start.setFont(font1);
		panel.add(this.start);
		this.resultLabel = new JLabel("Result :");
		this.resultLabel.setBounds(20, 250, 200, 100);
		this.resultLabel.setForeground(Color.GRAY);
		Font fontLabel = new Font("TimesRoman", Font.BOLD, 25);
		this.resultLabel.setFont(fontLabel);
		panel.add(this.resultLabel);
		this.result = new JLabel();
		this.result.setBounds(120, 250, 700, 100);
		this.result.setFont(fontLabel);
		panel.add(result);
		start.addActionListener(actionListene);
		panel.setLayout(new BorderLayout());
		setVisible(true);
	}

	ActionListener actionListene = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			try {
				double first = Double.parseDouble(firstTxt.getText());
				double second = Double.parseDouble(secondTxt.getText());
				double temp = first + second;
				String temp1 = String.valueOf(temp);
				result.setText(temp1);
			}
			catch(NumberFormatException ex) {
				result.setText("Incorrect value " + ex.getMessage());
			}
		}
	};


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Summator();
	}

}
