package week14;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {
	Map<Integer, Integer> map;
	int capacity;
	int s = 0;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		map = new LinkedHashMap<>();

	}

	public int get(int key) {
		if (map.containsKey(key)) {
			int v = map.get(key);
			map.remove(key);
			map.put(key, v);
			return v;
		}
		return -1;
	}

	public void put(int key, int value) {
		if (map.containsKey(key)) {

			map.put(key, value);
		} else {
			if (s == capacity) {
				int count = 1;
				int k = 0;

				for (Map.Entry<Integer, Integer> it : map.entrySet()) {
					if (count == 1) {
						k = it.getKey();

						break;
					}
					count++;
				}
				map.remove(k);
				map.put(key, value);
			} else {
				s++;
				map.put(key, value);

			}

		}

	}
}