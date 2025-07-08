package java_35;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		String name,name_author;
		double price;
		int year;
		int da,ma,ya;
		name = inp.next();
		price = inp.nextDouble();
		year = inp.nextInt();
		name_author = inp.next();
		da = inp.nextInt();
		ma = inp.nextInt();
		ya = inp.nextInt();
		
		Book num1 = new Book(name,price,year,new Infor_Author(name_author,new Ngay(da,ma,ya)));
		Book num2 = new Book("g",100,2024,new Infor_Author("ht",new Ngay(7,9,2005)));
		System.out.println(num2.getname());
		System.out.println(num2.cmp_year(num1));
		System.out.println(num2.dec_price(10));
		System.out.println(num2.cmp_date(num1));
		
		Book num3 = new Book("y",100,2025,new Infor_Author("th",new Ngay(7,9,2005)));
		System.out.println(num2.getname());
		System.out.println(num2.cmp_year(num3));
		System.out.println(num2.dec_price(10));
		System.out.println(num2.cmp_date(num3));
	} 
}
