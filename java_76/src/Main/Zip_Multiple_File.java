package Main;

import java.io.*;
import java.util.*;
import java.util.zip.*;

public class Zip_Multiple_File {
	public static void main(String[] args) throws IOException {
		List<String> SrcFiles = Arrays.asList("D:\\java_project\\java_76\\text2.txt","D:\\java_project\\java_76\\text3.txt");
		FileOutputStream fos = new FileOutputStream("D:\\java_project\\java_76\\compressed_multiple.zip");
		ZipOutputStream zos = new ZipOutputStream(fos);
		for (String srcfile : SrcFiles) {
			File fileTozip = new File (srcfile);
			FileInputStream fis = new FileInputStream(fileTozip);
						
			ZipEntry ze = new ZipEntry(fileTozip.getName());
			zos.putNextEntry(ze);
			
			byte bytes[] = new byte[1024];
			int length;
			
			while ((length = fis.read(bytes)) >=0) {
				zos.write(bytes, 0, length);
			}
			fis.close();
		}
//		Đóng zos trước fos
		zos.close();
		fos.close();
	}
}
