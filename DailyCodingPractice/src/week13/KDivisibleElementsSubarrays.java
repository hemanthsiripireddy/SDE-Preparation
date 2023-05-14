package week13;

import java.util.HashSet;
import java.util.Set;

public class KDivisibleElementsSubarrays {
	public static void method() {
		int[] arr = {1,2,3,4 };
		int res = countDistinct(arr, 4, 1);
		System.out.println(res);
	}

	public static int countDistinct(int[] nums, int k, int p) {
		Set<String> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			StringBuilder sb = new StringBuilder();

			for (int j = i; j < nums.length; j++) {
				
				if (nums[j] % p == 0)
					count++;
				if (count <= p) {
					sb.append(nums[j] + "+");
					String s = new String(sb);
					set.add(s);
				} else {
					break;
				}
			}
		}
		return set.size();

	}

}
