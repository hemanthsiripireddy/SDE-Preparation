package recursion;

public class Atoi {
	public static void method() {
		String s="-23";
		int sign=1,i=0,j=s.length()-1;
		if(s.charAt(0)=='-') {
			sign=-1;
			i++;
			
		}
		int ans=atoiHelper(s,i,j);
		if(ans<=-1)
			System.out.println("string can't be converted to number");
		else {
			if(sign==-1)
				ans=-ans;
			System.out.println(ans);
		}
			
		
	}

	private static int atoiHelper(String s, int i, int j) {
		// TODO Auto-generated method stub
		if(i>j)
			return 0;
		int c=s.charAt(j)-'0';
		if(c<0||c>9)
			return -1;
		return 10*atoiHelper(s, i, j-1)+c;
		//return 0;
	}

}
