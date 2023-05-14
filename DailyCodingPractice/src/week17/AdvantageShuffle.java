package week17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class AdvantageShuffle {
	public static void method() {
		int[] nums1= {12,24,8,32};
		int[] nums2= {13,25,32,11};
		
		int[] res=advantageCount(nums1, nums2);
		for(int i:res) {
			System.out.print(i+" ");
		}
	}
	public static int[] advantageCount(int[] nums1, int[] nums2) {
		int[] newnums1 = new int[nums1.length];
		for (int i = 0; i < nums1.length; i++) {
			newnums1[i] = nums1[i];
		}
		int[] newnums2 = new int[nums2.length];
		for (int i = 0; i < nums2.length; i++) {
			newnums2[i] = nums2[i];
		}
		Arrays.sort(newnums1);
		Arrays.sort(newnums2);
		Map<Integer, Queue<Integer>> map = new HashMap<>();
		for (int i = 0; i < nums2.length; i++) {
			if(!map.containsKey(nums2[i])) {
				map.put(nums2[i], new LinkedList<>());
			}
			map.get(nums2[i]).add(i);

		}
		int i = 0, j = 0;
		List<Integer> dummy = new ArrayList<>();
		while (i < nums1.length) {
			if (newnums1[i] > newnums2[j]) {
				newnums1[j] = newnums1[i];
				i++;
				j++;
			} else {
				dummy.add(newnums1[i++]);

			}
		}
		for (i = 0; i < j; i++) {
			int index = map.get(newnums2[i]).poll();
			nums1[index] = newnums1[i];
		}

		for (int val : dummy) {
			int index = map.get(newnums2[i++]).poll();
			nums1[index] = val;
		}
		return nums1;

	}

}
