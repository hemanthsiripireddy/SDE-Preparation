package hashing;

public class MajorityELementBoyer_Moore_Algorithm {
	public static void method() {
		int[] arr= {1,1,1,1,2,3,4,5};
		int res=majorityElement(arr);
		System.out.println(res);
	}
	private static int majorityElement(int[] arr) {
		// TODO Auto-generated method stub
		int cand=-1,votes=0;
		for(int num:arr) {
			if(votes==0) {
				cand=num;
				votes++;
			}
			else if(cand==num) {
				votes++;
			}else {
				votes--;
			}
		}
		return cand;
	}
	

}
