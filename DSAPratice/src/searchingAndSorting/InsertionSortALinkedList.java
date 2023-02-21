package searchingAndSorting;

import linkedList.Node;

public class InsertionSortALinkedList {
	public static void method() {
		int[] arr=new int[] {9,-2,1,5,23,4,76,12};
		ListNode head=formLinkedList(arr);
		 head=sortLinkedList(head);
		 while(head!=null) {
			 System.out.println(head.val);
			 head=head.next;
			 
		 }
		
		
	}
	 private static ListNode sortLinkedList(ListNode head) {
		// TODO Auto-generated method stub
		 ListNode dummy=new ListNode(5);
		 ListNode original=head;
		 while(original!=null) {
			 head=original;
			 original=original.next;
			 ListNode temp= dummy;
			 int flag=0;
			 while(temp.next!=null) {
				 if(temp.next.val>head.val) {
					 head.next=temp.next;
					 temp.next=head;
					 flag=1;
					 break;
				 }
				 temp=temp.next;
			 }
			 if(flag==0) {
				 temp.next=head;
				 head.next=null;
				 
			 }
				
			 
		 }
		 
		return dummy.next;
	}
	private static ListNode formLinkedList(int[] arr) {
			// TODO Auto-generated method stub

		// TODO Auto-generated method stub
			ListNode head=new ListNode(arr[0]);
			ListNode node=head;
			for(int i=1;i<arr.length;i++) {
				node.next=new ListNode(arr[i]);
				node=node.next;
			}
			return head;
		}

}
