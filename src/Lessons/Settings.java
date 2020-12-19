package Lessons;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Settings extends JFrame {

	private CenterPanel centerPanel;
	private InfoPanelGuessTheNumber infoPanel;
	
	public Settings() {
		// TODO Auto-generated constructor stub
		this.infoPanel = new InfoPanelGuessTheNumber();
		this.centerPanel = new CenterPanel();
		this.setTitle("Game Guess the number!");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.add(centerPanel.gamePanel, BorderLayout.CENTER);
		this.add(infoPanel.infoPanel, BorderLayout.EAST);
		this.infoPanel.infoPanel.setPreferredSize(new Dimension(300, 600));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
