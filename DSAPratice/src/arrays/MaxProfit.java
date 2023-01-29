package arrays;

public class MaxProfit {
	public static void method() {
		int[] arr=new int[] {25,7,1,5,3,6,4,10};
		int minPriceSeenTillNow=Integer.MAX_VALUE;
		int maxProfit=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]-minPriceSeenTillNow>maxProfit) {
				maxProfit=arr[i]-minPriceSeenTillNow;
			}
			minPriceSeenTillNow=Math.min(minPriceSeenTillNow, arr[i]);
		}
		System.out.println(maxProfit);
	}

}
