package java_55;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		SV sv1 = new SV ("768","Lang Viet Thanh","12-B",9.0);
		SV sv2 = new SV ("769","Vu Van Thinh","12-C",7.0);
		SV sv3 = new SV ("770","Bui Phi Long","12-B",8.0);
		SV sv4 = new SV ("771","Sam Duc Thang","12-D",8.0);
		SV arr[] = {sv1,sv2,sv3,sv4};
		Arrays.sort(arr);
		// sap xep dua theo ham compareTo trong class SV
		// in theo format theo ham tostring trong class
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println(Arrays.binarySearch(arr, sv2));
		
	}
}
