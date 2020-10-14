package graphic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import javax.swing.JFrame;

//Create a 500 by 500 shape and draw a house on it.

public class House extends JFrame {

	public House(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		setLayout(null);
		setSize(800, 900);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Label label = new Label("Welcome to my house");
		label.setBounds(10, 10, 230, 50);
		Font f1 = new Font("TimesRoman", Font.BOLD, 22);
		label.setFont(f1);
		label.setBackground(Color.YELLOW);
		add(label);
		setVisible(true);
	}

	public void paint(Graphics gr) {
		gr.setColor(Color.BLACK);
		gr.drawRect(150, 350, 450, 300);
		gr.drawLine(200, 650, 200, 780);
		gr.drawLine(200, 780, 140, 820);
		gr.drawLine(200, 780, 186, 820);
		gr.drawLine(200, 780, 240, 820);
		gr.drawLine(550, 650, 550, 780);
		gr.drawLine(550, 780, 590, 820);
		gr.drawLine(550, 780, 530, 820);
		gr.drawLine(550, 780, 490, 820);
		gr.drawRoundRect(220, 400, 60, 80, 10, 10);
		gr.drawRoundRect(480, 400, 60, 80, 10, 10);
		gr.drawRoundRect(320, 520, 100, 130, 40, 10);
		gr.drawOval(330, 580, 10, 10);
		gr.drawLine(130, 360, 370, 150);
		gr.drawLine(620, 360, 370, 150);
		gr.drawLine(140, 350, 610, 350);
		gr.drawOval(340, 250, 65, 75);
		gr.drawLine(520, 275, 520, 200);
		gr.drawLine(560, 310, 560, 200);
		gr.drawOval(515, 195, 50, 5);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new House("My House");
	}

}
