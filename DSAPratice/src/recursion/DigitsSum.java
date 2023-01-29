package recursion;


public class DigitsSum {
	public static void methid() {
		int n=123456;
		int sum=findDigitSum(n);
		System.out.println(sum);
	}

	private static int findDigitSum(int n) {
		// TODO Auto-generated method stub
		if(n==0)
		return 0;
		return n%10+findDigitSum(n/10);
	}

}
