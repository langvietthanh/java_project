package java_37;

import java.util.Objects;

public class NGAY {
	private int day;
	private int month;
	private int year;
	
	public NGAY(int d,int m,int y) {
		day=d;
		month=m;
		year=y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NGAY other = (NGAY) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	
}
