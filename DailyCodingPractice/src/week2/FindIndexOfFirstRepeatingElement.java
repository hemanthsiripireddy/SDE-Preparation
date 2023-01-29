package week2;

import java.util.HashMap;
import java.util.Map;

public class FindIndexOfFirstRepeatingElement {
	public static void method() {
		//10, 5, 3, 4, 3, 5, 6
		//6, 10, 5, 4, 9, 120, 4, 6, 10
		int[] arr=new int[] {1,2,3,4};
		Map<Integer, Integer>map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(map.get(arr[i])>1) {
				System.out.println("index: "+i+" Element: "+arr[i]);
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("there is no repeating element");
		}
	}

}
