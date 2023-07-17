package heap;

import java.util.PriorityQueue;

public class MaximumNumberofEventsThatCanBeAttended {
	public static  int maxEvents(int[][] events) {
		int res = 0;
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
			if (a[0] != b[0])
				return a[0] - b[0];
			return (a[1] - a[0]) - (b[1] - b[0]);
		});
		for (int i = 0; i < events.length; i++) {
			pq.add(events[i]);
		}
		int cur = pq.peek()[0];
		while (pq.size() != 0) {
			int[] arr = pq.poll();
			if (cur >= arr[0] && cur <= arr[1]) {
				res++;
				cur++;
			} else if (cur <= arr[1]) {
				res++;
				cur = arr[0] + 1;
			}

		}
		return res;

	}

}
