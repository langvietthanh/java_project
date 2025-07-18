package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.concurrent.Flow;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Test extends JFrame{
	
	public Test() {
		this.setTitle("Test FlowLayout");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		
//		Set layout

//		FLOWLAYOUT
		
//		FlowLayout fl = new FlowLayout();this.setLayout(fl);
//		FlowLayout fl1 = new FlowLayout(FlowLayout.LEFT,50,50);this.setLayout(fl1);
//		FlowLayout fl2 = new FlowLayout(FlowLayout.CENTER);this.setLayout(fl2);

		JButton but1 = new JButton("Button 1");
		JButton but2 = new JButton("Button 2");
		JButton but3 = new JButton("Button 3");
		JButton but4 = new JButton("Button 4");
		
////		add component
//		this.add(but1);
//		this.add(but2);
//		this.add(but3);
//		this.add(but4);		
		
//		GRIDLAYOUT
		
//		GridLayout gl = new GridLayout();
//		GridLayout gl1 = new GridLayout(4, 4); 
//		GridLayout gl2 = new GridLayout(4, 4, 25, 25);
//		
//		this.setLayout(gl2);
//		
//		for(int i=1;i<=16;i++) {
//			JButton but_i = new JButton(i+"");
//			this.add(but_i);
//		}
		
//		BORDERLAYOUT
		BorderLayout bl = new BorderLayout() ;
		BorderLayout bl1 = new BorderLayout(25, 25) ;
		
		this.setLayout(bl1);
		
		this.add(but1, BorderLayout.NORTH);
		this.add(but2, BorderLayout.SOUTH);
		this.add(but3, BorderLayout.WEST);
		this.add(but4, BorderLayout.EAST);		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Test();
	}
}
