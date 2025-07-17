package Main;

import java.io.*;
import java.util.zip.*;


public class Zip_File {
	public static void main(String[] args) {
		String SourseFile = "D:\\java_project\\java_76\\text1.txt";// Tên file sẽ được nén
		try {
			// Tạo đối tượng File để lấy dữ liệu từ file gốc
			File fileTozip = new File(SourseFile);
			
			// Tạo FileInputStream để đọc dữ liệu từ file gốc
			FileInputStream fis = new FileInputStream(fileTozip);
			
			// Tạo đối tượng FileOutputStream để ghi dữ liệu ra file zip
			FileOutputStream fos = new FileOutputStream("D:\\java_project\\java_76\\compressed.zip");
			
			// Tạo đối tượng ZipOutputStream để nén dữ liệu
			ZipOutputStream zos = new ZipOutputStream(fos);
			
			// Tạo một entry trong file zip với tên file gốc
			ZipEntry ze = new ZipEntry(fileTozip.getName());
			
			try {
				zos.putNextEntry(ze);
				byte bytes[] = new byte[1024];
				int length;
				
				 // Đọc dữ liệu từ file gốc và ghi vào file zip
				while ((length = fis.read(bytes))>=0){
					zos.write(bytes , 0 ,length);
				}
				zos.close();
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
