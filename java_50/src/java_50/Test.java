package java_50;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String s1 ,s2;
		s1 = inp.nextLine();
		s2 = inp.nextLine();
		System.out.println(s1.compareTo(s2));                 // so sanh xau tinh chu in hoa
		System.out.println(s1.compareToIgnoreCase(s2));		  // so sanh xau khong tinh chu hoa	
		System.out.println(s1.equals(s2));					  // so sanh bang tinh chu in hoa
		System.out.println(s1.equalsIgnoreCase(s2));		  // so sanh bang khong tinh chu in hoa
		System.out.println(s1.regionMatches(2, s2, 0, 3));	  // so sanh xau con 
		String s3 = inp.nextLine();							  
		System.out.println(s1.startsWith(s3));				  // so sanh xau bat dau voi xau con
		System.out.println(s2.endsWith(s3));				  // so sanh xau ket thuc voi xau con
	}
}
