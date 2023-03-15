package hashing;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateElements {
	

	public static void method() {
		int[] arr= {12,23,56,43,23,	12,1,10,1,29,1};
		System.out.println(countDuplicates(arr));
	}

	private static int countDuplicates(int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
		Map<Integer,Integer>map=new HashMap<>();
		for(int num:arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(int value:map.values()) {
			if(value>1)
				count++;
		}
		return count;
	}

}
