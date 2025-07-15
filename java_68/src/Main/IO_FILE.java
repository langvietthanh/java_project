package Main;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class IO_FILE {
	File file;
	public IO_FILE(String name) {
		file = new File(name);
	}
	
	public boolean ThucThi() {
		return file.canExecute();
	}
	
	public boolean Doc() {
		return file.canRead();
	}
	
	public boolean Ghi() {
		return file.canWrite();
	}
	
	public String DuongDan() {
		return file.getAbsolutePath();
	}
	
	public String Ten() {
		return file.getName();
	}
	
	public int FileOrFolder() {
		if(file.isDirectory())return 1;
		else if(file.isFile())return 2;
		return 0;
	}
	
	public void FileChirld() {
		if(file.isDirectory()) {
			System.out.print("Folder/File con: ");
			File arr[] = file.listFiles();
			for (File x:arr)System.out.print(x.getName()+", ");
			System.out.println();
			//System.out.println(Arrays.toString(arr));
		}
		else {
			System.out.println("La File nen khong co Folder/File con");
		}
	}
	
	public void FolderTree() {
		PrintTree(file, 1);
	}
	
	public void PrintTree(File f,int deg) {
//		for( int i=0 ; i < deg ; i++ ) {
//			System.out.println("\t");
//			System.out.println(f.getName());
//			File arr[] = f.listFiles();
//			for (File fx : arr) {
//				PrintTree(fx, deg+1);
//			}
//		}
		for(int i=0 ; i<deg-1 ; i++)System.out.print("\t");
		if(deg>1)System.out.print("`->");
		System.out.println(f.getName() +" "+deg);
		if(f.isFile())return;
		File arr[] = f.listFiles();
		for (File fx : arr) {
			
			PrintTree(fx, deg+1);
		}
	}
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int l;
		
		// Nhập vào đường dẫn đến file
		System.out.print("Nhap duong dan den file: ");
		String name = inp.nextLine();
		System.out.println();
		
		IO_FILE f = new IO_FILE(name);
		do {
			System.out.print(
			"1.Kiem tra file co the thuc thi:\n"
			+ "2.Kiem tra file co the doc:\n"
			+ "3.Kiem tra file co the ghi:\n"
			+ "4.In duong dan:\n"
			+ "5.In ten file:\n"
			+ "6.Kiem tra file la thu muc hoac tap tin:\n"
			+ "7.In danh sach file con:\n"
			+ "8.In ra cay thu muc:\n");
			
			l = inp.nextInt();
			
			if(l==1)System.out.println(f.ThucThi());
			else if(l==2)System.out.println(f.Doc());
			else if(l==3)System.out.println(f.Ghi());
			else if(l==4)System.out.println(f.DuongDan());
			else if(l==5)System.out.println(f.Ten());
			else if(l==6) {
				if(f.FileOrFolder() ==  1) System.out.println("Folder");
				else System.out.println("File");
			}
			else if(l==7)f.FileChirld();
			else if(l==8)f.FolderTree();
			else break;	
			
		}
		while(l!=0);
		
	}
}
