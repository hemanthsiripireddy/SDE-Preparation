package bitManupulation;

public class CheckIfElementIsPowerOf2 {
	public static void method() {
		int n=64;
		if((n&n-1)==0)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
