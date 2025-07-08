package java_36;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String movie_name,name_brand,country;
		int release_year,day,month,year;
		double price_ticket,x;
		movie_name = inp.next();
		release_year = inp.nextInt();
		price_ticket = inp.nextDouble();
		x = inp.nextDouble();
		name_brand = inp.next();
		country = inp.next();
		day = inp.nextInt();
		month = inp.nextInt();
		year = inp.nextInt();
		
		Movie m1 = new Movie (movie_name, release_year, price_ticket,new Brand(name_brand,country),new Date(day,month,year));
		
		Movie m2 = new Movie ("kms", 2025, 200, new Brand("tokyo","japan"),new Date(15,8,2025));
		
		System.out.print(m1.cmp_pt(m2) + " ");
		System.out.println(m2.cmp_pt(m1));
		System.out.println(m1.get_name_brand() + " " + m2.get_name_brand());
		System.out.println(m1.dec_price_ticket(x) +" "+  m2.dec_price_ticket(x));
	}
}
