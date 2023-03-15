package bitManupulation;

public class NumberOfSetBits {
	public static void method() {
		int n=7;//100
		int count=0;
		while(n>0) {
			count+=(n&1);
			n>>=1;
		}
	System.out.println(count);
	}

}
