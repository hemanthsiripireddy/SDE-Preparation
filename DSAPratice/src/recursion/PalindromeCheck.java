package recursion;

public class PalindromeCheck {
	public static void method() {
		String str="123321";
		boolean ans=isPalidrome(str);
		System.out.println(ans);
	}

	private static boolean isPalidrome(String str) {
		// TODO Auto-generated method stub
		if(str=="")
		return true;
		return isPalindromeHelper(str,0,str.length()-1);
	}

	private static boolean isPalindromeHelper(String str, int i, int j) {
		// TODO Auto-generated method stub
		if(i>=j)return true;
		if(str.charAt(i)!=str.charAt(j))return false;
		return isPalindromeHelper(str, i+1, j-1);
		
	}

}
