package linkedList;

public class LinkedQueue {
	public Node headNode;
	public Node tailNode;
	
	public void enqueue(int val) {
		Node temp=new Node(val);
		if(headNode==null) {
			headNode=tailNode=temp;
			return;
			
		}
		tailNode.next=temp;
		tailNode=temp;
		
		
	}
	public void dequeue() {
		if(headNode==null)
		{
			System.out.println("under flown");
			return;
		}
		headNode=headNode.next;
	}
	public void display() {
		Node cur=headNode;
		while(cur!=null) {
			System.out.print(cur.val+" ");
			cur=cur.next;
		}
	}

}
