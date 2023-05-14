package week17;

import java.util.ArrayList;
import java.util.List;

public class ScrambleString {
	public static void method() {
		String s1="great";
		String s2="rgeat";
		boolean res=isScramble(s1, s2);
		System.out.println(res);
	}
	 public static  boolean isScramble(String s1, String s2) {
		 

	       List<String>res=rec(s1,0,s1.length()-1);
	       for(String str:res){
	           if(str.equals(s2))
	           return true;
	       }
	       return false;
	        
	    }
	    public static List<String> rec(String s1,int start,int end){
	          List<String>res=new ArrayList<>();
	        if(start==end){
	          res.add(s1.substring(start,end+1));
	          return res;
	        }
	        
	        
	        res.add(s1.substring(start,end+1));
	        for(int i=start;i<end;i++){
	           List<String>l1= rec(s1,start,i);
	            List<String> l2=rec(s1,i+1,end);
	            for(String str1:l1){
	                for(String str2:l2){
	                    res.add(str1+str2);
	                    res.add(str2+str1);
	                }
	            }


	        }
	        return res;
	       

	    }

}
