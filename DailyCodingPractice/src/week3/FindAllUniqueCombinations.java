package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindAllUniqueCombinations {
	static List<List<Integer>>ans=new ArrayList<>();
	public static void method2() {
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9,10};
		int target=8;
		List<Integer> list=new ArrayList<>();
		combinationSum(arr,0,target,list);
		for(int i=0;i<ans.size();i++) {
			for(int j=0;j<ans.get(i).size();j++) {
				System.out.print(ans.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	private static void combinationSum(int[] arr,int i, int target,List<Integer>list) {
		// TODO Auto-generated method stub
//		if(target==0) {
//		 ans.add(new ArrayList<>(list));
//		 return ;
//		}
//		if(i==arr.length)
//			return ;
		if(i==arr.length) {
			if(target==0)
				ans.add(new ArrayList<>(list));
			return;
		}
		if(arr[i]<=target) {
			list.add(arr[i]);
			combinationSum(arr, i, target-arr[i], list);
			list.remove(list.size()-1);
		}
		
		combinationSum(arr, i+1, target, list);
	}











	static Map<Integer,Integer>map=new HashMap<>();
	public  static void method() {
		//1,2,3,4,5,6,7,8,9,10
		//8
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9,10};
		int target=8;
		//Arrays.sort(arr);
		
		
	for( int i=0;i<arr.length;i++) {
		int val=arr[i];
		//map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
	
		while(val<target) {
		//	if(val!=arr[i])
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			if(i+1<arr.length) {
				helper(arr,i+1,target-val);
			}
			val+=arr[i];
			
		}
		//if(arr[i]!=val)
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		if(val==target) {
			for(Map.Entry<Integer, Integer>entry:map.entrySet()) {
				System.out.print(entry.getKey()+": "+entry.getValue()+" ");
				
			}
			System.out.println();
		}
		
		if(map.containsKey(arr[i])) {
			map.remove(arr[i]);
		}
	
		
	}
	System.out.println("end");
	}
	public static void helper(int[] arr,int i, int target) {
		if(i+1<arr.length) {
			helper(arr,i+1,target);
		}
		int val=arr[i];
		map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		while(val<target) {
			if(val!=arr[i])
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			if(i+1<arr.length) {
				helper(arr,i+1,target-val);
			}
			
			val+=arr[i];
			
			
			
		}
		if(arr[i]!=val)
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		if(val==target) {
			for(Map.Entry<Integer, Integer>entry:map.entrySet()) {
				System.out.print(entry.getKey()+": "+entry.getValue()+", ");
			
				
			}
			System.out.println();
		}
		val=0;
		if(map.containsKey(arr[i])) {
			map.remove(arr[i]);
		}
		
	}

}
