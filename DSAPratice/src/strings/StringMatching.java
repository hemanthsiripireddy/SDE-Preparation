package strings;

public class StringMatching {
	public static void method() {
		String str1="abcdefghijklmnopqrstuvwxyz";
		String str2="abcdefghijklmnopqrstuvwxyz";
		//boolean res=stringMathcingBruteForce(str1, str2);
		int res=rabinKarpAlgorithm(str1,str2);//stringMatchingKMPAlgorith(str1, str2);
		if(res==-1)
			System.out.println("No Match found");
		else
			System.out.println("Starting index is "+res);
			
		
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
	public static int stringMatchingKMPAlgorith(String str,String pattern) {
		int strLen=str.length();
		int patLen=pattern.length();
		int[] lps=new int[patLen];
		computeLps(lps,pattern);
		int j=0,i=0;
		//aabaaabaaac
		//aabaaac
		while(i<str.length()) {
			if(j==patLen) {
				return i-j;
			}
			if(str.charAt(i)==pattern.charAt(j)) {
				i++;
				j++;
			}else {
				if(j==0) {
					i++;
				}else if(lps[j-1]==-1) {
					j=0;
				}else {
					j=lps[j-1];
					//i++;
				}
			}
			
		}
		if(j==patLen) {
			return i-j;
		}
		return -1;
	}
	private static void computeLps(int[] lps, String pattern) {
		// TODO Auto-generated method stub
		int i=0,j=1;
		lps[0]=-1;
		//aabaaac
		while(j<pattern.length()) {
			if(pattern.charAt(j)==pattern.charAt(i)) {
				lps[j]=i+1;
				i++;
				j++;
			}
			else {
				if(i==0) {
					j++;
				}else if(lps[i-1]==-1) {
					i=0;
				}else {
					lps[j]=-1;
					i=lps[i-1];
					//i++;
				}
			}
			
		}
		
	}
	public static int rabinKarpAlgorithm(String str,String pattern) {
		if(str==null||str==""||str.length()<pattern.length())
			return -1;
		int n=pattern.length()-1;
		int patternVal=0;
		for(int i=0;i<pattern.length();i++) {
			patternVal+=(int)(pattern.charAt(i)-'a'+1)*Math.pow(10, n--);
		}
		n=pattern.length()-1;
		int textVal=0;
		for(int i=0;i<pattern.length();i++) {
			textVal+=(str.charAt(i)-'a'+1)*Math.pow(10,n--);
			
		}
		if(textVal==patternVal)
			return 0;
		n=pattern.length()-1;
		for(int i=1;i<str.length()-n;i++) {
			double sub=(str.charAt(i-1)-'a'+1)*Math.pow(10, n);
			double add=(str.charAt(i+n)-'a'+1)*Math.pow(10,0);
			textVal=(int)((textVal-sub)*10+add);
			if(textVal==patternVal)
				return i;
			
		}
		return -1;
	}

}
