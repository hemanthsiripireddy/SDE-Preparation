package arrays;

public class LargestElementTowardsLeftAndRight {
	public static void method() {
		int[] arr=new int[] {4,2,1,3,6,4};
		int[] leftMax=new int[arr.length];
		int maxSeenTillNow=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(maxSeenTillNow>arr[i])
				leftMax[i]=maxSeenTillNow;
			else {
				leftMax[i]=-1;
				maxSeenTillNow=arr[i];
			}
		}
		maxSeenTillNow=Integer.MIN_VALUE;
		int[] rightMax=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			if(maxSeenTillNow>arr[i])
				rightMax[i]=maxSeenTillNow;
			else {
				rightMax[i]=-1;
				maxSeenTillNow=arr[i];
			}
				
		}
		System.out.println("Max towards left: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(leftMax[i]+" ");
		}
		System.out.println("\nMax towards right: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(rightMax[i]+" ");
		}
		
	}

}
