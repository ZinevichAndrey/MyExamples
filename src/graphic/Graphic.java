package graphic;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

//A program for drawing a sine, cosine, parabola.

public class Graphic extends JFrame {

	public Graphic(String s) {
		// TODO Auto-generated constructor stub
		super(s);
		setLayout(null);
		setSize(640, 480);
		setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		Button sin = new Button("Sin");
		sin.setBounds(5, 20, 100, 25);
		add(sin);
		Button cosinus = new Button("Cosinus");
		cosinus.setBounds(5, 70, 100, 25);
		add(cosinus);
		Button x2 = new Button("Parabola");
		x2.setBounds(5, 120, 100, 25);
		add(x2);

		sin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Sinus("Sinus");
			}
		});
		cosinus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Cosinus("Cosinus");
			}
		});
		x2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new X2("Parabola");
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Graphic("Graphic");
	}

}
