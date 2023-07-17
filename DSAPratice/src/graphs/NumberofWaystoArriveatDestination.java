package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class NumberofWaystoArriveatDestination {
	public static void method() {
		int[][] roads= {{0,6,7},{0,1,2},{1,2,3},{1,3,3},{6,3,3},{3,5,1},{6,5,1},{2,5,1},{0,4,5},{4,6,2}
};
		int res=countPaths(7, roads);
		System.out.println(res);
	}
	public static int countPaths(int n, int[][] roads) {
		int[] dst = new int[n];
		int[] ways = new int[n];
		Arrays.fill(dst, Integer.MAX_VALUE);
		dst[0] = 0;
		ways[0] = 1;
		Map<Integer, List<Pair<Integer, Integer>>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(i, new ArrayList<>());
		}
		for (int i = 0; i < roads.length; i++) {
			map.get(roads[i][0]).add(new Pair(roads[i][1], roads[i][2]));
			map.get(roads[i][1]).add(new Pair(roads[i][0], roads[i][2]));

		}
		PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>((i, j) -> {
			return i.getValue() - j.getValue();
		});
		pq.add(new Pair(0, 0));

		while (pq.size() > 0) {
			Pair<Integer, Integer> cur = pq.poll();
			
			
			int res = countWays(cur.getKey(), map, dst, ways);
			ways[cur.getKey()] = res;
			for (Pair<Integer, Integer> pair : map.get(cur.getKey())) {
				if (dst[cur.getKey()] + pair.getValue() < dst[pair.getKey()]) {
					dst[pair.getKey()] = dst[cur.getKey()] + pair.getValue();
				 	pq.add(new Pair(pair.getKey(), dst[pair.getKey()]));
				}
			}
		}
		return ways[n - 1];

	}

	public static int countWays(int node, Map<Integer, List<Pair<Integer, Integer>>> map, int[] dst, int[] ways) {
		int mod = 1000000009;
		int res = 0;
		if(node==0) return 1;

		for (Pair<Integer, Integer> neigh : map.get(node)) {
			if ((dst[neigh.getKey()] + neigh.getValue()) % mod == dst[node]) {
				res = (res + ways[neigh.getKey()]) % mod;
			}

		}
		return res;
	}

}
