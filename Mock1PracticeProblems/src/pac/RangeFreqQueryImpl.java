package pac;

public class RangeFreqQueryImpl {
	public static void method() {
		int[] arr= {12,33,4,56,22,2,34,33,22,12,34,56};
		RangeFreqQuery ob=new RangeFreqQuery(arr);
		System.out.println(ob.query(1, 2, 4));
		
	}

}
