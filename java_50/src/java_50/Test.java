package java_50;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String s1 ,s2;
		s1 = inp.nextLine();
		s2 = inp.nextLine();
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.regionMatches(2, s2, 0, 3));
		String s3 = inp.nextLine();
		System.out.println(s1.startsWith(s3));
		System.out.println(s2.endsWith(s3));
	}
}
