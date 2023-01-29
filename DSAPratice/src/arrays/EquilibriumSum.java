package arrays;

public class EquilibriumSum {
	public static void method() {
		//1,1,1,1,6
		int[] arr=new int[] {1,2,1,3};
		int ans=equilibriumSum2(arr);
		System.out.println(ans);
	}

	private static int equilibriumSum(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0,leftSum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			sum-=arr[i];
			if(leftSum==sum)return i;
			leftSum+=arr[i];
				
		}
		return -1;
	}
	private static int equilibriumSum2(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0,leftSum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			
			if(leftSum==(sum-arr[i])/2)return i;
			leftSum+=arr[i];
				
		}
		return -1;
	}

}
