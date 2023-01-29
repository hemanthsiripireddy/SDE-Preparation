package week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LengthofthelongestsubarraywithzeroSum {
	public static void method() {
		int[] arr=new int[] {6, -2, 2, -8, 1, 7, 4, -10};
		Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(!map.containsKey(sum))
            map.put(sum,i);
           
            
            
            
        }
        sum=0;
        int max=0,start=0,end=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
                if(max<i-map.get(sum)){
                    max=i-map.get(sum);
                    start=map.get(sum)+1;
                    end=i;
                }
                
           
            
        }
        
        System.out.println(" length is "+ max);
        for(int i=start;i<=end;i++){
           
        	System.out.print(arr[i]+" ");
        }
      
	}

}
