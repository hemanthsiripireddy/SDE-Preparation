package linkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import searchingAndSorting.ListNode;

public class RemoveZeroSumConsecutiveNodesfromLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,-3,3,1};
		ListNode head=GenerateLinkedList.generate(arr);
		ListNode res=removeZeroSumSublists(head);
		while(res!=null) {
			System.out.print(res.val+" ");
			res=res.next;
		}

	}

	public static ListNode removeZeroSumSublists(ListNode head) {

		List<Integer> list = new ArrayList<>();
		ListNode node = head;
		while (node != null) {
			list.add(node.val);
			node = node.next;
		}
		Map<Integer, Integer> map = new HashMap<>();
		List<List<Integer>> sum = new ArrayList<>();
		map.put(0, -1);
		sum.add(new ArrayList<>());
		sum.get(0).add(-1);
		sum.get(0).add(0);
		int cs = 0;
		for (int i = 0; i < list.size(); i++) {
			cs += list.get(i);
			if (map.containsKey(cs)) {
				
				int index = map.get(cs);
				cs-=list.get(i);
				while (sum.size() > 0 && sum.get(sum.size() - 1).get(0) > index) {
					cs -= list.get(sum.get(sum.size() - 1).get(0));
					map.remove(sum.get(sum.size() - 1).get(1));
					sum.remove(sum.size() - 1);
				}

			} else {
				map.put(cs, i);
				List<Integer> cur = new ArrayList<>();
				cur.add(i);
				cur.add(cs);
				sum.add(cur);

			}
		}

		ListNode res = new ListNode(-1);
		res.next = head;
		ListNode cur = head;
		int j = 1;
		ListNode prev = res;
		int index = -1;
		if (j >= sum.size()) {
			prev.next = null;
			return null;
		}
		index = sum.get(j++).get(0);
		for (int i = 0; i < list.size(); i++) {

			

			if (index == i) {
				prev.next = cur;
				prev = prev.next;
				if (j >= sum.size()) {
					prev.next = null;
					break;
				}
				index = sum.get(j++).get(0);
			}
			cur = cur.next;
			

		}
		return res.next;

	}

}
