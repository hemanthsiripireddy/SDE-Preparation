package week6;

public class CountGoodNumber {
	static int mod = 1000000007;
	public static void method() {
		long n=328756947;
		int ans=countGoodNumbers(n);
		System.out.println(ans);
		
	}

	public static int countGoodNumbers(long n) {

		long first = ((n % 2 == 0) ? n / 2 : (n / 2 + 1));
		long second = n / 2;
		long val1 = pow(5, first);
		long val2 = pow(4, second);
		return (int) ((val1 * val2) % mod);

	}

	public static int pow(int x, long n) {
		if (n == 0)
			return 1;
		long temp = pow(x, n / 2);
		if (n % 2 == 0)
			return (int) ((temp * temp) % mod);
		else
			return (int) ((x * temp * temp) % mod);
	}

}
