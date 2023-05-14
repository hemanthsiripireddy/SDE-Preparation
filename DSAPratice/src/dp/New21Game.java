package dp;

public class New21Game {
	public static void method() {
		int n=21;
		int k=17;
		int maxPts=10;
		double res=new21Game(n, k, maxPts);
		System.out.println(res);
		
	}
	public static double new21Game(int n, int k, int maxPts) {
		if (n < k)
			return 0;
		if (n >= k + maxPts - 1)
			return 1;

		double[] dp = new double[k + maxPts];
		int i = 1;
		for (i = 1; i <= maxPts; i++) {
			dp[i] = (double) 1 / maxPts;
		}

		while (i <= k + maxPts - 1) {
			double cur = 0;
			for (int c = 1; c <= maxPts; c++) {

				cur = cur + (double) 1 / maxPts * dp[i - c];
			}
			dp[i++] = cur;
		}
		double res = 0;
		for (i = k; i <= n; i++) {
			res += dp[i];
		}
		return res;

	}

}
