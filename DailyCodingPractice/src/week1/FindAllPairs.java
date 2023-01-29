package week1;

import java.util.Arrays;

public class FindAllPairs {
	public static void  method() {
		int[] arr=new int[] {1,3,5,2,5,8,7,9};
		int target=8,i=0,j=arr.length-1;
		Arrays.sort(arr);
		while(i<j) {
			if(target==arr[i]+arr[j]) {
				System.out.println(arr[i]+" "+arr[j]);
				i++;
				j--;
			}
			else if(target>arr[i]+arr[j]){
				i++;
			}
			else {
				j--;
			}
			
			
		}
	}

}
