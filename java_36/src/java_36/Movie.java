package java_36;

public class Movie {
	private String movie_name;
	private int release_year;
	private double price_ticket;
	Brand movie_brand;
	Date movie_date;
	
	public Movie(String mn,int ry,double pt,Brand b,Date d) {
		movie_name=mn;
		release_year=ry;
		price_ticket=pt;
		movie_brand=b;
		movie_date=d;
	}
	public boolean cmp_pt(Movie b) {
		return price_ticket < b.price_ticket;
	}
	public String get_name_brand() {
		return movie_brand.getName_brand();
	}
	public double dec_price_ticket(double x) {
		return price_ticket - price_ticket*(x/100);
	}
}
