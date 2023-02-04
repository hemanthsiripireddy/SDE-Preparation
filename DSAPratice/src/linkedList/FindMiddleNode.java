package linkedList;

public class FindMiddleNode {
	public static void method() {
		int[] arr=new int[] {1,2,3,4,5};
		Node head=formLinkedList(arr);
		Node middle=findMiddle(head);
		System.out.println(middle.val);
	}

	private static Node findMiddle(Node head) {
		// TODO Auto-generated method stub
		Node fast=head,slow=head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}

	private static Node formLinkedList(int[] arr) {
		// TODO Auto-generated method stub
		Node head=new Node(arr[0]);
		Node node=head;
		for(int i=1;i<arr.length;i++) {
			node.next=new Node(arr[i]);
			node=node.next;
		}
		return head;
	}

}
