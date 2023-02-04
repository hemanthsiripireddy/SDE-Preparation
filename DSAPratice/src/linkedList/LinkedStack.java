package linkedList;

public class LinkedStack {
	public Node headNode;
	public void push(int val) {
		Node temp=new Node(val);
		if(headNode==null) {
			headNode=temp;
			return;
					
			
		}
		temp.next=headNode;
		headNode=temp;
	}
	public void pop() {
		if(headNode==null) {
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
