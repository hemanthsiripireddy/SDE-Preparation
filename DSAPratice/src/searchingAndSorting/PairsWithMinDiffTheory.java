package searchingAndSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairsWithMinDiffTheory {
	public  static void method() {
		int[] arr= {1,2,5,6,4,22,12,8,9};
		List<int[]> res=optimized(arr);
		for(int i=0;i<res.size();i++){
			System.out.println(res.get(i)[0]+": "+ res.get(i)[1]);
		}
		
	}

	private static List<int[]> optimized(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		List<int[]>res=new ArrayList<>();
		int minDiff=Integer.MAX_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			if(minDiff>=arr[i+1]-arr[i]) {
				
				if(minDiff!=arr[i+1]-arr[i])
					res=new ArrayList<>();
					minDiff=arr[i+1]-arr[i];
					res.add(new int[] {arr[i],arr[i+1]});
			}
			
		}
		return res;
	}

}
