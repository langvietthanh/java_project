package java_35;

public class Ngay {
	private int day;
	private int month;
	private int year;
	
	public Ngay(int d,int m,int y) {
		day=d;
		month=m;
		year=y;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public boolean cmp_Ngay(Ngay b) {
		return day == b.day && month == b.month && year == b.year;
		
	}
	
}	
