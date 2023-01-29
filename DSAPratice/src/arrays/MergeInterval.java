package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
	public static void method() {
		int[][] arr=new int[][] {{1,2},{2,4},{5,11},{10,12}};
		List<List<Integer>>list=new ArrayList<>();
		List<Integer>prev=Arrays.asList(-1,-1);
		for(int i=0;i<arr.length;i++) {
			if(prev.get(0)==0-1) {
				prev.set(0, arr[i][0]);
				prev.set(1, arr[i][1]);
				continue;
			}
			if(prev.get(1)>=arr[i][0]){
				prev.set(1, Math.max(prev.get(1), arr[i][1]));
				continue;
			}
			list.add(prev);
			prev=Arrays.asList(arr[i][0],arr[i][1]);
			
		}
		if(prev.get(0)!=-1)
			list.add(prev);
		
		for(int i=0;i<list.size();i++) {
			List<Integer>l=list.get(i);
			System.out.println(l.get(0)+" - "+l.get(1));
		}
	}

}
