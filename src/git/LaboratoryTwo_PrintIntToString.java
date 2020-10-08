package git;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LaboratoryTwo_PrintIntToString {
	// n. For an arbitrary digit from 0 to 9, output its value to the console in words.
	//	For example, for the number 9, the string "Nine" should be printed to frame.

	private int height;
	private int width;
	private JFrame frame;
	private JPanel panel;
	private JLabel label, label2;
	private Font font;
	private JTextField textField, resultTextField;
	private JButton button;

	public void runProgramm() {
		this.setWidthAndHeight(600, 400);
		this.initWindow();
	}

	public void setWidthAndHeight(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}


	private void initWindow()	{
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(new FlowLayout());
		frame.setTitle("Print int to String");
		frame.setSize(getWidth(), getHeight());
		frame.setLocationRelativeTo(null);
		font = new Font("Arial", Font.BOLD, 74);
		panel.setFont(font);
		label = new JLabel("Enter a number from 0 before 9 :");
		panel.add(label);
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(60, 20));
		panel.add(textField);
		resultTextField = new JTextField();
		resultTextField.setPreferredSize(new Dimension(90,20));
		button = new JButton("Start");
		panel.add(button);
		label2 = new JLabel("Result:");
		panel.add(label2);
		panel.add(resultTextField);
		button.addActionListener(listener);
		frame.setVisible(true);
	}

	ActionListener listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			try {
				int temp = Integer.parseInt(textField.getText());
				String tempOne = printIntToString(temp);
				resultTextField.setText(tempOne);
			}
			catch(Exception ae) {
				resultTextField.setText("Incorrect value");
			}
		}
	};

	public static String printIntToString(int number) {
		String result = "";

		switch(number) {
		case 0: result = "Zero";
		break;
		case 1: result = "One";
		break;
		case 2: result = "Two";
		break;
		case 3: result = "Three";
		break;
		case 4: result = "Four";
		break;
		case 5: result = "Five";
		break;
		case 6: result = "Six";
		break; 
		case 7: result = "Seven";
		break;
		case 8: result = "Eigth";
		break;
		case 9: result = "Nine";
		break;
		case 10: result = "Ten";
		break;
		default: 
			result = "Wrong number";
		}
		return result;
	}
}
