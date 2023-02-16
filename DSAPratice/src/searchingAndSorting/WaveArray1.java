package searchingAndSorting;

import java.util.Arrays;

public class WaveArray1 {
	public  static void  method() {
		int[] arr= {1,5,2,4,6,7,8,24,54,12};
		waveArray1(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void waveArray1(int[] arr) {
		Arrays.sort(arr);
		int i=0;
		while(i+1<arr.length) {
			swap(arr,i);
			i=i+2;
			
		}
	}
	private static void swap(int[] arr, int i) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
		
	}

}
