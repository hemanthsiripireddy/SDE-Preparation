package linkedList;

public class FindCycle {
	public static void method() {
		int[] arr=new int[] {1,2,3,4,5};
		Node head=formLinkedList(arr);
		boolean res=findCycle(head);
		System.out.println(res);
	}
	private static boolean findCycle(Node head) {
		// TODO Auto-generated method stub
		Node fast=head,slow=head;
		while(fast!=null&&fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			if(slow==fast)
				return true;
			
		}
		return false;
	}
	private static Node formLinkedList(int[] arr) {
		// TODO Auto-generated method stub
		Node head=new Node(arr[0]);
		Node node=head;
		for(int i=1;i<arr.length;i++) {
			node.next=new Node(arr[i]);
			node=node.next;
		}
		node.next=head;
		return head;
	}

}
