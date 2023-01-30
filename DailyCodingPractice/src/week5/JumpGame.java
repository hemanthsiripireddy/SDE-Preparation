package week5;

public class JumpGame {
	public static void  method() {
		int[] nums=new int[] {2,3,0,1,4};
		int res=jump(nums);
		System.out.println(res);
	}
	

	public static int jump(int[] nums) {
		int[] dp = new int[nums.length];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = -1;
		}

		return helper(nums, 0,dp);
	}

	public static int helper(int[] arr, int i,int[] dp) {
		if (i == arr.length - 1)
			return 0;
		if (dp[i] != -1)
			return dp[i];
		int min = Integer.MAX_VALUE;
		
		int l = Math.min(i + arr[i], arr.length - 1);
		for (int j = i + 1; j <= l; j++) {

			min = Math.min(helper(arr, j, dp) + 1, min);
		}

		if (min == Integer.MAX_VALUE)
			min = min / 2;
		dp[i] = min;
		return min;

	}
}
