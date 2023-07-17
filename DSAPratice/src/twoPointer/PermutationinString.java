package twoPointer;

public class PermutationinString {
	public static void method() {
		String s1="ky";
		String s2="ainwkckifykxlribaypk";
		boolean res=checkInclusion(s1, s2);
		System.out.println(res);
	}
	public static boolean checkInclusion(String s1, String s2) {
		if (s1.length() > s2.length())
			return false;
		int c = 0;
		int[] per = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			per[s1.charAt(i) - 'a']++;
		}
		int[] cur = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			cur[s2.charAt(i) - 'a']++;
		}
		int dif = 0;
		for (int i = 0; i < 26; i++) {
			if (cur[i] != per[i])
				dif++;
		}
		if (dif == 0)
			return true;
		int start = 0, end = s1.length() - 1;
		while (end + 1 < s2.length()) {
			int r = s2.charAt(start) - 'a';
			if (cur[r] == per[r])
				dif++;
			cur[r]--;
			if (cur[r] == per[r])
				dif--;
			int a = s2.charAt(end + 1) - 'a';
			if (cur[a] == per[a])
				dif++;
			cur[a]++;
			
			if (cur[a] == per[a])
				dif--;
			if (dif == 0)
				return true;

			start++;
			end++;
		}
		return false;

	}

}
