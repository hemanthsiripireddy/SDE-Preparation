package week1;

import java.util.Arrays;

public class UnionAndIntersection {
	public static void method() {
		/*
		 * test 1:{1,1,1 ,3, 4, 5, 7,8,8,9,9},{1,1,1,2, 3, 5, 6,9}
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		int[] arr1 = new int[] { 36 ,37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47};
		int[] arr2 =new int[] { 46, 47, 48, 49, 50 ,51, 52, 53, 54 };
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		union(arr1, arr2);
		//intersection(arr1, arr2);
		//UnionArray(arr1,arr2);
		

	}

	public static void intersection(int[] arr1, int[] arr2) {
		int i = 0, j = 0, it = 0;
		int arr1Len = arr1.length, arr2Len = arr2.length;
		int size = Math.min(arr1Len, arr2Len);
		int[] arrAns = new int[size];
		while (i < arr1Len && j < arr2Len) {
			if (i + 1 < arr1Len && arr1[i] == arr1[i + 1]) {
				i++;
				continue;
			}
			if (j + 1 < arr2Len && arr2[j] == arr2[j + 1]) {
				j++;
				continue;
			}
			if (arr1[i] == arr2[j]) {
				arrAns[it++] = arr1[i];
				i++;
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				j++;

			}
		}
		System.out.println("\nIntersction is: ");
		for (i = 0; i < it; i++) {
			System.out.print(arrAns[i] + " ");
			
		}
		System.out.println();
		System.out.println("end");

	}

	public static void union(int[] arr1, int[] arr2) {
		int i = 0, j = 0, it = 0;
		int arr1Len = arr1.length, arr2Len = arr2.length;
		int[] arrAns = new int[arr1Len + arr2Len];

		while (i < arr1Len && j < arr2Len) {
			if (i + 1 < arr1Len && arr1[i] == arr1[i + 1]) {
				i++;
				continue;
			}
			if (j + 1 < arr2Len && arr2[j] == arr2[j + 1]) {
				j++;
				continue;
			}
			if (arr1[i] == arr2[j]) {
				arrAns[it++] = arr1[i];
				i++;
				j++;
			} else if (arr1[i] < arr2[j]) {
				arrAns[it++] = arr1[i++];
			} else {
				arrAns[it++] = arr2[j++];

			}
		}
		while (i < arr1Len) {
			if (i + 1 < arr1Len && arr1[i] == arr1[i + 1]) {
				i++;
				continue;
			}
			arrAns[it++] = arr1[i++];

		}

		while (j < arr2Len) {
			if (j + 1 < arr2Len && arr2[j] == arr2[j + 1]) {
				j++;
				continue;
			}
			arrAns[it++] = arr2[j++];

		}
		System.out.println("it is: "+it);

		System.out.println("\nUnion is: ");
		for (i = 0; i < it; i++) {
			System.out.print(arrAns[i] + " ");
		}

	}

	

}
