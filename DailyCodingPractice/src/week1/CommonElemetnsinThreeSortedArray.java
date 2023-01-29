package week1;

public class CommonElemetnsinThreeSortedArray {
	public static void method() {
		int[] arr1=new int[] {1, 5, 5};
		int[] arr2=new int[] {3, 4, 5, 5, 10};
		int[] arr3=new int[] {5, 5, 10, 20};
		int i=0,j=0,k=0;
		while(i<arr1.length&&j<arr2.length&&k<arr3.length) {
			if(arr1[i]==arr2[j]&&arr1[i]==arr3[k]) {
				System.out.println(arr1[i]);
				i++;
				j++;
				k++;
			}
			else if(arr1[i]<arr2[j]&&arr1[i]<arr2[k]) {
				i++;
			}
			else if(arr2[j]<arr3[k]) {
				j++;
			}else {
				k++;
			}
		}
	}
	public static void method2() {
		int i = 0, j = 0, k = 0;
		int[] ar1=new int[] {3,4,5,8,9,10,11};
		int[] ar2=new int[] {6,7,8,11};
		int[] ar3=new int[] {1,2,3,6,7,8,11};

		while (i < ar1.length && j < ar2.length && k < ar3.length)

		{

		if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {

		System.out.print(ar1[i] + " ");

		i++;

		j++;

		k++;

		}

		else if (ar1[i] < ar2[j])

		i++;

		else if (ar2[j] < ar3[k])

		j++;

		else

		k++;

		}
	}

}
