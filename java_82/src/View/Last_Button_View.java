package View;

import java.awt.*;
import javax.swing.*;
import Control.Last_Button_Control;
import Model.Last_Button;

public class Last_Button_View  extends JFrame{
	private Last_Button lb;
	private JLabel jl;
	public Last_Button_View() throws HeadlessException {
		super();
		this.lb = new Last_Button(1);
		init();
		this.setVisible(true);
	}
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.setTitle("LAST_BUTTON");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
//		Tạo và thêm component
		Last_Button_Control ac = new Last_Button_Control(this);
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(2,2));
		
		Font font = new Font("Arial", Font.BOLD, 20);
		for(int i = 1;i<5;i++) {
			JButton jb = new JButton(i + "");
			jb.addActionListener(ac);
			jb.setFont(font);
			jp1.add(jb);
		}
		
		jl = new JLabel("------");
		jl.setFont(font);
		JPanel jp2 = new JPanel();
		jp2.add(jl);
		
//		Thêm vào Layout chính		
		this.add(jp1, BorderLayout.CENTER);
		this.add(jp2, BorderLayout.SOUTH);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void change_to_1() {
		lb.setValue_1();
		jl.setText("Last button: " + lb.getValue());
	}
	
	public void change_to_2() {
		lb.setValue_2();
		jl.setText("Last button: " + lb.getValue());
	}
	
	public void change_to_3() {
		lb.setValue_3();
		jl.setText("Last button: " + lb.getValue());
	}
	
	public void change_to_4() {
		lb.setValue_4();
		jl.setText("Last button: " + lb.getValue());
	}
	
}
