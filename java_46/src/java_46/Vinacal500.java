package java_46;

public class Vinacal500 implements MTBT_Interface {
	@Override
	public double cong(double a, double b) {	
		return a+b;
	}
	@Override
	public double tru(double a, double b) {
		return a-b;
	}
	@Override
	public double nhan(double a, double b) {
		return a*b;
	}
	@Override
	public double chia(double a, double b) {
		if (b!=0)return a/b;
		else return 0;
	}
	
}

