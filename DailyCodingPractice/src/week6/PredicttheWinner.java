package week6;

public class PredicttheWinner {
	public static void method() {
		int[] arr= {1,5,2};
		boolean ans=PredictTheWinner(arr);
		System.out.println(ans);
	}
	public static boolean PredictTheWinner(int[] nums) {
		int p1 = 0, p1t = 1, p2 = 0, p2t = 0;
		int start = 0, end = nums.length - 1;
		return helper(nums, start, end, p1, p2, 1);

	}

	public static boolean helper(int[] nums, int start, int end, int p1, int p2, int flag) {
		if (start > end) {
			if (p1 >= p2)
				return true;
			return false;

		}
		if (flag == 1) {
			return helper(nums, start + 1, end, p1 + nums[start], p2, 0)
					|| helper(nums, start, end - 1, p1 + nums[end], p2, 0);
		} else {
			return (helper(nums, start + 1, end, p1, p2 + nums[start], 1)
					&& helper(nums, start, end - 1, p1, p2 + nums[end], 1));

		}
	}

}
