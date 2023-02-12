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

}
