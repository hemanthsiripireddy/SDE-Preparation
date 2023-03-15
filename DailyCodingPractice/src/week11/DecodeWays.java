package week11;

public class DecodeWays {
	int[] dp;

	public int numDecodings(String s) {
		dp = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			dp[i] = -1;

		}
		return decode(s, 0);

	}

	public int decode(String s, int i) {
		// 11106
		if (dp[i] != -1)
			return dp[i];
		

		if (s.charAt(i) == '0') {
			dp[i] = 0;
			return 0;

		}

		if (i == s.length() - 1) {
			dp[i] = 1;
			return 1;

		}

		if (i + 1 == s.length() - 1 && Integer.parseInt(s.substring(i, i + 2)) <= 26) {
			int res = 1 + decode(s, i + 1);
			dp[i] = res;
			return res;
		}
		int res = decode(s, i + 1);

		if (Integer.parseInt(s.substring(i, i + 2)) <= 26)
			res += decode(s, i + 2);
		dp[i] = res;
		return res;
	}

}
