package main;

import java.io.File;
import java.io.IOException;

public class file_and_folder {
	public static void main(String[] args) {
		File f1 = new File("D:\\java_project\\java_67");
		
		// kiem tra folder/file co ton tai khong
		System.out.println("Kiem tra folder co ton tai khong: " + f1.exists());
		
		// tao thu muc (folder)

		File d1 = new File("D:\\java_project\\java_67\\Dir1");
		d1.mkdir(); //tao mot thu muc
		
		File d2 = new File("D:\\java_project\\java_67\\Dir1\\Dir2\\Dir3");
		d2.mkdirs(); //tao nhieu thu muc
		
		// tao tap tin (co phan mo rong: .exe, .txt, ... )
		File f2 = new File("D:\\\\java_project\\\\java_67\\\\Dir1\\Vanban.txt");
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// Không có quyền tạo tập tin
			// ổ cứng bị đầy
			// đường dẫn sai, thư mục không tồn tại
			e.printStackTrace();
		}
	}
}
