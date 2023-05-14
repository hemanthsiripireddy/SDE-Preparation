package stackAndQueue;

public class LinkedQueue implements Queue1 {
	Node front;
	Node rear;
	

	@Override
	public void enqueue(int num) {
		// TODO Auto-generated method stub
		if(front==null) {
			front=new Node(num);
			rear=front;
		}else {
			rear.next=new Node(num);
			rear=rear.next;
		}
		
	}

	@Override
	public int dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("can't dequeue because queue is empty");
			return -1;
			
		}
			
		if(front==rear) {
			int num= front.val;
			front=null;
			rear=null;
			return num;
		}else {
			int num=front.val;
			front=front.next;
			return num;
		}
		
		
	}
	

	@Override
	public int getRear() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}
		return rear.val;
	}

	@Override
	public int getFront() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}
		return front.val;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			System.out.println("there is no elements in queue");
		}
		Node temp=front;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(front==null)
			return true;
		return false;
	}

	

}
