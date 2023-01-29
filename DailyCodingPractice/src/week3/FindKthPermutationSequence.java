package week3;

import java.util.ArrayList;
import java.util.List;

public class FindKthPermutationSequence {
	public static void method2() {
		int n = 6, k = 420;
        String ans = getPermutation(n, k);
        System.out.println("The Kth permutation sequence is " + ans);
	}
	 static String getPermutation(int n, int k) {
	        int fact = 1;
	        ArrayList < Integer > numbers = new ArrayList < > ();
	        for (int i = 1; i < n; i++) {
	            fact = fact * i;
	            numbers.add(i);
	        }
	        numbers.add(n);
	        String ans = "";
	        k = k - 1;
	        while (true) {

	        	ans = ans + "" + numbers.get(k / fact);
	            numbers.remove(k / fact);
	            if (numbers.size() == 0) {
	                break;
	            }

	            k = k % fact;
	            fact = fact / numbers.size();
	        }
	        return ans;
	    }
	
	static List<String>list=new ArrayList<>();
	public static void method() {
		int n=9;
		int k=420;
		String str="";
		for(int i=1;i<=n;i++) {
			str+=i;
		}
		//System.out.println(str);
		permutation(str, 0, str.length()-1);
		System.out.println("Kth element is "+list.get(k-1));
		for(int i=0;i<list.size();i++) {
			System.out.println((i+1)+": "+list.get(i));
		}
	}
	public static void permutation(String str,int start,int end) {
		if(start>end) {
			list.add(str);
			return;
		}
		String str2=str;
		for(int i=start;i<=end;i++) {
			str=swap(str,start,i);
			permutation(str, start+1, end);
			str=str2;
		}
	}
	private static String swap(String str, int i, int j) {
		// TODO Auto-generated method stub
		char[] ch=str.toCharArray();
	char temp=ch[j];
//		ch[i]=ch[j];
//		ch[j]=temp;
	for(int it=j;it>i;it--) {
		ch[it]=ch[it-1];
	}
	ch[i]=temp;
		
		return String.valueOf(ch);
	}

}
