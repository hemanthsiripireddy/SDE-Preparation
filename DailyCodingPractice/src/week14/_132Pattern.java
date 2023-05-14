package week14;

import java.util.Stack;

public class _132Pattern {
	 public boolean find132pattern(int[] nums) {
	        int min=nums[0];
	        Stack<Pair<Integer,Integer>>stack=new Stack<>();
	        for(int i=0;i<nums.length;i++){
	            while(stack.size()!=0&&nums[i]>=stack.peek().getKey())
	            stack.pop();
	            if(stack.size()!=0&&stack.peek().getValue()<nums[i])return true;
	            stack.push(new Pair(nums[i],min));
	            min=Math.min(min,nums[i]);

	        }
	        return false;
	        
	    }

}
