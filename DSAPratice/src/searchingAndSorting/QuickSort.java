package searchingAndSorting;

public class QuickSort {
	public static void method() {
		int[] arr = { 12, 1, 6, 2, 67, 87, 12, 11, 0, -9 };
		System.out.println("before sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		quickSort(arr,0,arr.length-1);
		System.out.println("\n after quick sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void quickSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end) {
			int pivot=arr[end];
			int j=start;
			for(int i=start;i<end;i++) {
				if(arr[i]<pivot) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j++]=temp;
					
					
				}
				
			}
			int temp=arr[end];
			arr[end]=arr[j];
			arr[j]=temp;
			quickSort(arr,start,j-1);
			quickSort(arr,j+1,end);
			
		}
		
	}

}
