package heap;

import java.util.List;

public class FindKPairswithSmallestSumsImp {
	public static void method() {
		int[] nums1= {1,7,11};
		int[] nums2= {2,4,6};
		int k=3;
		FindKPairswithSmallestSums f=new FindKPairswithSmallestSums();
		List<List<Integer>>res=f.kSmallestPairs(nums1,nums2,k);
		for(List<Integer>val:res) {
			for(int i:val) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
