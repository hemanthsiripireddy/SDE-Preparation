package week2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindRankofElementsInArray {
	public static void method() {
		//15, 12, 11, 10, 9
		//22, 11, 44, 66, 55
		//10, 20, 30, 40, 50
		//10, 10, 10, 10, 20
		int[] arr=new int[] {10, 10, 10, 10, 20};
		
		for(int i=0;i<arr.length;i++) {
			int rank=1;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>arr[j])
					rank++;
				
			}
			//System.out.println("Rank of "+arr[i]+" is :"+rank);
			System.out.print(rank+" ");
		}
	}
	public static void method2() {
		int[] arr=new int[] {5,1,2,3,4,5,5,5,6};
		int[] arr2=arr.clone();
		Arrays.sort(arr2);
		Map<Integer, Integer>map=new HashMap<>();
		map.put(arr2[0], 1);
		for(int i=1;i<arr2.length;i++) {
			if(arr2[i]!=arr2[i-1]) {
				map.put(arr2[i], map.get(arr2[i-1])+1);
			
		}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(map.get(arr[i])+" ");
		}
	}
	public static void method3() {
		int[] arr=new int[] {50,40,30,20,21};
		Arrays.sort(arr);
		int curRank=1;
		System.out.println(arr[0]+" : "+curRank);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				++curRank;
				System.out.println(arr[i]+" : "+curRank);
			}
			else {
				System.out.println(arr[i]+" : "+curRank);
			}
		}
		
	}
	public static void method4() {
		int[] A=new int[] {5,1,2,3,4,5,5,5,6};
		int n=A.length;
		float R[] = new float[n];

		for (int i = 0; i < n; i++) {

		int r = 1, s = 1;

		for (int j = 0; j < n; j++)

		{

		if (j != i && A[j] < A[i])

		r += 1;

		if (j != i && A[j] == A[i])

		s += 1;

		}

		R[i] = r + (float)(s - 1) / (float) 2;

		}

		for (int i = 0; i < n; i++)

		System.out.print(R[i] + " ");
	}

}
