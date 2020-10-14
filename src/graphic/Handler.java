package graphic;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Handler implements ActionListener {

	private Button ba, bb;
	String temp;

	public Handler(Button b1, Button b2) {
		// TODO Auto-generated constructor stub
		this.ba = b1;
		this.bb = b2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		temp = ba.getLabel();
		ba.setLabel(bb.getLabel());
		bb.setLabel(temp);
	}

}
