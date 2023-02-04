package week5;

import java.util.Arrays;
import java.util.List;

public class Fibo {
	static int[] arr;
	public  static void method() {
		int n=8;
		
		arr=new int[n+1];
		for(int i=0;i<=n;i++) {
			arr[i]=-1;
		}
		fib(n);
		for(int i=0;i<=n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static int fib(int n) {
		if(arr[n]!=-1)
			return arr[n];
			
		if(n==0)
		{
			arr[n]=0;
		}else if(n==1) {
			arr[n]=1;
		}else {
			arr[n]=fib(n-1)+fib(n-2);
		}
		return arr[n];
		
	}

}
