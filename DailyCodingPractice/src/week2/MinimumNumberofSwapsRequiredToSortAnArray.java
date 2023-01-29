package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MinimumNumberofSwapsRequiredToSortAnArray {
	public static void method() {
		int[] arr=new int[] { 8 ,3, 14, 17, 15, 1, 12};
		//1,6,5,2,4,3
		//1,2,5,6,4,3
		//1,2,3,6,4,5
		//1,2,3,4,6,5
		//1,2,3,4,5,6
		int minSteps=0;
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			if(minIndex!=i) {
				int temp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=temp;
				minSteps++;
			}
		}
		System.out.println(minSteps);
	}
	public static void method2() {
		int arr[]=new int[] { 8 ,3, 14, 17, 15, 1, 12};
		int[] arr2=arr.clone();
		Arrays.sort(arr2);
		int minSteps=0;
		Map<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], i);
			
		}
		for(int i=0;i<arr2.length;i++) {
			int index=map.get(arr2[i]);
			if(index!=i) {
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				minSteps++;
				map.put(arr[index], index);
				map.put(arr[i], i);
			}
		}
		System.out.println(minSteps);
		
	}
//	public static void method3() {
//		int[] arr=new int[] {};
//        int n = arr.length;
//        ArrayList<Pair<Integer, Integer> > arrpos  = new ArrayList<Pair<Integer, Integer> >();
//        for (int i = 0; i < n; i++)
//            arrpos.add(
//                new Pair<Integer, Integer>(arr[i], i));
//         arrpos.sort(
//            new Comparator<Pair<Integer, Integer> >() {
//                @Override
//                public int compare(
//                    Pair<Integer, Integer> o1,
//                    Pair<Integer, Integer> o2)
//                {
//                    if (o1.getKey() > o2.getKey())
//                        return -1;
//
//                    else if (o1.getKey().equals(
//                                 o2.getKey()))
//                        return 0;
// 
//                    else
//                        return 1;
//                }
//            });
// 
//        Boolean[] vis = new Boolean[n];
//        Arrays.fill(vis, false);
// 
//        int ans = 0;
// 
//        for (int i = 0; i < n; i++) {
//            if (vis[i] || arrpos.get(i).getValue() == i)
//                continue;
//
//            int cycle_size = 0;
//            int j = i;
//            while (!vis[j]) {
//                vis[j] = true;
// 
//                j = arrpos.get(j).getValue();
//                cycle_size++;
//            }
// 
//            if (cycle_size > 0) {
//                ans += (cycle_size - 1);
//            }
//        }

	//}

}
