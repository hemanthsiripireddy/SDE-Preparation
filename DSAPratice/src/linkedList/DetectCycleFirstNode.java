package linkedList;

public class DetectCycleFirstNode {
	public static void method() {
		int[] arr=new int[] {1,2,3,4,5};
		Node head=formLinkedList(arr);
		Node cycleNode=detectCycle(head);
		System.out.println(cycleNode.val);
	}
	private static Node detectCycle(Node head) {
		// TODO Auto-generated method stub
		Node fast=head,slow=head;
		while(fast!=null&&fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(slow==fast)
				break;
			
		}
		if(fast==null||fast.next==null)
			return null;
		fast=head;
		while(fast!=slow) {
			fast=fast.next;
			slow=slow.next;
		}
		return fast;
	}
	private static Node formLinkedList(int[] arr) {
		// TODO Auto-generated method stub
		Node head=new Node(arr[0]);
		Node node=head;
		Node cycle=null;
		for(int i=1;i<arr.length;i++) {
			
			node.next=new Node(arr[i]);
			node=node.next;
			if(i==2)
				cycle=node;
		}
		node.next=cycle;
		return head;
	}

}
