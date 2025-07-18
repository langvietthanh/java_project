package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.Counter_View;

// Counter_Listener hiện thực lại interface ActionListener để có thể hiểu được thao tác của của người dùng với giao diện
public class Counter_Listener implements ActionListener{
	private Counter_View ctv;
	
	public Counter_Listener(Counter_View ctv) {
		super();
		this.ctv = ctv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
//		Lấy TÊN của nút được ấn
		String str = e.getActionCommand();
		
//		System.out.println("ban da an nut "+str);
		
		if(str.compareTo("UP") == 0) {
			ctv.increment();
		}
		if(str.compareTo("DOWN") == 0) {
			ctv.decrement();
		}
	}
	
}
