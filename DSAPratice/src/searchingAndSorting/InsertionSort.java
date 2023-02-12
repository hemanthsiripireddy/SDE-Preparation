package searchingAndSorting;

public class InsertionSort {
	public static void method() {
		int[] arr = { 12, 1, 6, 2, 67, 87, 12, 11, 0, -9 };
		System.out.println("before sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		insertionSort(arr);
		System.out.println("\n after selection sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) {
			int val = arr[i];
			int j = i;
			while (j >= 1 && arr[j - 1] > val) {

				arr[j] = arr[j - 1];

				j--;
			}
			arr[j] = val;
		}

	}

}
