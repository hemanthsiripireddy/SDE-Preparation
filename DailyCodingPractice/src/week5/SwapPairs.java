package week5;



public class SwapPairs {
	public static void method() {
		int[] arr= {1,2,3,4};
		ListNode head=formLinkedList(arr);
		 head=swapPairs(head);
		 int count=0;
		 while(head!=null&count<5){
			 System.out.print(head.val+" ");
			// System.out.println();
			 head=head.next;
			 count++;
			 
		 }
			
	}
	public static ListNode swapPairs(ListNode head) {
	    if(head==null||head.next==null)
	   return head;
	   ListNode prev=null;
	   ListNode cur=head;
	  
	   head=head.next;
	   while(cur!=null&& cur.next!=null){
	       ListNode temp=cur.next.next;
	      
	       if(prev!=null){
	           prev.next=cur.next;
	       }
	       cur.next.next=cur;
	       //cur.next=temp;
	       prev=cur;
	       cur=temp;
	       

	   }
	   if(prev!=null)
	   prev.next=cur;
	 
	   return head;

	   
	}
	private static ListNode formLinkedList(int[] arr) {
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

