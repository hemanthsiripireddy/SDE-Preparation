package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LongestRepeatingCharacterReplacement {
	public static void method() {
		String s="AABABBA";
		int res=characterReplacement(s, 1);
		System.out.println(res);
	}
	 public static int characterReplacement(String s, int k) {
	        int[] count=new int[26];
	        int start=0,end=0;
	        int res=0;
	        boolean flag=true;
	        int index=0;
	        while(end<s.length()){
	           if(flag) {
	        	    index=s.charAt(end)-'A';
		            count[index]++;
	           }
	            int max=findMaxCount( count);
	            int c=end-start+1;
	            if(c-max<=k){
	                res=Math.max(res,c);
	                end++;
	                flag=true;
	            }else{
	                index=s.charAt(start)-'A';
	                count[index]--;
	                start++;
	                flag=false;
	            }

	        }

	        return res;
	        
	    }
	    public static int findMaxCount(int[] count){
	        int res=0;
	        for(int i:count){
	            res=Math.max(res,i);
	        }
	        return res;
	    }

}
