package week2;

public class FindSubArrayWithGivenSum {
	public static void method() {
		// 1, 4, 20, 3, 10, 5:33
		// 1, 4, 0, 0, 3, 10, 5:7
		int[] arr = new int[] { 1,2,3,4,22,20};
		int sum = 42;
		int[] preSum = new int[arr.length + 1];
		// 0,1,2,3, 4, 5,6
		// 0,1,5,25,28,38,43

		for (int i = 0; i < arr.length; i++) {
			preSum[i + 1] = preSum[i] + arr[i];

		}
		int start = 0, end = 0;
		int flag = 0;
		while (end < arr.length) {

			if (preSum[end + 1] - preSum[start] == sum) {
				System.out.println("startIndex: " + start + "  endIndex: " + end);
				flag = 1;
				start++;
				end++;

			} else if (preSum[end + 1] - preSum[start] < sum) {
				end++;

			} else {

				if (start == end) {
					start++;
					end++;
				} else
					start++;
			}

		}
		if (flag == 0)
			System.out.println("no such sub array present ");

	}

	public static int subArraySum()

	{
		int[] arr = new int[] { 1,2,3,4,22,20};
		int sum = 22;
		int n=arr.length;

		int currentSum = arr[0], start = 0, i;

		for (i = 1; i <= n; i++) {

			while (currentSum > sum && start < i - 1) {

				currentSum = currentSum - arr[start];

				start++;

			}

			if (currentSum == sum) {

				int p = i - 1;

				System.out.println(

						"Sum found between indexes " + start

								+ " and " + p);

				return 1;

			}

			if (i < n)

				currentSum = currentSum + arr[i];

		}

		System.out.println("No subarray found");

		return 0;

	}

}
