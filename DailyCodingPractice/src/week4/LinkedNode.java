package week4;

public class LinkedNode {
	 public int val;
	public  LinkedNode next;
	public LinkedNode(int val, LinkedNode next) {
		
		this.val = val;
		this.next = next;
	}
	public LinkedNode(int val) {
		
		this.val = val;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public LinkedNode getNext() {
		return next;
	}
	public void setNext(LinkedNode next) {
		this.next = next;
	}
	public LinkedNode() {
		super();
	}
	
	
	
	
	

}
