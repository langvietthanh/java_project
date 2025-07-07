package java_32;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int d,int m,int y) {
		if (d>0 && d<32)day=d;
		else day=1;
		if (m>0 && m<32)month=m;
		else month=1;
		if (y >2000)year=y;
		else year =2025;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
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
	
	
}
