package week7;

import week6.ListNode;

public class OddEvenLinkedList {
	public static void method() {
		int[] arr= new int[] {1,2,3,4,5};
		ListNode head=formLinkedList(arr);
		 head=oddEvenList(head);
		while(head!=null) {
			System.out.println(head.val);
		}
	}
	 public static ListNode oddEvenList(ListNode head) {
	        ListNode oddHead=new ListNode(4);
	        ListNode evenHead=new ListNode(4);
	        ListNode odd=oddHead,even=evenHead;
	         int i=1;
	         while(head!=null){
	             if(i%2==1){
	                 odd.next=head;
	                 odd=odd.next;
	                 head=head.next;
	                 
	             }else{
	                 even.next=head;
	                 even=even.next;
	                 head=head.next;
	             }
	             i++;
	         }
	         even.next=null;
	         odd.next=evenHead.next;
	         return oddHead.next;
	        
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
