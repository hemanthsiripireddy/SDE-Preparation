package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryWatch {
	List<String> res = new ArrayList<>();

	public List<String> readBinaryWatch(int turnedOn) {

		List<Integer> h = Arrays.asList(8, 4, 2, 1);
		List<Integer> m = Arrays.asList(32, 16, 8, 4, 2, 1);
		helper(0, turnedOn, h, m, 'h', 0, 0, 0);
		return res;

	}

	public void helper(int i, int n, List<Integer> h, List<Integer> m, char ch, int ht, int mt, int index) {
		if (ch == 'h' && ht > 12)
			return;
		if (ch == 'm' && mt > 60)
			return;
		if (i == n) {
			String a = "" + ht + ":" + ((mt <= 9) ? ("0" + mt) : (mt));
			res.add(a);
			return;

		}
		if (ch == 'm' && index == m.size())
			return;
		if (ch == 'h' && index == h.size() - 1)
			helper(i, n, h, m, 'm', ht, mt, 0);
		else
			helper(i, n, h, m, ch, ht, mt, index + 1);

		if (ch == 'h' && ht + h.get(index) <= 12) {
			if (index == h.size() - 1) {
				helper(i + 1, n, h, m, 'm', ht + h.get(index), mt, 0);
			} else {
				helper(i + 1, n, h, m, ch, ht + h.get(index), mt, index + 1);
			}

		} else if (ch == 'm' && mt + m.get(index) < 60) {
			helper(i + 1, n, h, m, ch, ht, mt + m.get(index), index + 1);
		}

	}

}
