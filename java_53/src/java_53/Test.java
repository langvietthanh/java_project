package java_53;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		// copy (tham chieu)
		
		int a[];
		a = arr;
		a[0] = 6;
		System.out.println("a[0]: " + a[0] + " arr[0]: " + arr[0]); // a va arr tham chieu den cung mot vung nho
		System.out.println("a[]: " + Arrays.toString(a) + "\n" + "arr[]: " + Arrays.toString(arr));
		// copy (khong tham chieu)
		
		int b[];
		b=arr.clone();
		b[0] = 7;
		System.out.println("\nb[0]: " + b[0] + " arr[0]: " + arr[0]);
		System.out.println("b[]: " + Arrays.toString(b) + "\n" + "arr[]: " + Arrays.toString(arr));
		
		int c[] = new int [arr.length];
		System.arraycopy(arr, 0, c, 0, arr.length);
		c[0] = 8;
		System.out.println("\nc[0]: " + c[0] + " arr[0]: " + arr[0]);
		System.out.println("c[]: " + Arrays.toString(c) + "\n" + "arr[]: " + Arrays.toString(arr));
		
//		Console:
//		a[0]: 6 arr[0]: 6
//		a[]: [6, 2, 3, 4, 5]
//		arr[]: [6, 2, 3, 4, 5]
//
//		b[0]: 7 arr[0]: 6
//		b[]: [7, 2, 3, 4, 5]
//		arr[]: [6, 2, 3, 4, 5]
//
//		c[0]: 8 arr[0]: 6
//		c[]: [8, 2, 3, 4, 5]
//		arr[]: [6, 2, 3, 4, 5]
	}
}
