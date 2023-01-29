package week3;

public class FibanaciiSeries {
	static int n1=0,n2=1,n3=0;
	
	public static void method() {
		int count=9;
		System.out.print(0+" "+1+" ");
		fib(count-2);
	}

	private static void fib(int count) {
		// TODO Auto-generated method stub
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
			fib(count-1);
		}
		
		
	}

}
