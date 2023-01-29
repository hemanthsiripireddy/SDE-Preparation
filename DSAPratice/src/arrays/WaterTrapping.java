package arrays;

public class WaterTrapping {
	public static void method() {
		int[] arr=new int[] {3,0,2,0,4};
		int[] leftMax=new int[arr.length];
		int[] rightMax=new int[arr.length];
		int maxSeentTillNow=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			maxSeentTillNow=Math.max(maxSeentTillNow, arr[i]);
			leftMax[i]=maxSeentTillNow;
		}
		maxSeentTillNow=Integer.MIN_VALUE;
		for(int i=arr.length-1;i>=0;i--) {
			maxSeentTillNow=Math.max(maxSeentTillNow, arr[i]);
			rightMax[i]=maxSeentTillNow;
			
			
		}
		int totalWater=0;
		for(int i=0;i<arr.length;i++) {
			totalWater+=Math.min(leftMax[i], rightMax[i])-arr[i];
		}
		
		System.out.println(totalWater);
		System.out.println(2.01==2);
	}

}
