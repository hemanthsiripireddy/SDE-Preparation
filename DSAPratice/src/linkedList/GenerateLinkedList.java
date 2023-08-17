package linkedList;

import searchingAndSorting.ListNode;

public class GenerateLinkedList {
	public static ListNode generate(int[] arr) {
		ListNode head=new ListNode(-1);
		ListNode cur=head;
		for(int i=0;i<arr.length;i++) {
			cur.next=new ListNode(arr[i]);
			cur=cur.next;
		}
		return head.next;
	}

}
