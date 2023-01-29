package week1;

public class SearchElement {
	public static void method() {
		int[] arr = new int[] { 1, 3, 5, 7, 29 ,98};
		int target = 49, ans = 0, i = 0, j = arr.length - 1;
		while (i <= j) {
			int m = (i + j) / 2;
			if (arr[m] == target) {
				ans = m;
				break;
			} else if (target > arr[m]) {

				i = m + 1;
				if (i == arr.length) {
					ans = i;
					break;
				} else if ( target<arr[i] ) {
					ans = i;
					break;

				}

			} else {
				j = m - 1;
				if (j == -1) {
					ans = m;
					break;
				} else if ( target>arr[j] ) {
					ans = m;
					break;

				}

			}

		}
		

		System.out.println("Index can be: " + (ans+1));

	}

}
