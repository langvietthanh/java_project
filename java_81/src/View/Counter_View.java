package View;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.Counter_Listener;
import Model.Counter_Model;

public class Counter_View extends JFrame{
	private Counter_Model counterModel;
	private JButton but_up;
	private JButton but_down;
	private JLabel jlb_value; // Nhãn dán cho giá trị Counter
	
	public Counter_View() {
		super();
		this.counterModel = new Counter_Model();
		this.init();
		this.setVisible(true);
	}
	
//	Khởi tạo cửa sổ giao diện 
	public void init() {
		this.setTitle("COUNTER");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Đưa "đối tượng giao diện" hiện tại được thao tác cho đối tượng Counter_Listener để hiểu
		ActionListener al = new Counter_Listener(this);
		
		but_up = new JButton("UP");
		but_up.addActionListener(al);
		
		but_down = new JButton("DOWN");
		but_down.addActionListener(al);
		
		jlb_value = new JLabel(counterModel.getValue()+"",JLabel.CENTER);
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		jp.add(but_down, BorderLayout.EAST);
		jp.add(but_up, BorderLayout.WEST);
		jp.add(jlb_value, BorderLayout.CENTER);
		
		this.setLayout(new BorderLayout());
		this.add(jp,BorderLayout.CENTER);
	}
//		Tăng/giảm value của đối tượng counterModel
//		Phải có setText để thay dổi phần hiển thị giá trị
	public void increment() {
		this.counterModel.Increment();
		this.jlb_value.setText(this.counterModel.getValue()+"");
	}
	
	public void decrement() {
		counterModel.Decrement();
		this.jlb_value.setText(this.counterModel.getValue()+"");
	}
	
}
