package week5;

public class Fib {
	public void method() {
		int n=9;
		int[] fibArr=new int[n+1];
		fibonacci(n,fibArr);
		for(int i=0;i<=n;i++) {
			System.out.print(fibArr[i]+" ");
		}
		
		
	}
	public  int fibonacci(int n,int[] fibArr) {
		//Integer fibArr[] = new Integer[n];
		if (n == 0) {
			fibArr[0] = 0;
			
			
		} else if(n==1) {
			fibArr[1] = 1;
		}
		else {
			fibArr[n] = fibonacci(n - 1,fibArr) + fibonacci(n - 2,fibArr);
		}
		return fibArr[n];
	}
}
