package bitManupulation;

public class ElementOccuringOnce {
	public static void method() {
		int[] arr= {4,4,4,1,1,2,2,3};
		int res=0;
		for(int num:arr) {
			res=res^num;
		}
		System.out.println(res);
	}

}
