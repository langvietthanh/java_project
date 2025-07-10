package java_46;

import java.util.Scanner;

public class Test {
	static Scanner inp = new Scanner(System.in);
	static double a,b;
	
	public static void Computer() {
		Casio500 mt1 =  new Casio500();
		Vinacal500 mt2 = new Vinacal500();
		a = inp.nextDouble();
		b = inp.nextDouble();
		System.out.println("Casio500:");
		System.out.println("Cong: " + mt1.cong(a,b));
		System.out.println("Tru: " + mt1.tru(a,b));
		System.out.println("Nhan: " + mt1.nhan(a,b));
		System.out.println("Chia: " + mt1.chia(a,b));
		System.out.println("Vinacal500:");
		System.out.println("Cong: " + mt2.cong(a,b));
		System.out.println("Tru: " + mt2.tru(a,b));
		System.out.println("Nhan: " + mt2.nhan(a,b));
		System.out.println("Chia: " + mt2.chia(a,b));
	}
	
	public static void Sort() {
		int arr1[] = {6, 4, 8, 2, 3, 1};
		int arr2[] = {7, 5, 1, 3, 4, 6};
		Select s1 = new Select();
		Insert s2 = new Insert();
		
		System.out.println("Select sort:");
		System.out.println("Inc:");
		s1.sort_inc(arr1);
		System.out.println("Dec:");
		s1.sort_dec(arr1);
		

		System.out.println("Insert sort:");
		System.out.println("Inc:");
		s2.sort_inc(arr2);
		System.out.println("Dec:");
		s2.sort_dec(arr2);
		
	}
	
	public static void Computer_combine_Sort(){	
		Computer_Software cps = new Computer_Software();
		int arr[] =  {2,6,7,9,1,3};
		double a,b;
		a=10;b=5;
		System.out.println("Computer:");
		System.out.println("Cong: " + cps.cong(a,b));
		System.out.println("Tru: " + cps.tru(a,b));
		System.out.println("Nhan: " + cps.nhan(a,b));
		System.out.println("Chia: " + cps.chia(a,b));
		System.out.println("Sort:");
		System.out.println("Decrease:");
		cps.sort_dec(arr);
		System.out.println("Increase");
		cps.sort_inc(arr);
	}
	public static void main(String[] args) {
		Computer();
		Sort();
		Computer_combine_Sort();
	}
}
