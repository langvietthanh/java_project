package Main;

import java.io.*;
import java.util.*;
import java.util.jar.Attributes.Name;
import java.util.zip.*;


public class Zip_Directory {
	static void Zip_All_Directory(File f,String Name_f,ZipOutputStream zos) throws FileNotFoundException, IOException {
		if(f.isHidden()) {
			return;
		}
		if(f.isDirectory()) {
//			Nén thư mục cha trước
			if(Name_f.endsWith("\\")) {
				zos.putNextEntry(new ZipEntry(Name_f));
				zos.closeEntry();
			}
			else {
				zos.putNextEntry(new ZipEntry(Name_f + "\\"));
				zos.closeEntry();
			}
			File Chirld[] = f.listFiles();
			for (File file : Chirld) {
				Zip_All_Directory(file, Name_f + "\\" + file.getName() ,zos);
			}
			return;
		}
		FileInputStream fis = new FileInputStream(f);
		ZipEntry ze = new ZipEntry(Name_f);
		
		zos.putNextEntry(ze);
		
		byte bytes[] = new byte[1024];
		int length ;
		while( (length = fis.read(bytes)) >= 0 ) {
			zos.write(bytes,0,length);
		}
		fis.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException , IOException{
		String SrcFile = "D:\\java_project\\java_76\\Directory";
		FileOutputStream fos = new FileOutputStream("D:\\java_project\\java_76\\Compressed_Directory.zip");
		ZipOutputStream zos = new ZipOutputStream(fos);
		
		File fileTozip = new File(SrcFile);
		
		Zip_All_Directory(fileTozip,fileTozip.getName(), zos);
		
		zos.close();
		fos.close();
	}
}
