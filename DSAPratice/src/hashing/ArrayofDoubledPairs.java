package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayofDoubledPairs {
	public static  void method() {
		int[] arr= {4,-2,2,-4};
		boolean res=canReorderDoubled(arr);
		System.out.println(res);
		Set<Integer> set=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		set2.addAll(set);
		//set2.re
		
	}
	public static  boolean canReorderDoubled(int[] arr) {
        Arrays.sort(arr);
        reverseNegative(arr);
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        //Set<T> set = new HashSet<>(Arrays.asList(array));
        //Map<Integer>visited=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(map.getOrDefault(arr[i],0)>0){
                if(map.getOrDefault(2*arr[i],0)>0){
                    map.put(arr[i],map.get(arr[i])-1);
                    map.put(2*arr[i],map.get(2*arr[i])-1);
                }else
                return false;
            }
        }
        return true;
        
    }
    public static  void reverseNegative(int[] arr){
        int start=0;
        int end=0;
        while(end<arr.length&&arr[end]<0){
            end++;
        }
        end--;
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        
    }
}
