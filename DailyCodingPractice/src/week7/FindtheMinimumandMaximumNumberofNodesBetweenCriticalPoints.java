package week7;

import week6.ListNode;

public class FindtheMinimumandMaximumNumberofNodesBetweenCriticalPoints {
	public static void method() {
		int[] arr=new int[] {5,3,1,2,5,1,2};
		ListNode head=formLinkedList(arr);
		int[] res=nodesBetweenCriticalPoints(head);
		System.out.println(res[0]+" "+res[1]);
	}

	public static int[] nodesBetweenCriticalPoints(ListNode head) {
		int size = 0;
		ListNode node = head;
		while (node != null) {
			size++;
			node = node.next;
		}
		int[] arr = new int[size];
		ListNode prev = null;
		node = head;
		int i = 0;
		while (node != null && node.next != null) {
			if (prev != null) {
				if (prev.val < node.val && node.val > node.next.val) {
					arr[i] = 1;
				} else if (prev.val > node.val && node.val < node.next.val) {
					arr[i] = 1;
				}
			}
			i++;
			prev = node;
			node = node.next;
		}
		int minDistance = -1, maxDistance = -1, firstStart = -1, curStart = -1;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				if (curStart != -1) {
					if (minDistance == -1) {
						minDistance = i - curStart;
					} else
						minDistance = Math.min(minDistance, i - curStart);
				}
				if (firstStart != -1) {
					maxDistance = Math.max(maxDistance, i - firstStart);
				}
			 	if (firstStart == -1) {
					firstStart = i;
				}
				curStart = i;
			}
		}
		return new int[] { minDistance, maxDistance };

	}

	private static ListNode formLinkedList(int[] arr) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		ListNode head = new ListNode(arr[0]);
		ListNode node = head;
		for (int i = 1; i < arr.length; i++) {
			node.next = new ListNode(arr[i]);
			node = node.next;
		}
		return head;
	}
}
