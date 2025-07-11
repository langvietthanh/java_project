package java_51;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String s1,s2,s3,s4,s5,s6;
		s1 = "Con cho dang an";
		s2 = "Con cho";
		s3 = "Cho con";
		char c1 = 'o';
		// s1.indexOf() Tìm từ đầu xâu (trái sang phải)
		System.out.println("Vi tri s2 xuat hien trong s1 tai vi tri: " + s1.indexOf(s2));
		System.out.println("Vi tri s3 xuat hien trong s1 tai vi tri: " + s1.indexOf(s3));
		System.out.println("Vi tri s2 xuat hien trong s1 tai vi tri va bat dau tu 2: " + s1.indexOf(s2,2));
		System.out.println("Vi tri c1 xuat hien trong s1 tai vi tri: " + s1.indexOf(c1));
		
		System.out.println("==========================================================");
		// s1.lastIndexOf() Tìm từ cuối xâu (phải sang trái)
		
		s4 = "Dang an con cho";
		s5 = "con cho";
		s6 = "cho con";
		System.out.println("Vi tri s5 xuat hien trong s4 tai vi tri: " + s4.lastIndexOf(s5));
		System.out.println("Vi tri s6 xuat hien trong s4 tai vi tri: " + s4.lastIndexOf(s6));
		System.out.println("Vi tri s5 xuat hien trong s4 tai vi tri va bat dau tu 9 : " + s4.lastIndexOf(s5,7)); // giá trị là vị trí tính từ trái qua phải
		System.out.println("Vi tri c1 xuat hien trong s4 tai vi tri: " + s4.lastIndexOf(c1));
		
	}
}
