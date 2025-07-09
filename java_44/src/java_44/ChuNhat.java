package java_44;

public class ChuNhat extends Hinh {
	private double dai,rong;
	public ChuNhat(ToaDo toado,double d,double r) {
		super(toado);
		// TODO Auto-generated constructor stub
		dai=d;
		rong=r;
	}
	@Override
	public double cal_S() {
		// TODO Auto-generated method stub
		return dai*rong;
	}

	
		

}
