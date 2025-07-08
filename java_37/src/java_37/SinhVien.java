package java_37;

import java.util.Objects;

public class SinhVien {
	private int MaSo;
	private String HoTen;
	private double DiemTB;
	NGAY NgaySinh;
	LOP Lop;
	public SinhVien(int ms,String ht,double dtb,NGAY ns,LOP l) {
		MaSo=ms;
		HoTen=ht;
		DiemTB=dtb;
		NgaySinh=ns;
		Lop=l;
	}
	public String get_ten_khoa() {
		return Lop.getTenKhoa();
	}
	@Override
	public int hashCode() {
		return Objects.hash(DiemTB);
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
		return Double.doubleToLongBits(DiemTB) == Double.doubleToLongBits(other.DiemTB);
	}
	
	public boolean cmp_ngay_sinh(SinhVien b) {
		return NgaySinh.equals(b.NgaySinh);
	}
	
}
