package java_46;

public class Computer_Software implements MTBT_Interface, Sort_Interface{

	@Override
	public void sort_dec(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int value = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]  < arr[j]) {
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
			if (arr[i] != value) {
				for(int j=0;j<arr.length;j++)System.out.print(arr[j] +  " ");System.out.println();
			}
		}
	}

	@Override
	public void sort_inc(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int value = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]  > arr[j]) {
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
			if (arr[i] != value) {
				for(int j=0;j<arr.length;j++)System.out.print(arr[j] + " ");System.out.println();
			}
		}
	}
	public double cong(double a, double b) {	
		return a+b;
	}
	@Override
	public double tru(double a, double b) {
		return a-b;
	}
	public double nhan(double a, double b) {
		return a*b;
	}
	@Override
	public double chia(double a, double b) {
		if (b!=0)return a/b;
		else return 0;
	}
}
