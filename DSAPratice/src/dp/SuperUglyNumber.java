package dp;

import java.util.PriorityQueue;

public class SuperUglyNumber {
	public static void method() {
		int n=12;
		int[] primes= {2,7,13,19};
		int res=nthSuperUglyNumber(n, primes);
		System.out.println(res);
		
	}
	public static int nthSuperUglyNumber(int n, int[] primes) {

		PriorityQueue<Integer> q = new PriorityQueue<>();
		for (int j = 0; j < primes.length; j++) {
			q.add(primes[j]);
		}

		int[] arr = new int[n + 1];
		arr[0] = 1;
		int i = 1;
		while (i <= n) {
			int p = q.poll();
			if(arr[i-1]!=p)
			arr[i++] = p;
			for (int j = 0; j < primes.length; j++) {
				q.add(p * primes[j]);
			}
		}
		return arr[n-1];

	}

}
