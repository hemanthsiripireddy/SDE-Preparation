package week7;

import week6.ListNode;

public class MaximumTwinSumofaLinkedList {
	public static  void method() {
		int[] arr=new int[] {5,4,2,1};
		ListNode node=formLinkedList(arr);
		int res= pairSum(node);
		System.out.println(res);
	}

	private static ListNode formLinkedList(int[] arr) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(34);
		ListNode node=head;
		for(int i=0;i<arr.length;i++) {
			node.next=new ListNode(arr[i]);
			node=node.next;
			
		}
		return head.next;
	}
	 public static int pairSum(ListNode head) {
	        ListNode prevNode=null,curr=head;
	        int size=0,i=0;
	        ListNode node=head;
	        while(node!=null){
	            size++;
	            node=node.next;
	        }
	        //5,4,2,1
	        while(i<size/2){
	            ListNode temp=curr.next;
	            curr.next=prevNode;
	            prevNode=curr;
	            curr=temp;
	            i++;

	        }
	        ListNode left=prevNode,right=curr;
	        int res=0;
	        while(left!=null){
	            res=Math.max(res,left.val+right.val);
	            left=left.next;
	            right=right.next;
	        }
	        return res;
	        

	        
	    }

}
