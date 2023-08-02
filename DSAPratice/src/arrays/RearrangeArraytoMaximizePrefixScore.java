package arrays;

import java.util.Arrays;

public class RearrangeArraytoMaximizePrefixScore {
	public static int maxScore(int[] nums) {
        Arrays.sort(nums);
        reverse(nums);
       // int start=findStart(nums);
        int start=findStart(nums);
        if(start==-1) {
        	if(sum(nums)>0)
        	return nums.length;
        	return 0;
        }
        int sum=0;
        int res=0;
        int i=0,j=start;
        int n=nums.length;
       while(i<n){
           if(j==n){
               if(nums[i]>=0)
               sum+=nums[i++];
               else
               break;
           }
           else if(sum+nums[j]<=0){
               if(nums[i]>=0){
                   sum+=nums[i++];
               }else
               break;

           }else{
               sum+=nums[j++];
           }
           if(sum>0)
           res++;

       }
        return res;
        
    }
   public static void reverse(int[] nums){
        int i=0,j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

    }
   public static int sum(int[] nums) {
	   int res=0;
	   for(int i=0;i<nums.length;i++) {
		   res+=nums[i];
	   }
	   return res;
   }
    public static  int findStart(int[] nums){
        
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) return i;
        }
        return -1;
    }

}
