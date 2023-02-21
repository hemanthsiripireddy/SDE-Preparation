package searchingAndSorting;

public class BinarySearch {
	public static void method() {
		int[]arr= {1,2,3,4,5,6,7,8};
		search(arr,0,arr.length-1,9);
		
	}
	public static void search(int[] arr,int start,int end,int num) {
		if(start>end) {
			System.out.println("Number: "+num+" can't be found"+" in the given array");
			return;
			
		}
		int mid=start+(end-start)/2;
		if(arr[mid]==num) {
			System.out.println("Number: "+num+" found at index "+mid);
		}else if(num<arr[mid]) {
			search(arr,start,mid-1,num);
		}else {
			search(arr,mid+1,end,num);
		}
		
	}
	public static int iterativeVersion(int[] arr,int start,int end, int target) {
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==target) {
				return mid;
				
			}else if(target<arr[mid]) {
				end=mid-1;
			}else
				start=mid+1;
		}
		return -1;
	}
	public static int recursiveVersion(int[] arr, int start,int end,int target) {
		if(start>end)
			return -1;
		int mid=(start+end)/2;
		if(arr[mid]==target)
			return mid;
		else if(target<arr[mid])
			return recursiveVersion(arr, start, mid-1, target);
		else
			return recursiveVersion(arr, mid+1, end, target);
			
	}

}
