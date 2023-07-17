package dp;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubstringsinWraparoundString {
	public static void method() {
		String s="cac";
		int res=findSubstringInWraproundString(s);
		System.out.println(res);
	}
	public static int findSubstringInWraproundString(String s) {
		int ms = 26, me = -1, mc = 0;
		int start = -1, end = -1, c = 0;
		int res = 0;
		start = s.charAt(0) - 'a';

		Set<Character> set = new HashSet<>();
		if (set.add(s.charAt(0)))
			res++;
		for (int i = 1; i < s.length(); i++) {
			if (set.add(s.charAt(i))) {
				res++;
			}
			if ((s.charAt(i - 1) == 'z' && s.charAt(i) == 'a')) {
				end = s.charAt(i) - 'a';
				c++;

			} else if (s.charAt(i - 1) + 1 == s.charAt(i)) {
				end = s.charAt(i) - 'a';
			} else {
				if (c == 0 && s.charAt(i - 1) - 'a' == start) {
					start = s.charAt(i) - 'a';
					continue;
					
				}
					
				if (ms == 26 && me == -1 && mc == 0) {

					if (c == 0) {
						int val = end - start + 1;
						res += nCr(val, 2);
					} else {
						int va = 0;
						va += ((c - 1) * 26);
						int left = 26 - start;
						int right = end + 1;
						va = va + left + right;
						res += nCr(va, 2);

					}

					ms = start;
					me = end;
					mc = c;

				} else {

					if (c > mc) {
						int val = (c - mc) * 26;
						if (start < ms)
							val += (ms - start);
						else if (ms < start)
							val += (start - ms);
						if (end > me)
							val += (end - me);
						else if (end < me)
							val += (me - end);
						mc = c;
						ms = start;
						me = end;

					} else if (c == mc && (start < ms || end > me)) {
						int left = start < ms ? ms - start : 1;
						int right = end > me ? end - me : 1;
						res += (left * right);
						if (start < ms)
							ms = start;
						if (end > me)
							me = end;
					}
				}
				start = s.charAt(i) - 'a';
				c = 0;

			}
		}
		if (c == 0 && s.charAt(s.length() - 1) - 'a' == start)
			return res;
		if (ms == 26 && me == -1 && mc == 0) {

			if (c == 0) {
				int val = end - start + 1;
				res += nCr(val, 2);
			} else {
				int va = 0;
				va += ((c - 1) * 26);
				int left = 26 - start;
				int right = end + 1;
				va = va + left + right;
				res += nCr(va, 2);

			}

			ms = start;
			me = end;
			mc = c;

		} else {

			if (c > mc) {
				int val = (c - mc) * 26;
				if (start < ms)
					val += (ms - start);
				else if (ms < start)
					val += (start - ms);
				if (end > me)
					val += (end - me);
				else if (end < me)
					val += (me - end);
				mc = c;
				ms = start;
				me = end;

			} else if (c == mc && (start < ms || end > me)) {
				int left = start < ms ? ms - start : 1;
				int right = end > me ? end - me : 1;
				res += (left * right);
				if (start < ms)
					ms = start;
				if (end > me)
					me = end;
			}
		}

		return res;

	}

	public static int fac(int n) {
		
		return n*(n-1);
	}

	public static int nCr(int n, int r) {
		int res = 1;
		res = fac(n) / (  2);
		return res;
	}

}
