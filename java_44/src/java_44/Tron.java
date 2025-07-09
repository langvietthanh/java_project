package java_44;

public class Tron extends Hinh {
	private double R;
	public Tron(ToaDo toado,double r) {
		super(toado);
		R=r;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double cal_S() {
		// TODO Auto-generated method stub
		return R*R*Math.PI;
	}
	
}
