package graphs;

import java.util.ArrayList;
import java.util.List;

public class Dummy {
	public static void method() {
		int[] p= {7,1,5,3,6,4};
		int res=maxProfit(p);
		System.out.println(res);
	}
	 public static int maxProfit(int[] prices) {
	        int profit=-prices[0];
	        int prev=prices[0];
	        for(int i=1;i<prices.length;i++){
	            if(prev>prices[i]){
	                profit+=prev;
	                if(i!=prices.length-1)
	                profit-=prices[i];
	               // prev=prices[i];
	            }else if(i==prices.length-1){
	                profit+=prices[i];
	                
	            }
	            prev=prices[i];
	        }
	        //return profit;
	        ArrayList<Integer>res=new ArrayList<>();
	        res.c
	        
	    }

}
