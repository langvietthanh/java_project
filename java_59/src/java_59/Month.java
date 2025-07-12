package java_59;

public enum Month {
	Mot(31),Hai(28),Ba(31),Bon(30),Nam(31),Sau(30),Bay(31),Tam(31),Chin(30),Muoi(31),MMot(30),MHai(31);
	private final int SoNgay;
	Month(int i) {
		SoNgay=i;
	}
	public int getSoNgay() {
		return SoNgay;
	}
	
}
