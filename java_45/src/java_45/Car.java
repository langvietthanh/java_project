package java_45;

public class Car extends PhuongTien{
	private String Resource;
	public Car(String t,HangSanXuat h,String R) {
		super(t,h);
		Resource =R;
	}
	public double getSpeed() {
		return 100;
	}
}
