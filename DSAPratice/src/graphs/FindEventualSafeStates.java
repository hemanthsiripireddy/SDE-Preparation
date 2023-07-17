package graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class FindEventualSafeStates {
	public static void method() {
		List<String>res1=new ArrayList<>();
		res1.sort((s1,s2)->{
			return 1;
		});
		int[][] graphs= {{1,2},{2,3},{5},{0},{5},{},{}};
		List<Integer> res=eventualSafeNodes(graphs);
		for(int i:res) {
			System.out.print(i+" ");
		}
	}
	public static List<Integer> eventualSafeNodes(int[][] graph) {
		int[][] adjMatrix = graph;
		int n = graph.length;
		Map<Integer, List<Integer>> map = new HashMap<>();
		int[] indegree = new int[graph.length];
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < adjMatrix[i].length; j++) {
				List<Integer> list = map.getOrDefault(j, new ArrayList<>());
				list.add(i);
				map.put(j, list);
				indegree[i]++;
			}
		}
		for (int i = 0; i < indegree.length; i++) {
			if (indegree[i] == 0) {
				queue.add(i);
			}
		}
		List<Integer> res = new ArrayList<>();

		while (!queue.isEmpty()) {
			int i = queue.poll();
			res.add(i);

			if (map.containsKey(i)) {
				for (int j : map.get(i)) {
					indegree[j]--;
					if (indegree[j] == 0)
						queue.add(j);
				}
			}

		}
		Collections.sort(res);
		return res;

	}

}
