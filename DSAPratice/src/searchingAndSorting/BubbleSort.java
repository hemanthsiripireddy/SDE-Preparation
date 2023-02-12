package searchingAndSorting;

public class BubbleSort {
	public static void method() {
		int[] arr= {12,1,6,2,67,87,12,11,0,-9};
		System.out.println("before sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		bubbleSort(arr);
		System.out.println("\n after bubble sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void bubbleSort(int[] arr) {
		int size=arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<size-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
