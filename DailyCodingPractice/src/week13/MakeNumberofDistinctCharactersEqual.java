package week13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MakeNumberofDistinctCharactersEqual {
	public static void method() {
		String word1="ab",word2="abcc";//aabcd --abce
		boolean res= isItPossible(word1, word2);
		System.out.println(res);
		
	}
	public  static boolean isItPossible(String word1, String word2) {
		Map<Character,Integer>map1=new HashMap<>();
	      for(char ch : word1.toCharArray()){
	          map1.put(ch,map1.getOrDefault(ch,0)+1);
	      }
	      Map<Character,Integer>map2=new HashMap<>();
	      for(char ch : word2.toCharArray()){
	          map2.put(ch,map2.getOrDefault(ch,0)+1);
	      }
	      int c1=map1.size();
	      int c2=map2.size();
	      if(Math.abs(c1-c2)>2)
	        return false;
	       for(int i='a';i<='z';i++){
	           char ch=(char)i;
	           if(!map1.containsKey(ch))
	           continue;

	           if(map1.get(ch)==1){
	               map1.remove(ch);
	               c1--;
	           }else{
	               map1.put(ch,map1.get(ch)-1);
	           }
	           
	           for(int j='a';j<='z';j++){
	        	   int temp1=c1,temp2=c2;
	               char c=(char)j;
	               if(!map2.containsKey(c))
	               continue;
	               if(map2.get(c)==1) {
	            	   c2--;
	            	   map2.remove(c);
	            	   
	               }else {
	            	   map2.put(c,map2.get(c)-1);
	            	   
	               }
	               if(!map2.containsKey(ch)) {
		        	   c2++;
		        	   
		        	   
		           }
	             
	               if(!map1.containsKey(c))
	               c1++;
	               if(c2==c1)
	               return true;
	               c1=temp1;c2=temp2;
	               map2.put(c,map2.getOrDefault(c,0)+1);

	           }
	           
	            map1.put(ch,map1.getOrDefault(ch,0)+1);
	            c1=map1.size();
	            c2=map2.size();
	       }
	       return false;

    }

}
