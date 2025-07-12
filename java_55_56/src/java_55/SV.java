package java_55;

public class SV implements Comparable <SV> {
	private String MSV,FN,CLS;
	private double DTB;
	public SV(String mSV, String fN, String cLS, double dTB) {
		super();
		MSV = mSV;
		FN = fN;
		CLS = cLS;
		DTB = dTB;
	}
	
	// Cách thứ 1 để lấy tên 
//	public String cutName() {
//		// xac dinh xem FN co may Word
//		if(FN.indexOf(" ") >=0) {
//			// FN khong chi co moi ten
//			int id = FN.lastIndexOf(" ");// tim vi tri cua dau " " ngay truoc ten
//			return FN.substring(id);
//		}
//		else return FN;
//	}
	
	// Cách thứ 2 để lấy tên
	public String cutName() {
		String arr[] = FN.split(" "); // ham split(//.|//,) để cắt nhiều dấu khác
		return arr[arr.length - 1];
	}
	
	@Override
	// sort theo MSV 
	public String toString() {
		//return MSV +" "+ FN +" "+ CLS +" "+ DTB;
		return cutName();
	}
	
	public int compareTo(SV o) {
		// so sanh theo ten
		String This_N,O_N;
		This_N = cutName();
		O_N = o.cutName();
		return This_N.compareTo(O_N); // so sanh de sap xep tang dan
		//return MSV.compareTo(o.MSV);
	}
	
}
