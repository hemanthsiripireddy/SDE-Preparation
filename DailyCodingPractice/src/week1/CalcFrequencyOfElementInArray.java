package week1;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class CalcFrequencyOfElementInArray {
	public static void method() {
		int[] arr=new int[] {10, 20, 20, 10, 10, 20, 5, 20 ,98};
		Map<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			
		}
		map.forEach((k,v)->System.out.println("number: "+k+" frequency: "+v));
	}

}
