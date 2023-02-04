package linkedList;

public class CircularLinkedList {
	public Node headNode;
	public Node tailNode;
	
	public void insert(int val) {
		Node temp=new Node(val);
		if(headNode==null) {
			headNode=temp;
			
			tailNode=temp;
			tailNode.next=headNode;
		}else {
			temp.next=headNode;
			tailNode.next=temp;
			tailNode=temp;
		}
	}
	public void delete(int val) {
		Node cur=headNode;
		Node deletedNode=null;
		if(cur==null) {
			System.out.println("list is empty");
			return;
		}
		if(cur.val==val&&cur.next==cur) {
			deletedNode=cur;
			headNode=null;
			tailNode=null;
			System.out.println("node deleted sucessfully");
			
		}
		else if(cur.val==val) {
			deletedNode=cur;
			tailNode.next=tailNode.next.next;
			headNode=headNode.next;
			
		}else {
			Node prev=cur;
			cur=cur.next;
			while(cur!=headNode) {
				if(cur.val==val) {
					deletedNode=cur;
					prev.next=cur.next;
					break;
					
				}
				prev=cur;
				cur=cur.next;
				
				
			}
			
			
		}
		if(deletedNode==null) {
			System.out.println("no node found");
		}else {
			System.out.println("nod is deleted successfully");
		}
	}
	public void diplay() {
		Node cur=headNode;
		if(cur!=null) {
			System.out.print(cur.val+" ");
			cur=cur.next;
		}
		while(cur!=headNode) {
			System.out.print(cur.val+" ");
			cur=cur.next;
		}
	}

}
