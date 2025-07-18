package view;
import java.awt.*;
import javax.swing.*;

public class CALCULATOR extends JFrame{

	public CALCULATOR(){
		this.setTitle("Calculator");
		this.setSize(300,190);
		this.setLocationRelativeTo(null);
//=======================================================================		

//		JPanel như cửa sổ con trong của sổ chính, có thể chỉnh bố cục (Layout) của cửa sổ con 

//		Tạo cửa sổ con cho text
		JPanel jp_text = new JPanel();
		
//		Chỉnh bố cục cho cửa sổ con
		jp_text.setLayout(new BorderLayout());
		
//		Tạo phần text
		JTextField jtf = new JTextField();
		jp_text.add(jtf, BorderLayout.CENTER);
//=======================================================================		
		
//		Tạo các phím bấm của máy tính
		JButton but0 = new JButton("0");
		JButton but1 = new JButton("1");
		JButton but2 = new JButton("2");
		JButton but3 = new JButton("3");
		JButton but4 = new JButton("4");
		JButton but5 = new JButton("5");
		JButton but6 = new JButton("6");
		JButton but7 = new JButton("7");
		JButton but8 = new JButton("8");
		JButton but9 = new JButton("9");
		JButton but_c = new JButton("+");
		JButton but_t = new JButton("-");
		JButton but_n = new JButton("x");
		JButton but_C = new JButton("/");
		JButton but_b = new JButton("=");
		
//		Tạo cửa sổ con cho phím 
		JPanel jp_buttons = new JPanel();
		
//		Chỉnh bố cục cho cho cửa sổ con
		jp_buttons.setLayout(new GridLayout(5,3));
		
//		Thêm các phím vào cửa sổ con 
		jp_buttons.add(but0);
		jp_buttons.add(but1);
		jp_buttons.add(but2);
		jp_buttons.add(but3);
		jp_buttons.add(but4);
		jp_buttons.add(but5);
		jp_buttons.add(but6);
		jp_buttons.add(but7);
		jp_buttons.add(but8);
		jp_buttons.add(but9);
		jp_buttons.add(but_c);
		jp_buttons.add(but_t);
		jp_buttons.add(but_n);
		jp_buttons.add(but_C);
		jp_buttons.add(but_b);
		
		BorderLayout bl =new BorderLayout();
//		Set cửa sổ theo BorderLayout
		this.setLayout(bl); // ==  this.setLayout(new BorderLayout())
//		Phần text ở phía bắc
		this.add(jp_text, BorderLayout.NORTH);
//		Phần phím ở phía nam
		this.add(jp_buttons, BorderLayout.SOUTH);
		
//=======================================================================		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		try {
//			Các cách hiển thị của các hệ điều hành :
//			com.sun.java.swing.plaf.gtk.GTKLookAndFeel
//			com.sun.java.swing.plaf.motif.MotifLookAndFeel
//			com.sun.java.swing.plaf.windows.WindowsLookAndFeel
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			
//			Khuyến khích sử dụng vì phù hợp với hệ điều hành máy tính
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new CALCULATOR();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
