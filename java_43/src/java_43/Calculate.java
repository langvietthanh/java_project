package java_43;

public class Calculate {
	public double re_min(double a,double b) { 
		if (a<b)return a;
		else return b;
	}
	public double re_max(double a,double b) {
		if(a>b)return a;
		else return b;
	}
	public double cal_sum(double a,double b) {
		return a + b;
	}
	public double cal_arr(double arr[]) {
		double ans=0;
		for(int i=0;i<arr.length;i++) {
			ans+=arr[i];
		}
		return ans;
	}
}
