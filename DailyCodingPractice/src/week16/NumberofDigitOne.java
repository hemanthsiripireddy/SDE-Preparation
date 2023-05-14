package week16;

import java.util.HashMap;
import java.util.Map;

public class NumberofDigitOne {
	public static void method() {
		int res=countDigitOne(13);
		
		
		System.out.println("actual Result "+ res);
		//System.out.println();
	}
	 public static int countDigitOne(int n) {
		 if(n<=0)
		        return 0;
		        if(n<=9)
		        return 1;
		        Map<Integer,Integer>map=new HashMap<>();
		        map.put(9,1);
		        for(int i=9;i<Integer.MAX_VALUE&&i>0;i=i*10+9){
		            int prev=map.get(i);
		            map.put(i*10+9,prev*10+(i+1));
		        }
		        int divisor=1;
		        int temp=n;
		        while(temp/10>0){
		            divisor*=10;
		            temp=temp/10;
		        }
		        int res=0;
		       

		        int first_digit=n/divisor;
		        int rem=n%divisor;
		         res+=map.get(divisor-1)*first_digit;
		         if(first_digit==1)
		         res+=(rem+1);
		         else
		             res+=divisor;
		        res+=countDigitOne(rem);
		        return res;

	 }
}
