package week2;

public class CountOfReversePairs {
	public static void method() {
		int[] arr=new int[] {1,3,2,3,1};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>2*arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void method2() {
		int[] arr= new int[] {3,2,1,4};
		int count=mergeSort(arr,0,arr.length-1);
		System.out.println("Count: "+count);
	}
	private static int mergeSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low>=high)return 0;
		int count=0;
		//3,1
		int mid=(low+high)/2;
		count+=mergeSort(arr,low,mid);
		count+=mergeSort(arr,mid+1,high);
		count+=merge(arr,low,mid,high);
		return count;
	}
	
	// 4,5,9,--1,2,4
	//
	private static int merge(int[] arr, int low, int mid, int high) {
		// TODO Auto-generated method stub
		int count=0;
		int j=mid+1;
		//1,2,3,4,5.....//6,,7,8,8
		for(int i=low;i<=mid;i++) {
			while(j<=high&&arr[i]>2*(long)arr[j]) {
				j++;
				
			}
			count+=(j-mid-1);//1,2,3
		}
		//return count;
		int[] arr1=new int[mid-low+1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=arr[low+i];
		}
		int[] arr2=new int[high-mid];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=arr[mid+1+i];
		}
		int i=0;j=0;
		int in=0;
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr[low+(in++)]=arr1[i++];
			}else {
				arr[low+(in++)]=arr2[j++];
			}
			
		}
		while(i<arr1.length) {
			arr[low+(in++)]=arr1[i++];
		}
		while(j<arr2.length) {
			arr[low+(in++)]=arr2[j++];
		}
		return count;
		
	}

}
