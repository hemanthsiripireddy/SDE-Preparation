package dp;

public class CounttheNumberofSquareFreeSubsets {
	static int mod = 1000000000 + 7;
	public static void method() {
		int[] nums= {3,4,4,5};
		int res=squareFreeSubsets(nums);
		System.out.println(res);
	}

	public static  int squareFreeSubsets(int[] nums) {
		int[][] dp = new int[1000][1 << 9];
		int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		int[] primeMasks = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			primeMasks[i] = computeMasks(nums[i], primes);
		}
		int res = compute(0, 0, dp, primeMasks);
		return res;

	}

	public static int compute(int index, int mask, int[][] dp, int[] primeMasks) {
		if (index == primeMasks.length)
			return 1;
		if (dp[index][mask] != 0)
			return dp[index][mask];
		int res = 0;
		res += compute(index + 1, mask, dp, primeMasks);
		if (primeMasks[index] != -1 && (mask & primeMasks[index]) == 0) {
			res = (res + compute(index + 1, mask | primeMasks[index], dp, primeMasks)) % mod;
		}
		dp[index][mask] = res;
		return res;
	}

	public static int computeMasks(int num, int[] primes) {
		int res = 0;

		for (int i = 0; i < primes.length; i++) {
			int count = 0;
			while (num % primes[i] == 0) {
				count++;
				num = num / primes[i];
				if (count > 1)
					return -1;
			}
			if (count == 1)
				res = res | 1 << (i);
		}
		return res;
	}

}
