package java_46;

public class Select implements Sort_Interface {

	@Override
	public void sort_dec(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int idx = i;
			for(int j=i;j<arr.length;j++) {
				if(arr [j] > arr[idx]) {
					idx =j;
				}
			}
			if (idx != i) {
				int tmp=arr[i];
				arr[i]=arr[idx];
				arr[idx]=tmp;
				for(int j=0;j<arr.length;j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
			
		}
		
	}

	@Override
	public void sort_inc(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int idx = i;
			for(int j=i;j<arr.length;j++) {
				if(arr [j] < arr[idx]) {
					idx =j;
				}
			}
			if (idx != i) {
				int tmp=arr[i];
				arr[i]=arr[idx];
				arr[idx]=tmp;
				for(int j=0;j<arr.length;j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}
		
	}

	
	
}
