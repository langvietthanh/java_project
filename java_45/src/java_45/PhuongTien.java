package java_45;

public abstract class PhuongTien {
	protected String Type;
	protected HangSanXuat HSX;
	public PhuongTien(String type, HangSanXuat hSX) {
		super();
		Type = type;
		HSX = hSX;
	}
	
	public String Ten_Hang() {
		return HSX.getName();
	}
	public String getType() {
		return Type;
	}

	public void Start() {
		System.out.println("Bat Dau");
	}
	public void SpeedUp() {
		System.out.println("Tang Toc");
	}
	public void Stop() {
		System.out.println("Dung Lai");
	}
	public abstract double getSpeed();
}
