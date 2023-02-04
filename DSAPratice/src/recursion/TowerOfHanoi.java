package recursion;

public class TowerOfHanoi {
	public static void method() {
		int n=2
				;
		int minSteps=minSteps(n,'s','d','a');
		System.out.println(minSteps);
	}

	private static int minSteps(int n, char s, char d, char a) {
		// TODO Auto-generated method stub
		if(n==1)
			return 1;
		int move1=minSteps(n-1,s,a,d);
		int move2=1;
		int move3=minSteps(n-1,a,d,s);
		return move1+move2+move3;
	}

}
