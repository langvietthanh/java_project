package java_35;

import java.util.Objects;

public class Book {
	private String name;
	private double price;
	private int year;
	private Infor_Author author;
	
	public Book(String n,double p,int y,Infor_Author a) {
		name=n;
		price=p;
		year=y;
		author=a;
	}
	
	public String getname() {
		return name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Infor_Author getAuthor() {
		return author;
	}

	public void setAuthor(Infor_Author author) {
		this.author = author;
	}

	public boolean cmp_year(Book b) {
		return year == b.year;
	}	
	
	public boolean cmp_date(Book b) {
		if (b==null)return false;
		return author.cmp_ngay(b.author);
	}
	
	public double dec_price(double x) {
		return price - price*(x/((double)100));
	}
}
