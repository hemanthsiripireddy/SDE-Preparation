package dp;

import java.util.Arrays;

public class IntegerBreak {
	public static void method() {
		int n=10;
		int res=integerBreak(n);
		System.out.println(res);
	}
	static int[] dp;

	public static  int integerBreak(int n) {
		if (n == 2)
			return 1;
		if (n == 3)
			return 2;
		if (n == 4)
			return 4;
		dp = new int[n + 1];

		if (n % 2 == 0)
			return compute(n / 2) * compute(n / 2);
		else
			return compute(n / 2 + 1) * compute(n / 2 );

	}
	

	public static int compute(int n) {
		int[] arr=new int[45];
		Arrays.fill(arr, 1);
		if (n <= 4)
			return n;
		if (dp[n] != 0)
			return dp[n];
		int ans = (n % 2 == 0) ? compute(n / 2) * compute(n / 2) : compute(n / 2 + 1) * compute(n / 2 );
		dp[n] = ans;
		return ans;
	}

}
