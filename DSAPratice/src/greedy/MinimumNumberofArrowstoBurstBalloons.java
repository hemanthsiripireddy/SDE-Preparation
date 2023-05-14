package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberofArrowstoBurstBalloons {
	public static void method() {
		int[][] points= {{-2147483646,-2147483645},{2147483646,2147483647}};
		int res=findMinArrowShots(points);
		System.out.println(res);
	}
	public static int findMinArrowShots(int[][] points) {

		Arrays.sort(points, new Comparator<int[]>() {
			public int compare(int[] l1, int[] l2) {
				if((long)l1[1] - (long)l2[1]<0)
					return -1;
				return 1;
				
				

			}
		});
		int res = 1;
		int e = 0;
		for (int i = 1; i < points.length; i++) {

			if (points[i][0] > points[e][1]) {
				res++;
				e = i;

			}

		}
		return res;

	}

}
