package java_45;

public class Plane extends PhuongTien{
	private String Resource;
	public Plane(String type, HangSanXuat hSX,String R) {
		super(type, hSX);
		Resource = R;
		// TODO Auto-generated constructor stub
	}
	public void CatCanh() {
		System.out.println("Bat dau bay");
	}
	public void HaCanh() {
		System.out.println("Ket thuc bay");
	}
	@Override
	public double getSpeed() {
		return 300;
	}
	
}
