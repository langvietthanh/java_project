package java_31;
import java.util.Scanner;

public class Test {
    static Scanner jin = new Scanner(System.in); 
	
	public static void main(String[] args) {
		Info hoadon = new Info("tn",100,8);
		System.out.println("Tong tien: "+hoadon.Tinhtoan());
		double n = jin.nextDouble();
		System.out.println("Hoa don lon hon "+n+ ": "+hoadon.checkkhoiluong(n));
		System.out.println("Hoa don lon hon 500000: "+hoadon.checklonhon5lit());
		hoadon.giamgia();
	}
}
