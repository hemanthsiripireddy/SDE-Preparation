package week5;

public class ArithmeticSlices {
	public static void method() {
		int[] arr = new int[] {1,2,3,4};
		int res = calc(arr);
		
		System.out.println(res);

	}

	public static int calc(int[] nums) {
		int count = 0;
		if (nums.length <= 2)
			return 0;
		int dif = nums[1] - nums[0];
		int start = 0, res = 0;
		for (int i = 2; i < nums.length; i++) {
			int curDif = nums[i] - nums[i - 1];
			if (curDif == dif) {
				if ((i - start + 1) >= 3) {
					res += (i - start - 1);

				}
			} else {

				dif = curDif;
				start = i - 1;
			}

		}
		
		return res;
	}

}
