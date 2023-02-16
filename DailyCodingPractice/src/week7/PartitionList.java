package week7;

import week6.ListNode;

public class PartitionList {
	public static void method() {
		ListNode head = null;
		head = formListNodes();
		ListNode node=head;
		while(node!=null) {
			System.out.print(node.val+" ");
			node=node.next;
		}
		System.out.println();
		head=partition(head,2);
		node=head;
		while(node!=null) {
			System.out.print(node.val+" ");
			node=node.next;
		}
		
	}
	 public static ListNode partition(ListNode head, int x) {
	        ListNode newHead=new ListNode(-1);
	         newHead.next=head;
	        ListNode smallNode=newHead;
	        
	        ListNode node=head,prevNode=newHead;
	        while(node!=null){
	            if(node.val<x&&smallNode.next==node){
	                smallNode=node;
	                  prevNode=prevNode.next;
	              node=node.next;
	                
	            }
	            else

	          if(node.val<x){
	               ListNode temp= smallNode.next;
	           smallNode.next=node;
	           prevNode.next=prevNode.next.next;
	           smallNode=smallNode.next;
	           smallNode.next=temp;
	           node=prevNode.next;
	          }else{
	              prevNode=prevNode.next;
	              node=node.next;
	          }

	        }
	        return newHead.next;

	    
	        
	    }
	
	private static ListNode formListNodes() {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 2,1};
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
