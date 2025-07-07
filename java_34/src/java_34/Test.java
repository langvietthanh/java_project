package java_34;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		Scanner inp = new Scanner (System.in);
//		int d,m,y;
//		MyDate arr[]=new MyDate[2];
//		for(int i=0;i<2;i++) {
//			d=inp.nextInt();m=inp.nextInt();y=inp.nextInt();
//			arr[i] = new MyDate(d,m,y);
//			//arr[i].setDay(d);arr[i].setMonth(m);arr[i].setYear(y);
//		}
//		if(arr[0] == arr[1]) System.out.println("Yes");
//		else System.out.println("No");
		MyDate md1 = new MyDate (28,07,2005);
		MyDate md2 = new MyDate (28,07,2005);
		if(md1.equals(md2)) System.out.println("Yes");
		else System.out.println("No");
	}
}
