package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.Last_Button_View;

public class Last_Button_Control implements ActionListener{
	private Last_Button_View lbv;
	
	public Last_Button_Control(Last_Button_View lbv) {
		super();
		this.lbv = lbv;
	}
	public void actionPerformed(ActionEvent e) {
		String Event = e.getActionCommand();
		
		if (Event.equals("1")) {
			lbv.change_to_1();
		}
		
		if (Event.equals("2")) {
			lbv.change_to_2();
		}
		
		if (Event.equals("3")) {
			lbv.change_to_3();
		}
		
		if (Event.equals("4")) {
			lbv.change_to_4();
		}
		
	}
	
}
