package java_64;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test_set {
	static Scanner inp = new Scanner(System.in);
	Set<String> HopPhieu = new HashSet<String>();
	
	public Test_set() {
		
	}
	
	public boolean ADD(String a) {
		return HopPhieu.add(a);
	}
	
	public boolean DELETE(String a) {
		return HopPhieu.remove(a);
	}
	
	public boolean CHECK(String a) {
		return HopPhieu.contains(a);
	}
	
	public void DELETE_ALL() {
		HopPhieu.clear();
	}
	
	public int NUMBER_OF_TiCKET() {
		return HopPhieu.size();
	}
	
	public String PICK() {
		String ans="";
		Random rd = new Random();
		int pos = rd.nextInt(HopPhieu.size());
		ans = (String)HopPhieu.toArray()[pos];
		return ans;
	}
	public static void main(String[] args) {
		int luachon;
		Test_set hom_phieu = new Test_set(); 
		System.out.println("1.ADD");
		System.out.println("2.DELETE");
		System.out.println("3.CHECK");
		System.out.println("4.DELETE ALL");
		System.out.println("5.NUMBER OF TICKET");
		System.out.println("6.PICK");
		do {
			luachon = 0;
			System.out.println("---------------------------\n"+"Nhap lua chon:");
			luachon = inp.nextInt();
			inp.nextLine();
			if(luachon <=3) {
				System.out.println("Nhap ma:");
				String s= inp.nextLine();
				if(luachon==1) hom_phieu.ADD(s);
				else if(luachon==2) hom_phieu.DELETE(s);
				else {
					boolean b = hom_phieu.CHECK(s);
					if(b)System.out.println("Ton tai ma: "+s);
					else System.out.println("Khong ton tai ma: "+s);
				}		
			}
			else {
				if(luachon==4)hom_phieu.DELETE_ALL();
				else if(luachon==5)System.out.println("So luong ma: "+hom_phieu.NUMBER_OF_TiCKET());
				else {
					String win = hom_phieu.PICK();
					System.out.println("Ma trung thuong la: "+win);
					hom_phieu.DELETE(win);
				}
			}
			
		}
		while(luachon != 0);
	}
}
