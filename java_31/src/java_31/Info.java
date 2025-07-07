package java_31;

public class Info {
	private String name;
	private double gia;
	private double kg;
	private double tonggia;
	
	public Info(String T,double g,double k) { 
		this.name=T;
		this.gia = g;
		this.kg = k;
		this.tonggia=gia*kg;
	}
	public double Tinhtoan() {
		return tonggia;
	}
	public boolean checkkhoiluong(double a) {
		return tonggia>a;
	}
	public boolean checklonhon5lit() {
		return tonggia>(double)(500);
	}
	public void giamgia() {
		double giagiam;
		if(tonggia>(double)500) {
			giagiam=(tonggia*0.1);
		}
		else giagiam=(0);
		System.out.println(giagiam);
		System.out.println(tonggia-giagiam);
	}
	
}
