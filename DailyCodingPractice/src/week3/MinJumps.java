package week3;

public class MinJumps {
	int[] arr;
    public int jump(int[] nums) {
        arr=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }

        return helper(nums,0);
    }
     public  int helper(int[] arr,int i){
	        if(i==arr.length-1)
	        return 0;
            if(this.arr[i]!=-1)
            return this.arr[i];
	        int min=Integer.MAX_VALUE;
	      //  System.out.println(i);
	        int l=Math.min(i+arr[i],arr.length-1);
	        for(int j=i+1;j<=l;j++){
               
	            min=Math.min(helper(arr,j)+1,min);
	        }

            if(min==Integer.MAX_VALUE)
	        min= min/2;
            this.arr[i]=min;
            return min;

	        
	    }

}
