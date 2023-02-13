package searchingAndSorting;

public class MinimumSwapsTheory {
	public static void method() {
		int minSwaps = 0;
		int[] arr = { 1, 2, 3, 4, 0,6,5};
		//minSwaps=approachOne(arr);
		minSwaps = approachTwo(arr);
		System.out.println(minSwaps);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static int approachTwo(int[] arr) {
		// TODO Auto-generated method stub
		int minSwaps = 0;
		boolean[] visited = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int counter = 0;
			if (visited[i] != true) {
				int j = arr[i];
				while (visited[j] != true) {
					visited[j]=true;
					j=arr[j];
					counter++;

				}
				minSwaps+=(counter-1);
			}
			
		}
		return minSwaps;
	}

	private static int approachOne(int[] arr) {
		// TODO Auto-generated method stub
		int minSwaps = 0;
		for (int i = 0; i < arr.length; i++) {
			while (i != arr[i]) {
				int j = arr[i];
				arr[i] = arr[j];
				arr[j] = j;

				minSwaps++;
			}
		}
		return minSwaps;
	}

}
