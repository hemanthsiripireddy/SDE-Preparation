package strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharactersUsingMap {
	

	public static void method() {
		String s="abcabcbb";
		int res=lengthOfLongestSubstring(s);
		System.out.println(res);
	}
	 public static int lengthOfLongestSubstring(String s) {
	        Map<Character,Integer>map=new HashMap<>();
	        int start=0,end=0;
	        int res=0;
	        while(end<s.length()){
	            if(!map.containsKey(end)||map.get(s.charAt(end))<start){
	                res=Math.max(res,end-start+1);
	                map.put(s.charAt(end),end);
	               
	                end++;
	            }else{
	                start=map.get(s.charAt(end))+1;
	               // map.put(s.charAt(end),end);
	            }
	             
	        }
	        return res;
	        
	    }
}
