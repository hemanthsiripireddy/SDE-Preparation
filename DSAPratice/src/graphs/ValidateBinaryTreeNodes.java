package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ValidateBinaryTreeNodes {
	static Set<Integer> mainSet = new HashSet<>();
	static Set<Integer> set = new HashSet<>();
	static int c = 0;
	public static void method() {
		int n=2;
		int[] leftChild= {-1,0};
		int[] rightChild= {-1,-1};
		boolean res=validateBinaryTreeNodes(n, leftChild, rightChild);
		System.out.println(res);
	}

	public static  boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		Set<Integer> point = new HashSet<>();

		for (int i = 0; i < n; i++) {
			map.put(i, new ArrayList<>());
			if (leftChild[i] != -1) {
				map.get(i).add(leftChild[i]);
				if (point.contains(leftChild[i]))
					return false;
				point.add(leftChild[i]);

			}

			if (rightChild[i] != -1) {
				map.get(i).add(rightChild[i]);
				if (point.contains(rightChild[i]))
					return false;
				point.add(rightChild[i]);

			}

		}

		for (int i = 0; i < n; i++) {
			if (!mainSet.contains(i) ) {
				boolean res = compute(i, map);
				if (res == false)
					return false;
				if (i > 0 && c == 0)
					return false;
				for (int val : set) {
					mainSet.add(val);
				}
				set = new HashSet<>();
				c = 0;
			}

		}
		return true;

	}

	public static boolean compute(int node, Map<Integer, List<Integer>> map) {
		if (set.contains(node))
			return false;
		set.add(node);
		if (mainSet.contains(node)) {
			if (c == 0) {
				c++;
				return true;
				
				
			}
				
			
			else
				return false;
		}
		if (map.containsKey(node)) {
			for (int cur : map.get(node)) {
				boolean res = compute(cur, map);
				if (res == false)
					return false;

			}
		}
		return true;
	}

}
