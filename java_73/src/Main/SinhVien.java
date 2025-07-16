package Main;

import java.io.Serializable;
import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>, Serializable{
	private String MSV,FN;
	private int NS;
	private double DTB;
	
	public SinhVien(String mSV) {
		super();
		MSV = mSV;
	}
	public String getMSV() {
		return MSV;
	}
	public SinhVien(String mSV, String fN, int nS, double d) {
		super();
		MSV = mSV;
		FN = fN;
		NS = nS;
		DTB = d;
	}
	@Override
	public String toString() {
		return "[Ma sinh vien: " + MSV + ", Ho ten: " + FN + ", Nam sinh: " + NS + ", Diem trung binh: " + DTB + "]\n";
	}
	public float getDTB() {
		return (float) DTB;
	}
	@Override
	public int compareTo(SinhVien o) {
		return MSV.compareTo(o.MSV);
	}

	public String getTen() {
		String tmp[];
		FN.trim();
		tmp = FN.split(" ");
		return tmp[tmp.length-1];
	}
	@Override
	public int hashCode() {
		return Objects.hash(MSV);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(MSV, other.MSV);
	}
	
	
}
