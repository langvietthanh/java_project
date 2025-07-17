package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Test_Object {
	public static void main(String[] args) {
		try {
			File f = new File("D:\\java_project\\java_73\\file_data");
			InputStream is = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(is);
			
			SinhVien sv1 = (SinhVien)ois.readObject();
			System.out.println(sv1);
			ois.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
