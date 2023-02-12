package week6;

public class FindIfLinkedListCyclePresent {
	public static void method() {
		ListNode head = null;
		head = formListNodes();
		boolean res=hasCycle(head);
		//System.out.println(res);
		int res1=(int)((Math.pow(5,25)*Math.pow(4, 25))%1000000007);
		System.out.println(res1);
		
	}
	 private static ListNode formListNodes() {
		// TODO Auto-generated method stub
		 ListNode head=new ListNode(12);
		 int[] arr= {1,2,3,4,5,5,6,7,8};
		 ListNode node=head;
		 int i=0;
		 while(i<arr.length) {
			 node.next=new ListNode(arr[i++]);
			 node= node.next;
		 }
		 
				//node.next=head.next;
				return head.next;
	}
	public static boolean hasCycle(ListNode head) {
	        ListNode slow=head;
	        ListNode fast=head;
	        while(fast!=null&&fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	            if(slow==fast)
	            return true;

	        }
	        return false;

	        
	    }

}
