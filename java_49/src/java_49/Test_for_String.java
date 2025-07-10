package java_49;

import java.util.Scanner;

public class Test_for_String {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String str = inp.nextLine();
		
		System.out.println("Do dai: "+ str.length());
		
		System.out.println("Truy cap char tai vi tri i trong string: ");
		for (int i=0;i<str.length();i++) {
			System.out.println("Vi tri " +i+" = "+ str.charAt(i));
		}
		
		System.out.println("copy substr tu string: ");
		char arr_char[] = new char[3];
		str.getChars(0, 3, arr_char, 0);
		
		for(char x : arr_char) {
			System.out.println(x);
		}
		

		System.out.println("chuoi con: " +str.substring(0,3));
		
		byte arr_byte[] = str.getBytes();
		for(byte x : arr_byte) {
			System.out.println(x);
		}
		
	}
}
