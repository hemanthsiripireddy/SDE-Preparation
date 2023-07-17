package stackAndQueue;

public class MaximumSumCircularSubarray {
	public static void method() {
		int[] nums= {-2,4,-5,4,-5,9,4};
		int res=maxSubarraySumCircular(nums);
		System.out.println(res);
	}
	public static int maxSubarraySumCircular(int[] nums) {
        int res=Integer.MIN_VALUE;
        int sum=0;
        int i=0;
        int start=0;
        int n=nums.length;
        while(true){
            sum+=nums[(i)%n];
             res=Math.max(sum,res);
            if(sum<=0){
                sum=0;
                start=i+1;
                if(i+1>=nums.length) break;

            }else if(i+1>=nums.length){
                if(i+1>=start) break;

            }
            
            
           

            i++;
        }
         sum=0;
         int res2=Integer.MIN_VALUE;
        start=0;int end=n-1;
        while(start<=end){
            if(start==end){
                
                sum+=nums[start];
                start++;
                end--;
            }
            else if(nums[start]>=0&&nums[end]>=0){
                sum+=nums[start];
                sum+=nums[end];
                start++;
                end--;
            }else if(nums[start]>=0){
                sum+=nums[start];
                start++;
            }else if(nums[end]>=0){
                sum+=nums[end];
                end--;
            }else if(nums[start]>nums[end]){
                sum+=nums[start++];
            }else{
                sum+=nums[end--];
            }
            res2=Math.max(res2,sum);
        }
        return Math.max(res,res2);

        
    }

}
