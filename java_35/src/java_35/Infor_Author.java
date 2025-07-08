package java_35;

public class Infor_Author {
	private String name;
	private Ngay date;
	
	public Infor_Author(String n,Ngay d) {
		name = n;
		date = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ngay getDate() {
		return date;
	}

	public void setDate(Ngay date) {
		this.date = date;
	}
	
	public boolean cmp_ngay(Infor_Author b) {
		return date.cmp_Ngay(b.date);
	}
	
}
