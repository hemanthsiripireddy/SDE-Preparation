package bitManupulation;

import java.util.HashSet;
import java.util.Set;

public class PartitiontoKEqualSumSubsets {
	
	public static void method() {
		int[] nums= {4,5,9,3,10,2,10,7,10,8,5,9,4,6,4,9};
		int k=5;
		boolean res=canPartitionKSubsets(nums, k);
		System.out.println(res);
	}

	public static boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;
        for(int val:nums){
            sum+=val;
        }
        if(sum%k!=0) return false;
        sum=sum/k;
        boolean visited[]=new boolean[nums.length];
        for(int i=0;i<k;i++){
            boolean ans=compute(0,nums,0,sum,visited);
            if(ans==false)
            return false;
        }
        return true;
        
    }
    public static  boolean compute(int index,int[] nums,int cur,int target,boolean[] visited){
        if(cur==target) return true;
        

        for(int i=index;i<nums.length;i++){
            if(!visited[i]&&cur+nums[i]<=target){
                visited[i]=true;
                boolean ans=compute(i+1,nums,cur+nums[i],target,visited);
                if(ans)return true;
                visited[i]=false;

            }
        }
        return  false;
    }
}
