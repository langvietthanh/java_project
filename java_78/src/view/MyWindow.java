package view;

import javax.swing.JFrame;

public class MyWindow extends JFrame{
	public MyWindow() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void Show() {
		this.setVisible(true);
	}
	public void set_title(String s) {
		this.setTitle(s);
		this.setVisible(true);
	}
	public void set_size(String s,int width,int height) {
		this.setTitle(s);
		this.setSize(width,height);
		this.setVisible(true);
	}
	public void set_location(int x,int y) {
		this.setLocation(x,y);
	}
	
	public static void main(String[] args) {
		MyWindow mw = new MyWindow();
		
		mw.set_size("Test", 600, 400);
		mw.set_location(500,300);
		
	}
	
}
