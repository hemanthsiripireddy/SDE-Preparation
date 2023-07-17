package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
	public static void method() {
		int[] nums= {1,2,4,8};
		List<Integer> res=largestDivisibleSubset(nums);
		for(int i:res) {
			System.out.println(i);
		}
	}
	public static List<Integer> largestDivisibleSubset(int[] nums) {

		int[] l = new int[nums.length];
		int[] dp = new int[nums.length];
		Arrays.fill(dp, 1);
		Arrays.fill(l, -1);

		int max = 0;
		int index = -1;
		for (int i = 0; i < nums.length; i++) {

			for (int j = i - 1; j >= 0; j--) {

				if (nums[i] % nums[j] == 0 && dp[i]< dp[j] + 1) {
					dp[i] = dp[j] + 1;
					l[i] = j;

				}
			}
			if (dp[i] > max) {
				max = dp[i];
				index = i;
			}
		}
		List<Integer> res = new ArrayList<>();
		while (index != -1) {
			res.add(nums[index]);
			index = l[index];

		}
		return res;

	}

}
