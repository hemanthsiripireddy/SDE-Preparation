package searchingAndSorting;

public class LinearSearch {
	public static void method() {
		int[] arr= {1,5,2,44,6,23};
		int index=search(arr,22);
		System.out.println(index);
		
	}
	public static int search(int[] arr,int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num)
				return i;
				
		}
		return -1;
	}

}
