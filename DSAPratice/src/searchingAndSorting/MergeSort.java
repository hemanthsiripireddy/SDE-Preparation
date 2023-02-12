package searchingAndSorting;

public class MergeSort {
	public static void method() {
		int[] arr = { 12, 1, 6, 2, 67, 87, 12, 11, 0, -9 };
		System.out.println("before sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		mergeSort(arr,0,arr.length-1);
		System.out.println("\n after merge sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	private static void mergeSort(int[] arr,int start,int end) {
		// TODO Auto-generated method stub
		if(start<end) {
			int mid=start+(end-start)/2;
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			int[] temp=new  int[end-start+1];
			int i=start,j=mid+1,it=0;
			while(i<=mid&&j<=end) {
				if(arr[i]<arr[j]) {
					temp[it++]=arr[i++];
				}else {
					temp[it++]=arr[j++];
				}
				
			}
			while(i<=mid) {
				temp[it++]=arr[i++];
				
			}
			while(j<=end) {
				temp[it++]=arr[j++];
				
			}
			i=start;it=0;
			while(it<temp.length) {
				arr[i++]=temp[it++];
			}
		}
			
		
		
	}

}
