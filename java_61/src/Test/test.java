package Test;

import java.util.Arrays;
import java.util.Scanner;

import Main.DSSV;
import Main.SinhVien;


public class test {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		DSSV list = new DSSV();
		int mode;
		do {
			System.out.println("MENU:");
			System.out.println(  "1.Thêm sinh viên vào danh sách.\n"
			+ "2.In danh sách sinh viên ra màn hình.\n"
			+ "3.Kiểm tra danh sách có rỗng hay không.\n"
			+ "4.Lấy ra số lượng sinh viên trong danh sách.\n"
			+ "5.Làm rỗng danh sách sinh viên.\n"
			+ "6.Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
			+ "7.Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
			+ "8.Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
			+ "9.Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
			+ "0.Thoát khỏi chương trình");
			mode = inp.nextInt();
			inp.nextLine();
			if(mode == 1) {
				String a,b;
				int c;
				float d;
				System.out.println("Nhap ma sinh vien: "); a= inp.nextLine();
				System.out.println("Nhap ho ten: ");b = inp.nextLine();
				System.out.println("Nhap nam sinh vien: ");c = inp.nextInt();
				System.out.println("Nhap diem trung binh: ");d = inp.nextFloat();
				SinhVien x = new SinhVien(a,b,c,d);
				list.addSinhVien(x);
			}
			if(mode == 2) {
				list.inDSSV();
			}
			if(mode == 3) {
				list.Empty();
			}
			if(mode == 4) {
				System.out.println("So luong sinh vien trong danh sach la:");
				list.number_of_SinhVien();
			}			
			if(mode == 5) {
				list.Clear_DSSV();
			}
			if(mode == 6) {
				String a;
				System.out.println("Nhap ma sinh vien can tim: "); a = inp.nextLine();
				SinhVien x = new SinhVien(a);
				list.find(x);
			}			
			if(mode == 7) {
				String a;
				System.out.println("Nhap ma sinh vien can xoa: "); a= inp.nextLine();
				SinhVien x = new SinhVien(a);
				list.delete_SinhVien(x);
			}
			if(mode == 8) {
				String ten = inp.nextLine();
				list.find_ten(ten);
			}			
			if(mode == 9) {
				list.print();
			}
			
		}
		while(mode != 0);
	}
}
