package dp;

public class InterleavingString {
	public static void method() {
		String s1="aabcc";
		String s2="dbbca";
		String s3="aadbbcbcac";
		boolean res=isInterleave(s1, s2, s3);
		System.out.println(res);
	}
	public static boolean isInterleave(String s1, String s2, String s3) {
		int i = 0, j = 0, k = 0;
		while (i < s1.length() || j < s2.length() || k < s3.length()) {
			if (k < s3.length() && i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
				i++;
				k++;
			} else if (j < s2.length() && k < s3.length() && s2.charAt(j) == s3.charAt(k)) {
				j++;
				k++;
			} else
				return false;

		}
		if (i == s1.length() && j == s2.length() && k == s3.length())
			return true;
		return false;

	}

}
