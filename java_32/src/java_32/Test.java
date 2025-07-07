package java_32;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner inp = new Scanner (System.in);
		int day,month,year;
		day = inp.nextInt();
		month = inp.nextInt();
		year = inp.nextInt();
		MyDate md = new MyDate(day,month,year);
		System.out.println("Date: " + md.getDay() +"-"+ md.getMonth() +"-"+md.getYear());
		int nd,nm,ny;
		nd = inp.nextInt();
		nm = inp.nextInt();
		ny = inp.nextInt();
		md.setDay(nd);md.setMonth(nm);md.setYear(ny);
		System.out.println("New Date: "+ md.getDay() +"-"+ md.getMonth() +"-"+md.getYear());
	}
}
