package linkedList;

import searchingAndSorting.ListNode;

public class MaximumTwinSumofaLinkedList {
	public static void method() {
		ListNode head=new ListNode(5);
		head.next=new ListNode(4);
		head.next.next=new ListNode(2);
		head.next.next.next=new ListNode(1);
		
		int res=pairSum(head);
		System.out.println(res);
	}
	public static int pairSum(ListNode head) {
		ListNode prev = null;
		ListNode cur = head;
		ListNode fast = head;

		while (true) {
			ListNode temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
			if (fast.next.next == null)
				break;
			fast = fast.next.next;
		}
		ListNode head1 = prev;
		ListNode head2 = cur;
		int res = Integer.MIN_VALUE;
		while (head1 != null) {
			res = Math.max(res, head1.val + head2.val);
			head1 = head1.next;
			head2 = head2.next;
		}
		return res;

	}

}
