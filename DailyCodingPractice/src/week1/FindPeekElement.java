package week1;

public class FindPeekElement {
	public static void method() {
		int[] arr = new int[] {30,30,30,30,30,50,40,40  };
		for (int i = 0; i < arr.length; i++) {
			if (i - 1 >= 0 && i + 1 < arr.length && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				System.out.println(arr[i]);
			} else if (i == 0 && i + 1 < arr.length && arr[i] > arr[i + 1]) {
				System.out.println(arr[i]);

			} else if (i == arr.length - 1 && i - 1 >= 0 && arr[i] > arr[i - 1]) {
				System.out.println(arr[i]);
			}

		}

	}

	public static int findPeakUtil(

			int arr[], int low, int high, int n)

	{

		int mid = low + (high - low) / 2;

		if ((mid == 0 || arr[mid - 1] <= arr[mid])

				&& (mid == n - 1 || arr[mid + 1] <= arr[mid]))

			return mid;

		else if (mid > 0 && arr[mid - 1] > arr[mid])

			return findPeakUtil(arr, low, (mid - 1), n);

		else

			return findPeakUtil(

					arr, (mid + 1), high, n);

	}

	public static void findPeak()

	{
		int[] arr = new int[] { 30,30,30,30,30,40,40,50,40 };
		int n = arr.length;

		int k = findPeakUtil(arr, 0, n - 1, n);
		System.out.println(arr[k]);

	}
}
