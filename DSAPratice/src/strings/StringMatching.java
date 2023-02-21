package strings;

public class StringMatching {
	public static void method() {
		String str1="abcdefghi";
		String str2="ghik";
		boolean res=stringMathcingBruteForce(str1, str2);
		System.out.println(res);
	}
	public static boolean stringMathcingBruteForce(String str,String pattern) {
		int m=str.length(),n=pattern.length();
		for(int i=0;i<=m-n;i++) {
			int j=0;
			while(j<n&&str.charAt(i+j)==pattern.charAt(j)) {
				j++;
			}
			if(j==n)
				return true;
		}
		return false;
		
	}

}
