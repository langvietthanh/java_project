package java_33;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner inp = new Scanner (System.in);
		int d,m,y;
		d=inp.nextInt();m=inp.nextInt();y=inp.nextInt();
		MyDate MD = new MyDate(d,m,y);
		System.out.println(MD);
	}
}
