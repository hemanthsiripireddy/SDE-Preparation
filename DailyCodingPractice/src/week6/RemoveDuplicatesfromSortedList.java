package week6;

public class RemoveDuplicatesfromSortedList {
	public static void method() {
		ListNode head=formListNodes();
		head=deleteDuplicates(head);
		while(head!=null) {
			System.out.print(head.val+" ");
			head=head.next;
		}
		
		
	}
	 private static ListNode formListNodes() {
			// TODO Auto-generated method stub
			 ListNode head=new ListNode(12);
			 int[] arr= {1,1,2,2,3,4,5,5,6,6,7,8};
			 ListNode node=head;
			 int i=0;
			 while(i<arr.length) {
				 node.next=new ListNode(arr[i++]);
				 node= node.next;
			 }
			 
					//node.next=head.next;
					return head.next;
		}
	public static  ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;
		ListNode firstNode = head, secondNode = head.next;
		while (secondNode != null) {
			if (firstNode.val == secondNode.val) {
				firstNode.next = secondNode.next;

			} else {
				firstNode = secondNode;
			}
			secondNode = secondNode.next;
		}
		return head;

	}

}
