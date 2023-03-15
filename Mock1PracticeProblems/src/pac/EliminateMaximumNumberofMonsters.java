package pac;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class EliminateMaximumNumberofMonsters {
	
	 public static int eliminateMaximum(int[] dist, int[] speed) {
	       
		
		 double time[] =new double[dist.length];
	        for(int i=0;i<dist.length;i++){
	            time[i]=(double)dist[i]/speed[i];
	        }
	        Arrays.sort(time);
	        int res=0;
	        for(int i=0;i<dist.length;i++){
	          if(time[i]>i)
	          res++;
	          else
	        	  break;
	          

	        }
	        return res;
	        
	    }

}
