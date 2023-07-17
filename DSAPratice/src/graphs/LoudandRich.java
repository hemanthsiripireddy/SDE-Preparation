package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoudandRich {
	class Node {
		int name;
		List<Node> next;

		public Node(int name) {
			this.name = name;
			next = new ArrayList<>();
		}

	}

	public int[] loudAndRich(int[][] richer, int[] quiet) {

		Map<Integer, Node> map = new HashMap<>();
		Map<Integer, Pair<Integer, Integer>> map2 = new HashMap<>();
		for (int i = 0; i < quiet.length; i++) {
			map.put(i, new Node(i));

		}
		for (int i = 0; i < richer.length; i++) {
			map.get(richer[i][1]).next.add(map.get(richer[i][0]));
		}
		int[] res = new int[quiet.length];
		for (int i = 0; i < quiet.length; i++) {
			Pair<Integer, Integer> pair = compute(i, map.get(i), map2, quiet);
			res[i] = pair.getKey();

		}
		return res;

	}

	public Pair<Integer, Integer> compute(int n, Node node, Map<Integer, Pair<Integer, Integer>> map, int[] quiet) {
		if (map.containsKey(n))
			return map.get(n);
		Pair<Integer, Integer> pair = new Pair(n, quiet[n]);
		for (int i = 0; i < node.next.size(); i++) {
			Pair<Integer, Integer> cur = compute(node.next.get(i).name, node.next.get(i), map, quiet);
			if (cur.getValue() < pair.getValue()) {
				pair = new Pair(cur.getKey(), cur.getValue());
			}
		}
		return pair;

	}

}
