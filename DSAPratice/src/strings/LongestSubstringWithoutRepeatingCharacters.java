package strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void method() {
		int res=lengthOfLongestSubstring("tmmzuxt");
		System.out.println(res);
		
	}
	public static  int lengthOfLongestSubstring(String s) {
        int res=0;
       String str=s;
       int start=0,end=0;
       Set<Character>set=new HashSet<>();
       while(end<str.length()){
           if(set.add(str.charAt(end))){
               res=Math.max(res,end-start+1);
               end++;
           }else{
               while(str.charAt(start)!=str.charAt(end)){
            	   set.remove(str.charAt(start));
                   start++;
                  
               }
               set.remove(str.charAt(end));
               start++;
               
           }


       }
       return res;
       
   }

}
