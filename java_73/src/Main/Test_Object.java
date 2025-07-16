package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test_Object {
	public static void main(String[] args) throws IOException {
		try {
			File f = new File("D:\\java_project\\java_73\\file_data");
			OutputStream os = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			// Lưu một sinh viên
			SinhVien sv1 = new SinhVien("VS001","Thanh",2005,10);
			oos.writeObject(sv1);
			
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
