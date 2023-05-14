package heap;

public class HeapSortDemo {
	public static void method() {
		int[] arr= {9,8,7,6,5,4,3,2,1};
		new HeapSort().sort(arr, arr.length);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
