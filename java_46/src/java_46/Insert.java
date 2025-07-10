package java_46;

public class Insert implements Sort_Interface{

	@Override
	public void sort_dec(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			int idx=i;
			for(int j=i-1;j>=0;j--) {
				if(arr[j] < arr[idx]) {
					int tmp =arr[j];
					arr[j]=arr[idx];
					arr[idx]=tmp;
					idx=j;
				}
			}
			if (idx != i) {
				for(int j=0;j<arr.length;j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}
	}
	@Override
	public void sort_inc(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			int idx=i;
			for(int j=i-1;j>=0;j--) {
				if(arr[j] > arr[idx]) {
					int tmp =arr[j];
					arr[j]=arr[idx];
					arr[idx]=tmp;
					idx=j;
				}
			}
			if (idx != i) {
				for(int j=0;j<arr.length;j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}
	}
	
}
