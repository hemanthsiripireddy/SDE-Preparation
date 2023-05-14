package week18;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TaskScheduler {
	class Pair {
		char ch;
		int f;
		int t;

		public Pair(char ch, int f, int t) {
			this.ch = ch;
			this.f = f;
			this.t = t;
		}

		public Pair(char ch, int f) {
			this.ch = ch;
			this.f = f;
			this.t = 0;
		}
	}

	public int leastInterval(char[] tasks, int n) {
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : tasks) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		PriorityQueue<Pair> p = new PriorityQueue<>((p1, p2) -> {
			return p2.f - p1.f;
		});
		PriorityQueue<Pair> temp = new PriorityQueue<>((p1, p2) -> {
			return p1.t - p2.t;
		});
		for (char ch : map.keySet()) {
			p.add(new Pair(ch, map.get(ch)));
		}
		int timeStamp = 1;
		Pair pair = p.poll();
		if (pair.f > 1) {
			temp.add(new Pair(pair.ch, pair.f - 1, timeStamp));
		}
		// timeStamp++;
		while (!temp.isEmpty() || !p.isEmpty()) {
			if (!temp.isEmpty() && timeStamp - temp.peek().t >= n && !p.isEmpty()) {
				if (temp.peek().f > p.peek().f) {
					pair = temp.poll();
					timeStamp++;
					if (pair.f > 1) {
						temp.add(new Pair(pair.ch, pair.f - 1, timeStamp));
					}

				} else {
					pair = p.poll();
					timeStamp++;
					if (pair.f > 1) {
						temp.add(new Pair(pair.ch, pair.f - 1, timeStamp));
					}

				}

			} else if (!temp.isEmpty() && timeStamp - temp.peek().t >= n) {
				pair = temp.poll();
				timeStamp++;
				if (pair.f > 1) {
					temp.add(new Pair(pair.ch, pair.f - 1, timeStamp));
				}
			} else if (!p.isEmpty()) {
				pair = p.poll();
				timeStamp++;
				if (pair.f > 1) {
					temp.add(new Pair(pair.ch, pair.f - 1, timeStamp));
				}
			} else {
				timeStamp++;
			}

		}

		return timeStamp;

	}

}
