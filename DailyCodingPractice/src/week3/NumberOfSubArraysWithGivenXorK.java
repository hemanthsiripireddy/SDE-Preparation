package week3;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubArraysWithGivenXorK {
	public static void method() {
		//5, 6, 7, 8, 9=5
		//4, 2, 2, 6, 4-6
		int n=0;
		int[] arr= new int[] {4, 2, 2, 6, 4};
		int k=6;
		for(int i=0;i<arr.length;i++) {
			int val=arr[i];
			if(val==k)
				n++;
			for(int j=i+1;j<arr.length;j++) {
				val=val^arr[j];
				if(val==k)
					n++;
				
			}
		}
		System.out.println("Total number of subArrays: "+n);
	}
public static void method2() {
	int[] arr=new int[] {4, 2, 2, 6, 4};
	int b=6;
	int count=0;
	Map<Integer,Integer>freq=new HashMap<>();
	int preXor=0;
	for(int i=0;i<arr.length;i++) {
		preXor=preXor^arr[i];
		count+=freq.getOrDefault(preXor^b, 0);
		if(preXor==b)
			count++;
		freq.put(preXor, freq.getOrDefault(preXor, 0)+1);
		
	}
	System.out.println(count);
	
		
	}

}
