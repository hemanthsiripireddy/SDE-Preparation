package week1;

import java.util.Random;

public class QuickSort {
	public static void method() {
		int[] arr=new int[] {5,4,44,3,2,1};
		int i=0,j=arr.length-1;
		quickSort(arr,i,j);
		for( i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	public static void  quickSort(int[] arr,int start,int end) {
		if(start<end) {
			int i=partition(arr,start,end);
			quickSort(arr,start,i-1);
			quickSort(arr,i+1,end);
		}
		
	}
	private static int partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int index=r.nextInt(start, end+1);
		int temp=arr[end];
		arr[end]=arr[index];
		arr[index]=temp;
		int pivot=arr[end];
		int midPoint=start;
		for(int i=start;i<=end;i++) {
			if(arr[i]<pivot) {
				
				temp=arr[midPoint];
				arr[midPoint]=arr[i];
				arr[i]=temp;
				midPoint++;
			}
		}
		arr[end]=arr[midPoint];
		arr[midPoint]=pivot;
		return midPoint;
		
	}

}
