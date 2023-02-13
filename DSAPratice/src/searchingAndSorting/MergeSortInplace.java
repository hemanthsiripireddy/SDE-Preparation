package searchingAndSorting;

public class MergeSortInplace {
	public static void method() {
		int[] arr = { 12, 1, 6, 2, 67, 87, 12, 11, 0, -9 };
		System.out.println("before sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		mergeSort(arr, 0, arr.length - 1);
		System.out.println("\n after merge sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	private static void mergeSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if (start < end) {
			int mid = start + (end - start) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			
			int i = start, j = mid + 1;
			while(i<=mid) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					int val=arr[j],it=j+1;
					while(it<=end) {
						if(arr[it]<val) {
							arr[it-1]=arr[it];
							it++;
							if(it-1==end)
								arr[it-1]=val;
						}else {
							arr[it-1]=val;
							break;
						}
						
						
					}
					
					
				}
				i++;
				
			}
		}

	}

}
