package Main;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{
	private String MSV,FN;
	private int NS;
	private float DTB;
	
	public SinhVien(String mSV) {
		super();
		MSV = mSV;
	}
	public String getMSV() {
		return MSV;
	}
	public SinhVien(String mSV, String fN, int nS, float dTB) {
		super();
		MSV = mSV;
		FN = fN;
		NS = nS;
		DTB = dTB;
	}
	@Override
	public String toString() {
		return "[Ma sinh vien: " + MSV + ", Ho ten: " + FN + ", Nam sinh: " + NS + ", Diem trung binh: " + DTB + "]\n";
	}
	public float getDTB() {
		return DTB;
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
