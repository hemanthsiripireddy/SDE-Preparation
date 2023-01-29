package week1;

import java.util.Scanner;

public class MoveAllNegativeNumbersToRight {
	public static void method() {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter array size: ");
//		int n=sc.nextInt();
//		int[] arr=new int[n];
//		System.out.println("Enter array of elements: ");
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//			
//		}
		int[] arr = new int[] { 12, 11, 13, 5, -6, -7, -5, -3, -6 };
		int n = arr.length;
		moveNegative(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void moveNegative(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		// return arr;

	}

	public static void method2() {
		int[] arr = new int[] {1,3,4,-1,-1,12};
		int left = 0, right = arr.length - 1;

		while(left <= right)

		{

			if (arr[left] < 0 && arr[right] < 0)

				left++;

			else if (arr[left] > 0 && arr[right] < 0)

			{

				int temp = arr[left];

				arr[left] = arr[right];

				arr[right] = temp;

				left++;

				right--;

			}

			else if (arr[left] > 0 && arr[right] > 0)

				right--;

			else

			{

				left++;

				right--;

			}

		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
