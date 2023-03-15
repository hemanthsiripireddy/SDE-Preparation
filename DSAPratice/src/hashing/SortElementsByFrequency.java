package hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortElementsByFrequency {
	public static void method() {
		int[] arr= {10,1,9,1,9,9,2,2,2,2,4,3,5,5,5,5,5};
		int[] res=sortElementsByFrequency(arr);
		for(int num:res) {
			System.out.print(num+" ");
		}
	}

	private static int[] sortElementsByFrequency(int[] arr) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList<>();
		Map<Integer,Integer>map=new HashMap<>();
		for(int num:arr) {
			list.add(num);
			map.put(num,map.getOrDefault(num, 0)+1);
		}
		Collections.sort(list,(o1,o2)->{
			return map.get(o1)==map.get(o2)?o1-o2:map.get(o1)-map.get(o2);
			//return 0;
		});
		int i=0;
		for(Integer num:list) {
			arr[i]=list.get(i++);
			
		}
		return arr;
	}

}
