package week2;

public class SortTheArrayThatContains0s1s2s {
	public static void method() {
		//2,2,2,2,2,1,1,1,1,0,0,0,1,1,1,0,0,2,2,2
		int[] arr=new int[] {2,2,2,2,2,1,1,1,1,0,0,0,1,1,1,0,0,2,2,2};
		int left=0,right=arr.length-1;
		int i=0;
		while(i<=right) {
			if(arr[i]==0) {
				arr[i]=arr[left];
				arr[left++]=0;
				i++;
			}
			else if(arr[i]==2) {
				arr[i]=arr[right];
				arr[right--]=2;
				
				
				
			}else {
				i++;
			}
			
		}
		for( i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
