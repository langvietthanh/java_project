package java_43;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		double a,b;
		a=inp.nextDouble();b=inp.nextDouble();
		Calculate cal = new Calculate();
		System.out.println("MAX: "
				+ cal.re_max(a,b));
		System.out.println("MIN: "
				+ cal.re_min(a,b));
		System.out.println("SUM: "
				+ cal.cal_sum(a,b));
		double c[] = {1,2,3} ;
		System.out.println("SUM ARR: "
				+ cal.cal_arr(c));
				
	}
	
}
