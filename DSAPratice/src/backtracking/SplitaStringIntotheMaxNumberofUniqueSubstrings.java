package backtracking;

import java.util.HashSet;
import java.util.Set;

public class SplitaStringIntotheMaxNumberofUniqueSubstrings {
	public static void method() {
		String s="aba";
		int res=maxUniqueSplit(s);
		System.out.println(res);
	}
	public static  int maxUniqueSplit(String s) {
        Set<String>set=new HashSet<>();
        return compute(0,s,set);
        
    }
    public static int compute(int index,String s,Set<String>set){
        if(index==s.length())
        return 0;
        int res=-1;
        for(int i=index;i<s.length();i++){
            String str=s.substring(index,i+1);

            if(!set.contains(str)){
                set.add(str);
                res=Math.max(res,compute(i+1,s,set));
                set.remove(str);
            }
        }
        return res+1;
    }

}
