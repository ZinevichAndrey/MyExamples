package Game_Life2;

import java.awt.Color;

import javax.swing.JFrame;

public class MainWindow extends JFrame {
	MainGame mainGame = new MainGame();
	
	
	public MainWindow() {
		// TODO Auto-generated constructor stub
		this.setup();
		this.creatMainPanel();
	}

	private void creatMainPanel() {
		MainPanel panel = new MainPanel(this.mainGame);
		this.add(panel);
	}

	private void setup() {
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.RED);
	}
}
