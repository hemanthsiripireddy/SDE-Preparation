package arrays;

public class SingleElementinaSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {3,3,7,7,10,11,11};
		int res=singleNonDuplicate(nums);
		System.out.println(res);

	}
	public static int singleNonDuplicate(int[] nums) {

        int start=0,end=nums.length-1;
        int mid=0;
        int ans=0;
        while(start<end){
             mid=start+(end-start)/2;
            if(nums[mid]==nums[mid-1]){
                if((mid-start-1)%2==1){
                    end=mid-2;
                    ans=mid-2;
                }else{
                    start=mid+1;
                    ans=mid+1;
                }

            }else if(nums[mid]==nums[mid+1]){
                if((end-mid-1)%2==1){
                    start=mid+2;
                    ans=mid+2;
                }else{
                    end=mid-1;
                    ans=mid-1;
                }

            }else
            return nums[mid];

        }
        return nums[ans];




        
    }

}
