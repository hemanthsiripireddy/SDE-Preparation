package week6;

import java.util.ArrayList;
import java.util.List;

public class EliminationGame {
	public static void method() {
		int res = eliminationGame(9);
		System.out.println(res);

	}

	public static int eliminationGame(int n) {
		if (n == 1)
			return n;
		int start = 1, end = n, dif = 1, ans = 0, turn = 1;
		while (start < end) {
			if (turn == 1) {
				start = start + dif;
				if (n % 2 == 1) {
					end = end - dif;
					ans = start;
				} else
					ans = end;
				turn = 0;
			} else {
				end = end - dif;
				if (n % 2 == 1) {
					start = start + dif;

					ans = end;
				} else
					ans = start;
				turn = 1;
			}
			dif = dif * 2;
			n = n / 2;
		}
		return ans;

	}
}
