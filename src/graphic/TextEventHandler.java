package graphic;

import java.awt.Button;
import javax.swing.JFrame;

public class TextEventHandler extends JFrame {

	public TextEventHandler(String s) {
		// TODO Auto-generated constructor stub
		super(s);
		setLayout(null);
		setSize(400, 280);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Button b1 = new Button("First button");
		b1.setBounds(2, 5, 96, 22);
		add(b1);
		Button b2 = new Button("Second button");
		b2.setBounds(2, 100, 96, 22);
		add(b2);
		b1.addActionListener(new Handler(b1, b2));
		b2.addActionListener(new Handler(b1, b2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextEventHandler("");
	}

}
