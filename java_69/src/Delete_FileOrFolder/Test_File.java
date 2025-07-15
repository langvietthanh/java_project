package Delete_FileOrFolder;

import java.io.File;

public class Test_File {
	static void Delete_File(File f) {
		if(f.isFile()) {
			f.deleteOnExit();
			return;
		}
		for (File x : f.listFiles()) {
			Delete_File(x);
		}
		f.deleteOnExit();
	}
	
	public static void main(String[] args) {
		File text = new File ("D:\\java_project\\java_69\\Test.txt");
		File f0 = new File("D:\\java_project\\java_69\\f0");
		File f0_1 = new File("D:\\java_project\\java_69\\f0_1");
		
		f0.deleteOnExit(); // Không xóa được do thư mục không rỗng 
		f0_1.deleteOnExit(); // Xóa được do thư mục rỗng
		text.delete();// Xóa được do là tập tin
		
		// Chạy đệ qui để xóa các tập con trước sau đó mới xóa tập cha
		Delete_File(f0);
		//System.out.println(f0.exists());
		
	}
}
