package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Control.Control_Color;
import Model.Model_Color;


//String color[] = {"Red,Blue,Yellow,Green,Orange,Black"}; 
//Color cl[] = {Color.RED,Color.BLUE,Color.YELLOW,Color.GREEN,Color.ORANGE,Color.BLACK};
//for(int i=0;i<6;i++) {
//	JButton jb = new JButton(color[i]);
//	jb.setFont(font);
//	jb.setForeground(cl[i]);
//	jp2.add(jb);
//	jb.addActionListener(CC);
//}

public class View_Color extends JFrame{
	private Model_Color mc;
	private JLabel jl;
	
	public View_Color() throws HeadlessException {
		super();
		this.mc = new Model_Color();
		this.setLayout(new BorderLayout());
		init();
	}
	
	public void init() {
		this.setTitle("MY COLOR");
		this.setSize(600,300);
		this.setLocationRelativeTo(null);
		
		Control_Color CC = new Control_Color(this);
		
		Font f = new Font("Arial", Font.BOLD, 35);
//		Create and add component
		jl = new JLabel("TEXT");
		jl.setFont(f);
		
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(2,3));
		
		Font font = new Font("Arial", Font.BOLD, 25);
		
//		Nút thay màu chữ
		JButton But_Red = new JButton("RED");But_Red.setFont(font);
		JButton But_Blue = new JButton("BLUE");But_Blue.setFont(font);
		JButton But_Yellow = new JButton("YELLOW");But_Yellow.setFont(font);
		
//		Thay màu chữ
		But_Red.setForeground(Color.RED);But_Red.addActionListener(CC);
		But_Blue.setForeground(Color.BLUE);But_Blue.addActionListener(CC);
		But_Yellow.setForeground(Color.YELLOW);But_Yellow.addActionListener(CC);
		jp.add(But_Red);jp.add(But_Blue);jp.add(But_Yellow);
		
//		Nút thay màu nền
		JButton But_red = new JButton("red");But_red.setFont(font);But_red.addActionListener(CC);
		JButton But_blue = new JButton("blue");But_blue.setFont(font);But_blue.addActionListener(CC);
		JButton But_yellow = new JButton("yellow");But_yellow.setFont(font);But_yellow.addActionListener(CC);
		
//		Thay nền
		But_red.setBackground(Color.RED);
		But_blue.setBackground(Color.BLUE);
		But_yellow.setBackground(Color.YELLOW);
		jp.add(But_red);jp.add(But_blue);jp.add(But_yellow);
		
		this.add(jl, BorderLayout.NORTH);
		this.add(jp, BorderLayout.CENTER);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
//	public void Change_Red_Char() {
//		mc.setForeground(Color.RED);
//		jl.setForeground(Color.RED);
//	}
//	public void Change_Blue_Char() {
//		mc.setForeground(Color.BLUE);
//		jl.setForeground(Color.BLUE);
//	}
//	public void Change_Yellow_Char() {
//		mc.setForeground(Color.YELLOW);
//		jl.setForeground(Color.YELLOW);
//	}
//	public void Change_Red_Back() {
//		//mc.setBackground(Color.RED);
//		jl.setBackground(Color.RED);
//		jl.setOpaque(true);
//	}
//	public void Change_Blue_Back() {
//		//mc.setBackground(Color.BLUE);
//		jl.setBackground(Color.BLUE);
//		jl.setOpaque(true);
//	}
//	public void Change_Yellow_Back() {
//		//mc.setBackground(Color.YELLOW);
//		jl.setBackground(Color.YELLOW);
//		jl.setOpaque(true);
//	}
	
	public void Change_Char(Color c) {
		jl.setForeground(c);
	}
	
	public void Change_Back(Color c) {
		jl.setBackground(c);
		jl.setOpaque(true);
	}
}
