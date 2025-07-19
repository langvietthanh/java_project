package Control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.View_Color;

public class Control_Color implements ActionListener{
	private View_Color vc;
	public Control_Color(View_Color vc) {
		super();
		this.vc = vc;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String E = e.getActionCommand();
		if (E.equals("RED")) {
			vc.Change_Char(Color.RED);
		}
		if (E.equals("BLUE")) {
			vc.Change_Char(Color.BLUE);
		}
		if (E.equals("YELLOW")) {
			vc.Change_Char(Color.YELLOW);
		}
		if (E.equals("red")) {
			vc.Change_Back(Color.RED);
		}
		if (E.equals("blue")) {
			vc.Change_Back(Color.BLUE);
		}
		if (E.equals("yellow")) {
			vc.Change_Back(Color.YELLOW);
		}

	}
	
}
