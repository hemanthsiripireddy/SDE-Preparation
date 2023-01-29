package recursion;

public class TraingleSum {
	public static void method() {
		int[] arr=new int[] {1,2,3,4,5};
		traingleSum(arr,arr.length);
	}

	private static void traingleSum(int[] arr, int length) {
		// TODO Auto-generated method stub
		if(length==1) {
			System.out.println(arr[0]);
			return ;
		}
			
		int[] temp=new int[length-1];
		for(int i=0;i<length-1;i++) {
			temp[i]=arr[i]+arr[i+1];
		}
		traingleSum(temp,temp.length);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
