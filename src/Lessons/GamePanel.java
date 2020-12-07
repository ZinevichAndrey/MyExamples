package Game_Life2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements MouseListener {

	private JLabel label;
	private MainGame mainGame;
	
	public GamePanel(MainGame mainGame) {
		// TODO Auto-generated constructor stub
		this.mainGame = mainGame;
		this.setBackground(Color.WHITE);
		this.label = new JLabel("Super puper game");
		this.label.setForeground(Color.RED);
		this.add(this.label);
		
		 
		
		
	}
	public void update() {
		System.out.println("repaint");
		this.repaint();
	}
	
	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		
		if(this.mainGame.gameSettings.getIsGameRunning() == false) {
			return;
		}
		Dimension size = this.getSize();
		int x = size.width / this.mainGame.gameSettings.getLineCountXValue();
		int y = size.height / this.mainGame.gameSettings.getLineCountYValue();
		
		for(int i = 0; i < this.mainGame.gameSettings.getLineCountXValue(); i++) {
			graphics.drawLine((i + 1) * x, 0, (i + 1) * x, size.height);
			graphics.drawLine(0, (i + 1) * y, size.width, (i + 1) * y);
		}
		graphics.setColor(Color.GREEN);
		graphics.fillOval(50, 50, 25, 25);
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}
