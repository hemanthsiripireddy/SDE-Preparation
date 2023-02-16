package week7;


import week6.ListNode;

public class RotateList {
	public static void method() {
		ListNode head = null;
		head = formListNodes();
		ListNode node=head;
		while(node!=null) {
			System.out.print(node.val+" ");
			node=node.next;
		}
		System.out.println();
		head=rotateRight(head,6);
		node=head;
		while(node!=null) {
			System.out.print(node.val+" ");
			node=node.next;
		}
		
	}
	public static ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null)
			return head;

		int size = 0;
		ListNode node = head, lastNode = null;
		while (node != null) {
			size++;
			if (node.next == null)
				lastNode = node;
			node = node.next;

		}
		k = k % size;
		if (k == 0)
			return head;

		int l = size - k, i = 0;
		node = head;
		while (node != null) {
			i++;
			if (i == l) {
				ListNode temp = node.next;
				node.next = null;
				lastNode.next = head;
				head = temp;
				break;
			}
			node = node.next;
		}
		return head;

	}
	private static ListNode formListNodes() {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ListNode head = new ListNode(12);
		ListNode node = head;
		int  i = 0;
		while (i < arr.length) {
			node.next=new ListNode(arr[i++]);
			
			node = node.next;

		}
		
		return head.next;
	}

}

