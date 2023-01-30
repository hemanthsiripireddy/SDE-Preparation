package week4;

import java.util.ArrayList;
import java.util.List;

public class ModifyLinkedList {
	public static void method() {
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9};
		LinkedNode head=generateLinkedNode(arr);
		LinkedNode node=head;
		modifyLinkedLsit(head);
		while(node!=null) {
			System.out.println(node.getVal());
			node=node.getNext();
		}
	}

	private static void modifyLinkedLsit(LinkedNode head) {
		// TODO Auto-generated method stub
		
		  List<LinkedNode>list=new ArrayList<>();
		  LinkedNode node=head;
	        while(node!=null){
	            list.add(node);
	            node=node.getNext();

	        }
	        node=head;
	        LinkedNode lastNode,lastPrev;
	       for(int i=0;i<list.size()/2;i++){
	            lastPrev=list.get(list.size()-2-i);
	            lastNode=lastPrev.getNext();
	            lastPrev.next=null;
	            LinkedNode temp=node.next;
	            node.next=lastNode;
	            lastNode.next=temp;
	            node=temp;


	       }
		
	}

	private static LinkedNode generateLinkedNode(int[] arr) {
		// TODO Auto-generated method stub
		LinkedNode head=new LinkedNode();
		LinkedNode node=head;
		for(int i=0;i<arr.length;i++) {
			node.setVal(arr[i]);
			if(i!=arr.length-1) {
				node.setNext(new LinkedNode());
				node=node.getNext();
			}
			
			
		}
		return head;
	}

}
