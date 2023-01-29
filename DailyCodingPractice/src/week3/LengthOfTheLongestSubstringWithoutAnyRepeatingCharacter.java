package week3;

import java.util.HashSet;
import java.util.Set;

public class LengthOfTheLongestSubstringWithoutAnyRepeatingCharacter {
	public static void method() {
		//abcddcba
		//abcabcbb
		//bbbbb
		int maxLen=0;
		String str="hemanth";
		Set<Character> set=new HashSet();
		int start=0,end=0;
		while(end<str.length()) {
			if(set.add(str.charAt(end))) {
				maxLen=Math.max(maxLen, end-start+1);
				end++;
			}else {
				
				set.remove(str.charAt(start++));
			}
		}
		System.out.println("Max Lenght is: "+maxLen);
	}
	

}
