package Game_Life2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cell extends JFrame	implements MouseListener, MouseMotionListener	{
	
	int mouseX = 0;
	int mouseY = 0;
	
	
//	Cell(){
//		LiveOrDead live = LiveOrDead.LIVE;
//	}
	
	public Cell() {
		// TODO Auto-generated constructor stub
		JPanel panel = new JPanel();
		add(panel);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Test clicked mouse");
		setVisible(true);	
		init();
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillOval(mouseX, mouseY, 25, 25);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX();
		mouseY = e.getY();
		repaint();
	}
	
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
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

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
