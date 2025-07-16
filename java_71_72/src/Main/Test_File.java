package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Test_File {
	public static void main(String[] args) {
//		Xuất dữ liệu ra file
		try {
			PrintWriter out = new PrintWriter("D:\\java_project\\java_71_72\\Text.txt");
			out.println("con cho");
			out.println("tao ghét may");
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Lấy dữ liệu từ file (Theo Scanner)
		File f = new File("D:\\java_project\\java_71_72\\Text.txt");
		try {
			Scanner inp = new Scanner(f);
			while(inp.hasNextLine()) {
				String line = inp.nextLine();
				System.out.println(line);
			}
			inp.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
