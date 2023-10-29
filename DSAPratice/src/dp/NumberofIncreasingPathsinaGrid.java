package dp;

import java.util.SortedSet;

public class NumberofIncreasingPathsinaGrid {
	public static void main(String[] args) {
		int[][] grid= {{1,1},{3,4}};
		int res=countPaths(grid);
		System.out.println(res);
				

	}

	static int[][] dp;
	static int mod = 1000000009;

	public static int countPaths(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		dp = new int[m][n];
		int res = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (dp[i][j] != 0) {
					res = (res + dp[i][j]) % mod;
				} else {
					int ans = compute(i, j, grid);
					dp[i][j] = ans;
					res = (res + dp[i][j]) % mod;
				}
			}
		}
		
		return res;

	}

	public static int compute(int i, int j, int[][] grid) {

		if (dp[i][j] != 0)
			return dp[i][j];

		int ans = 1;
		if (i - 1 >= 0 && grid[i - 1][j] > grid[i][j]) {
			int cur = compute(i - 1, j, grid);
			ans = (ans + cur) % mod;
		}
		if (i + 1 < grid.length && grid[i + 1][j] > grid[i][j]) {
			int cur = compute(i + 1, j, grid);
			ans = (ans + cur) % mod;

		}
		if (j - 1 >= 0 && grid[i][j - 1] > grid[i][j]) {
			int cur = compute(i, j - 1, grid);
			ans = (ans + cur) % mod;

		}
		if (j + 1 < grid[0].length && grid[i][j + 1] > grid[i][j]) {
			int cur = compute(i, j + 1, grid);
			ans = (ans + cur) % mod;

		}

		dp[i][j] = ans;
		return (dp[i][j]) % mod;

	}

}
