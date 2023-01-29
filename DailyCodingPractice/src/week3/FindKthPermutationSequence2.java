package week3;

import java.util.ArrayList;
import java.util.List;

public class FindKthPermutationSequence2 {
	static int[] fac;
	static List<Integer> list;
	static String ans="";
	public static void method() {
		int n=6,k=420;
		 fac=new int[n+1];
		fac[0]=1;
		for(int i=1;i<=n;i++) {
			fac[i]=fac[i-1]*i;
		}
		list=new ArrayList<>();
		for(int i=1;i<=n;i++) {
			list.add(i);
			
		}
		solve(n,k);
		System.out.println("ans: "+ans);
	}
	private static void solve(int n, int k) {
		// TODO Auto-generated method stub
		if(n==1) {
			ans+=list.get(0);
			return;
		}
		int index=k/fac[n-1];
		if(k%fac[n-1]==0)
			index--;
		ans+=list.get(index);
		list.remove(index);
		k=k-index*fac[n-1];
		solve(n-1,k);
		
	}

}
