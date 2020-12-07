package Game_Life2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	private MainGame mainGame;
	private TopPanel topPanel;
	private InfoPanel infoPanel;
	private GamePanel gamePanel;
	
	
	
	public MainPanel(MainGame mainGame) {
		// TODO Auto-generated constructor stub
		this.mainGame = mainGame;
		this.setBackground(Color.GREEN);
		this.setup();
	}

	private void setup() {
		this.topPanel = new TopPanel(this.mainGame.gameSettings, this);
		this.infoPanel = new InfoPanel();
		this.gamePanel = new GamePanel(this.mainGame);
		this.setLayout(new BorderLayout());
		this.add(this.topPanel, BorderLayout.PAGE_START);
		this.add(this.infoPanel, BorderLayout.LINE_END);
		this.add(this.gamePanel, BorderLayout.CENTER);
		this.topPanel.setPreferredSize(new Dimension(50, 50));
		this.infoPanel.setPreferredSize(new Dimension(200, 200));
		

		
	}
	public void update() {
		if(this.gamePanel != null) {
			this.gamePanel.update();
		}
		
	}
	
	

}
