package searchingAndSorting;

public class InversionCountUsingMergeSort {
	//static int inversionCount=0;
	public static void method() {
		int[] arr = { 1, 20, 6, 4, 5};
		System.out.println("before sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int inversionCount=mergeSort(arr,0,arr.length-1);
		System.out.println("Inversion count: "+inversionCount);
		System.out.println("\n after merge sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	private static int mergeSort(int[] arr,int start,int end) {
		// TODO Auto-generated method stub
		int inversionCount=0;
		if(start<end) {
			
			int mid=start+(end-start)/2;
			inversionCount+=mergeSort(arr,start,mid);
			inversionCount+=mergeSort(arr,mid+1,end);
			int[] temp=new  int[end-start+1];
			int i=start,j=mid+1,it=0;
			while(i<=mid&&j<=end) {
				if(arr[i]<arr[j]) {
					temp[it++]=arr[i++];
				}else {
					inversionCount+=(mid+1-i);
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
			
		return inversionCount;
		
	}

}
