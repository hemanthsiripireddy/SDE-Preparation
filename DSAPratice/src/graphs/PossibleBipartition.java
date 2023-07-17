package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class PossibleBipartition {
	public static void method() {
		int n=3;
		int[][] dislikes= {{1,2},{1,3},{2,3}};
		boolean res=possibleBipartition(n, dislikes);
		System.out.println(res);
	}
	public  static boolean possibleBipartition(int n, int[][] dislikes) {
		Map<Integer, List<Integer>> map = new HashMap<>();

		for (int i = 1; i <= n; i++) {
			map.put(i, new ArrayList<>());

		}
		for (int[] cur : dislikes) {
			int u = cur[0];
			int v = cur[1];
			map.get(u).add(v);
			map.get(v).add(u);
		}
		int[] color = new int[n + 1];
		Arrays.fill(color, -1);
		for (int i = 1; i <= n; i++) {
			if (color[i] == -1) {
				if (!canPartition(color, i, map))
					return false;
			}
		}
		return true;

	}

	public  static boolean canPartition(int[] color, int index, Map<Integer, List<Integer>> map) {
		color[index] = 1;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(index);
		while (!queue.isEmpty()) {
			int cur = queue.poll();

			for (int i : map.get(cur)) {
				if (color[cur] == color[i])
					return false;
				if (color[i] == -1) {
					color[i] = 1 - color[cur];
					queue.add(i);
				}
			}

		}
		return true;
	}

}
