package Lessons;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class InfoPanelGuessTheNumber extends GuessTheNumber{

	protected JPanel infoPanel;
	private Color colorInfo;
	private JLabel numberOfAttemps, attemptNumber;
	private Font font;

	
	public InfoPanelGuessTheNumber() {
		// TODO Auto-generated constructor stub
		this.setup();
	}

	private void setup() {
		this.infoPanel = new JPanel();
		this.colorInfo = new Color(0,148,129);
		this.infoPanel.setBackground(colorInfo);
		this.infoPanel.setLayout(new BorderLayout());
		this.numberOfAttemps = new JLabel("Try to guess the number *_*");
		this.font = new Font("TimesRoman", Font.BOLD, 20);
		this.numberOfAttemps.setFont(font);
		this.numberOfAttemps.setForeground(Color.WHITE);
		this.infoPanel.add(this.numberOfAttemps, BorderLayout.PAGE_START);
		this.attemptNumber = new JLabel("Numbers:" + GuessTheNumber.count);
		this.attemptNumber.setFont(font);
		this.infoPanel.add(this.attemptNumber, BorderLayout.LINE_START);
		
		Timer timer = new Timer(200, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				attemptNumber.setText("attempt number ¹: " + count);
			}
		});
		timer.start();
	}


}
