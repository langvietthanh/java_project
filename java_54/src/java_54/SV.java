package java_54;

public class SV implements Comparable<SV>{
	private int MSV;
	private String Name,Class;
	private double DTB;
	public SV(int mSV, String name, String class1, double dTB) {
		MSV = mSV;
		Name = name;
		Class = class1;
		DTB = dTB;
	}
	public String getTen() {
		String s = Name.trim();
		if(s.indexOf(" ")>=0) {
			// co nhieu hon 1 word VD: Nguyen Van A
			int id = s.lastIndexOf(" ");
			return s.substring(id);
			
		}
		else return s;
	}
	
	@Override
	public int compareTo(SV o) {
		// chi chap nhan gia tri <0 =0 >0 khong nhan gia tri true/false
		if (MSV != o.MSV) return MSV - o.MSV;
		else if(o.getTen() != getTen()) return getTen().compareTo(o.getTen());
		else if (Name != o.Name)return Name.compareTo(o.Name);
		else if (Class != o.Class)return Class.compareTo(o.Class);
		else return (int)(DTB - o.DTB);
	}
	
}
