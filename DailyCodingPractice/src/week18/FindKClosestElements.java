package week18;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class FindKClosestElements {
	class Pair {
		int v;
		int i;
		char ch;

		public Pair(int i, int v, char ch) {
			this.i = i;
			this.v = v;
			this.ch = ch;
		}
	}

	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		List<Integer> res = new ArrayList<>();

		if (x <= arr[0]) {
			int i = 0, c = 0;
			while (c < k && i < arr.length) {
				res.add(arr[i++]);
				c++;
			}
			return res;

		} else if (x >= arr[arr.length - 1]) {
			int i = arr.length - 1, c = 0;
			while (c < k && i >= 0) {
				res.add(arr[i--]);
				c++;
			}
			return res;

		} else {
			int left = 0, right = arr.length - 1;
			int start = 0, end = arr.length - 1;
			while (start <= end) {
				int mid = (start + end) / 2;
				if (x == arr[mid]) {
					left = mid;
					right = mid;
					break;
				}
				if (x < arr[mid]) {
					left = start;
					right = mid;
					end = mid - 1;
				} else if (x > arr[mid]) {
					left = mid;
					right = end;
					start = mid + 1;

				}
			}
			int c = 0;
			PriorityQueue<Pair> p = new PriorityQueue<>((p1, p2) -> {
				return p2.v - p1.v;
			});
			if (left == right) {
				res.add(arr[left]);
				
				c++;
			}
			if (left - 1 >= 0)
				p.add(new Pair(left - 1, arr[left - 1], 'L'));
			if (right + 1 < arr.length)
				p.add(new Pair(right + 1, arr[right + 1], 'R'));
			while (c < k && !p.isEmpty()) {
				Pair pair = p.poll();
				c++;
				res.add(arr[pair.i]);
				if (pair.ch == 'L' && pair.i > 0) {
					p.add(new Pair(pair.i - 1, arr[pair.i - 1], 'L'));
				}
				if (pair.ch == 'R' && pair.i + 1 < arr.length) {
					p.add(new Pair(pair.i + 1, arr[pair.i + 1], 'R'));
				}

			}

			return res;

		}

	}

}
