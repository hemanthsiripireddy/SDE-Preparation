package orderedSet;

public class MyCalender1 {
	public static void method()
	{
		MyCalendarI mc=new MyCalendarI();
		int[][] arr= {{47,50},{33,41},{39,45},{33,42},{25,32},{26,35},{19,25},{3,8},{8,13},{18,27}
};
		for(int i=0;i<arr.length;i++) {
			boolean b1=mc.book(arr[i][0], arr[i][1]);
			System.out.println(b1);
					
			
		}
				
	}

}
