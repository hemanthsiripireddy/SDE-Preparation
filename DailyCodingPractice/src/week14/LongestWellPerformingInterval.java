package week14;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LongestWellPerformingInterval {
	public static void method() {
		int[] arr= {6,6,6,6,6,9,9,9,9,9};
		int res=longestWPI(arr);
		System.out.println(res);
	}
	 public  static int longestWPI(int[] hours) {
		  int res=0;
	      int[] preSum=new int[hours.length+1];
	      for(int i=1;i<hours.length+1;i++){
	        preSum[i]=preSum[i-1]+(hours[i-1]>8?1:-1);
	      }
	      Stack<Integer>stack=new Stack<>();
	      for(int i=0;i<hours.length+1;i++){
	        if(stack.size()==0||preSum[stack.peek()]>preSum[i]){
	          stack.push(i);
	        }
	      }
	      for(int i=hours.length;i>=0;i--){
	        while(stack.size()!=0&&preSum[stack.peek()]<preSum[i]){
	          res=Math.max(res,i-stack.pop());
	        }
	      }
	      return res;
	        
	    }
	        
	    }


