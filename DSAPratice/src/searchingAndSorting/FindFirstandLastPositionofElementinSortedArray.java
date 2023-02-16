package searchingAndSorting;

public class FindFirstandLastPositionofElementinSortedArray {
	public static void method() {
		int[] arr=new int[] {5,7,7,8,8,10};
		int[] res=searchRange(arr, 8);
		System.out.println(res[0]+": "+res[1]);
	}
	

	public static int[] searchRange(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int lksi=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>=target){
                if(nums[mid]==target)
                lksi=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        if(lksi==-1)
        return new int[]{-1,-1};
        int lkei=-1;start=0;end=nums.length-1;
         while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<=target){
                if(nums[mid]==target)
                lkei=mid;
              start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return new int[]{lksi,lkei};
        
    }
}
