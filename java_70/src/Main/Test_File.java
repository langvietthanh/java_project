package Main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Test_File {
	
	static void copy_file(File f,File f_copy) {
		try {
			Files.copy(f.toPath(), f_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(f.isDirectory()){
			for(File fx : f.listFiles()) {
				File fx_copy = new File(f_copy.getAbsolutePath() +  "\\" + fx.getName());
				copy_file(fx,fx_copy);
			}
		}
	}
	
	public static void main(String[] args) {
		
//		// Đổi tên file 
//		File text1 = new File("D:\\java_project\\java_70\\Text1.txt");
//		File text2 = new File("D:\\java_project\\java_70\\text2.txt");	
//		text1.renameTo(text2);

//		// Di chuyển file
//		File move_text2 = new File("D:\\java_project\\java_70\\F0\\Text2.txt");
//		try {
//			Files.move(text2.toPath(), move_text2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		// Copy 
		File F0 = new File("D:\\java_project\\java_70\\F0");
		File F0_copy = new File("D:\\java_project\\java_70\\F0_copy");
//		! Chỉ copy thư mục cha, những thư mục con/tập tin bên trong sẽ không được copy)
//		try {
//			Files.copy(F0.toPath(), F0_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
//		Dùng đệ quy để copy những thư mục bên trong thư mục cha
		copy_file(F0,F0_copy);
		
	}
}
