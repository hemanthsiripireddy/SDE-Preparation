package searchingAndSorting;

public class SelectionSort {
	public static void method() {
		int[] arr= {12,1,6,2,67,87,12,11,0,-9};
		System.out.println("before sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		selectionSort(arr);
		System.out.println("\n after selection sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		int size=arr.length;
		for(int i=0;i<size-1;i++) {
			int index=i;
			for(int j=i+1;j<size;j++) {
				if(arr[j]<arr[index])
					index=j;
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
		
	}

}
