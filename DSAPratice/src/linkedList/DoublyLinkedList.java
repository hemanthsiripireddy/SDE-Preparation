package linkedList;

public class DoublyLinkedList {
	public DNode headNode;
	
	public void insertInBeg(int val) {
		DNode temp=new DNode(val);
		if(headNode==null) {
			headNode=temp;
			return;
		}
		headNode.prev=temp;
		temp.next=headNode;
		headNode=temp;
	
	}
	public void insertInEnd(int val) {
		DNode temp=new DNode(val);
		DNode cur=headNode;
		while(cur.next!=null) {
			cur=cur.next;
		}
		temp.prev=cur;
		cur.next=temp;
	}
	public void delete(int val) {
		DNode cur=headNode;
		DNode deletedNode=null;
		if(headNode.val==val) {
			deletedNode=headNode;
			headNode=headNode.next;
			headNode.prev=null;
			//return;
		}
		else {
			while(cur!=null) {
				if(cur.val==val) {
					deletedNode=cur;
					cur.prev.next=cur.next;
					if(cur.next!=null) {
						cur.next.prev=cur.prev;
					}
					break;
					
					
				}
				cur=cur.next;
			}
		}
		if(deletedNode==null) {
			System.out.println("no node found with given val");
		}else {
			
			System.out.println("node is deleted successfully"); 
		}
	}
	public void display() {
		DNode cur=headNode;
		while(cur!=null) {
			System.out.print(cur.val+" ");
			cur=cur.next;
		}
	}

}
