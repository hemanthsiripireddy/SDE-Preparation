package arrays;

public class MissingNumber {
	public static void method() {
		int[] arr=new int[] {1,2,3,4,6};
		int sum1=0,sum2=0;
		for(int i=1;i<=arr.length+1;i++) {
			sum1+=i;
		}
		for(int i=0;i<arr.length;i++) {
			sum2+=arr[i];
		}
		System.out.println(sum1-sum2);
	}

}
