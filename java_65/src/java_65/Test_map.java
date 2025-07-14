package java_65;

import java.util.Scanner;

public class Test_map {
	static Scanner inp =new Scanner(System.in);
	
	public static void main(String[] args) {
		Tu_Dien td = new Tu_Dien();
		int l;
		System.out.println("1.ADD");
		System.out.println("2.DELETE");
		System.out.println("3.CHECK");
		System.out.println("4.PRINT KEY");
		System.out.println("5.NUMBER OF TICKET");
		System.out.println("6.DELETE ALL");
		do {
			l=0;
			System.out.println("--------------------------------");
			System.out.println("Pick mode:");l = inp.nextInt();
			inp.nextLine();
			if(l<=3) {
				if(l==0)break;
				String k;
				System.out.print("Nhap tu khoa: ");k=inp.nextLine();

				if(l==1) {
					String v;
					System.out.print("Nhap y nghia: ");v=inp.nextLine();System.out.println();
					td.ADD(k, v);
					
				}
				else if(l==2) {
					System.out.println("Xoa cap K-V co tu khoa: "+k);
					td.DEL(k);
				}
				else {
					System.out.println("Tu khoa "+k+" co nghia la:"+td.SEARCH(k));	
				}
				
			}
			else {
				if(l==4) {
					System.out.println("Danh sach tu khoa:");
					td.PRINT_KEY();
				}
				else if(l==5) {
					System.out.println("So luong tu: "+td.PRINT_SIZE());
					
				}
				else {
					td.DEL_ALL();
				}
			}
			
		}while(l!=0);
	}
}
