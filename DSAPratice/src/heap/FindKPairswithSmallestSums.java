package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairswithSmallestSums {
	class IndexValuePair {
		int index;
		int value;

		public IndexValuePair(int index, int value) {
			this.index = index;
			this.value = value;
		}
	}

	class Pair {
		IndexValuePair v1;
		IndexValuePair v2;

		public Pair(IndexValuePair v1, IndexValuePair v2) {
			this.v1 = v1;
			this.v2 = v2;
		}
	}

	public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		int i = 0;

		List<List<Integer>> res = new ArrayList<>();
		PriorityQueue<Pair> p = new PriorityQueue<>((p1, p2) -> {
			return p1.v1.value + p1.v2.value - p2.v1.value - p2.v2.value;
		});
		IndexValuePair p1=new IndexValuePair(0, nums1[0]);
		IndexValuePair p2=new IndexValuePair(0, nums2[0]);
		p.add(new Pair(p1,p2 ));
		while (!p.isEmpty() && i < k) {
			Pair pair = p.poll();
			res.add(Arrays.asList(pair.v1.value, pair.v2.value));
			int first = pair.v1.index;
			int second = pair.v2.index;
			if (second == 0 && first + 1 < nums1.length) {
				 p1 = new IndexValuePair(first + 1, nums1[first + 1]);
				 p2 = new IndexValuePair(0, nums2[0]);
				p.add(new Pair(p1, p2));

			}
			if (second + 1 < nums2.length) {
				 p1 = new IndexValuePair(first, nums1[first]);
				 p2 = new IndexValuePair(second + 1, nums2[second + 1]);
				p.add(new Pair(p1, p2));

			}
			i++;
		}
		return res;

	}

}
