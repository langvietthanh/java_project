package java_37;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		SinhVien a = new SinhVien (768,"Thanh",9,new NGAY(28,7,2005),new LOP("12B","CNTT"));
		SinhVien b = new SinhVien (345,"Thinh",9.5,new NGAY(1,2,2005),new LOP("12C","MRT"));
		System.out.println(a.get_ten_khoa() + " " + b.get_ten_khoa());
		System.out.println(a.equals(b));
		System.out.println(a.cmp_ngay_sinh(b));
	}
}
