package view;

import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
//		Kích thước
		jf.setSize(600,400);
		
//		Tiêu đề
		jf.setTitle("TEST");
		
//		while(true) {
//			System.out.println("run");
//		}
		
//		Gắn vị trí hiển thị
		jf.setLocation(500,300);
		
//		Thoát chương trình khi đóng cửa sổ Jframe
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Cho phép hiển thị
		jf.setVisible(true);
	}
}
