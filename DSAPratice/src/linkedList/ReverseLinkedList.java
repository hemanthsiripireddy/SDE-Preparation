package linkedList;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {
	public static void method() {
		int[] arr=new int[] {1,2,3,4,5};
		Node head=formLinkedList(arr);
		 //head=revserLinkedListBruteForce(head);
		head=reverseLinkedListOptimized(head);
		 while(head!=null) {
			 System.out.println(head.val);
			 head=head.next;
			 
		 }
		
	}
	private static Node reverseLinkedListOptimized(Node head) {
		// TODO Auto-generated method stub
		Node prev=null;
		Node cur=head;
		while(cur!=null) {
			Node next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		return prev;
	}
	private static Node revserLinkedListBruteForce(Node head) {
		// TODO Auto-generated method stub
		Node node=head;
		List<Node>list=new ArrayList<>();
		while(node!=null) {
			list.add(node);
			node=node.next;
		}
		for(int i=list.size()-1;i>=0;i--) {
			Node next=null;
			if(i>0)
				next=list.get(i-1);
			list.get(i).next=next;
		}
		return list.get(list.size()-1);
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
