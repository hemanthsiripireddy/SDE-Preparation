package pac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	 static int len=0;
	 public static void method() {
		 int[] nums= {1000000000,1000000000,1000000000,1000000000};
		 List<List<Integer>>res=fourSum(nums, -294967296);
		 for(List<Integer>l:res) {
			 for(int i:l) {
				 System.out.println(i);
			 }
		 }
		 
	 }
	    public static  List<List<Integer>> fourSum(int[] nums, int target) {
	        Arrays.sort(nums);
	        len=nums.length;
	        return fun(nums,target,4,0);
	       
	        
	    }
	    private static List<List<Integer>> fun(int[] nums,long target,int k,int index){
	        List<List<Integer>>res=new ArrayList<>();
	        if(k==2){
	            int start=index,end=len-1;
	            while(start<end){
	                if(target-nums[start]==nums[end]){
	                    List<Integer>temp=new ArrayList<>();
	                    temp.add(nums[start]);
	                    temp.add(nums[end]);
	                    res.add(temp);
	                    while(start<end&&nums[start]==nums[start+1])
	                    start++;
	                    while(start<end&&nums[end]==nums[end-1])
	                    end--;
	                    start++;
	                    end--;

	                }else if(nums[start]+nums[end]>target){
	                    end--;

	                }else{
	                    start++;
	                }
	            }
	        }
	       else{
	            for(int i=index;i<len-k+1;i++){
	            List<List<Integer>>temp=fun(nums,target-nums[i],k-1,i+1);
	            if(temp!=null){
	                for(List<Integer>l:temp){
	                    l.add(0,nums[i]);
	                }
	            }
	            res.addAll(temp);
	            while(i<len-1&&nums[i]==nums[i+1]){
	                i++;
	            }
	        }
	       }
	       return res;
	    }

}
