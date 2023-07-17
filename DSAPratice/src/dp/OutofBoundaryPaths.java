package dp;

public class OutofBoundaryPaths {

	static int mod = 1000000007;
	static int[][][] dp;
	public static void method() {
		int m=2,n=2,maxMove=2,startRow=0,startColumn=0;
		int res=findPaths(m, n, maxMove, startRow, startColumn);
		System.out.println(res);
				
		
		
	}

	public static  int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {

		dp = new int[m + 1][n + 1][maxMove + 1];
		return compute(startRow, startColumn, maxMove, m, n);

	}

	public static int compute(int cr, int cc, int cmx, int m, int n) {
		if (cmx <= 0)
			return 0;
		if (cr >= m || cc >= n || cr == -1 || cc == -1)
			return 0;
		if (dp[cr][cc][cmx] != 0)
			return dp[cr][cc][cmx];
		int res = 0;
		if (cmx > 0) {
			if (cr + 1 == m)
				res++;
			if (cc + 1 == n)
				res++;
			if (cr == 0)
				res++;
			if (cc == 0)
				res++;
		}
		res = (res + compute(cr + 1, cc, cmx - 1, m, n)) % mod;
		res = (res + compute(cr - 1, cc, cmx - 1, m, n)) % mod;
		res = (res + compute(cr, cc - 1, cmx - 1, m, n)) % mod;
		res = (res + compute(cr, cc + 1, cmx - 1, m, n)) % mod;
		dp[cr][cc][cmx] = res;
		return res;

	}
}
