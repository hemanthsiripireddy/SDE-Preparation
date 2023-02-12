package week6;

public class MergeNodesinBetweenZeros {
	public static void method() {
		ListNode head = null;
		head = formListNodes();
		head = mergeNodes(head);
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;

		}
	}

	private static ListNode formListNodes() {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ListNode head = new ListNode(12);
		ListNode node = head;
		int count = 0, i = 0;
		while (i < arr.length) {
			if (count % 4 == 0) {
				node.next = new ListNode(0);
				count++;
			} else {
				node.next = new ListNode(arr[i++]);
				count++;
			}
			node = node.next;

		}
		node.next = new ListNode(0);
		return head.next;
	}

	public static ListNode mergeNodes(ListNode head) {
		ListNode node = head, newNode = null;
		head = null;
		int sum = 0;
		node = node.next;
		while (node != null) {
			if (node.val == 0 && head == null) {
				head = new ListNode(sum);
				sum = 0;
				newNode = head;
			} else if (node.val == 0) {
				newNode.next = new ListNode(sum);
				sum = 0;
				newNode = newNode.next;
			} else {
				sum += node.val;

			}
			node = node.next;
		}
		return head;

	}

}
