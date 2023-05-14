package week15;

import java.util.HashSet;
import java.util.Set;

public class BeautifulArrangement {
	public static void method() {
		int input=3;
		countArrangement(input);
		System.out.println(res);
	}
	static  int res=0;
	    public static int countArrangement(int n) {
	       Set<Integer>set=new HashSet<>();
	       rec(set,1,n);
	       return res;
	        
	    }
	    public static void rec(Set<Integer>set,int it,int n){
	        if(set.size()==n)
	        {
	            res++;
	            return;
	        }
	        for(int i=1;i<=n;i++){
	            if((i%it==0||it%i==0)){
	            	if(set.add(i)) {
	                rec(set,it+1,n);
	                set.remove(i);}
	            }
	        }
	    }

}
