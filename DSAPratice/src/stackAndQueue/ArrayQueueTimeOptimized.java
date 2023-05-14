package stackAndQueue;

public class ArrayQueueTimeOptimized implements Queue1 {
	int[] arr;
	int front=-1,rear=-1;
	public ArrayQueueTimeOptimized() {
		arr=new int[6];
	}

	@Override
	public void enqueue(int num) {
		// TODO Auto-generated method stub
		if(rear==arr.length-1) {
			System.out.println("queue is full");
			return ;
		}
		if(front==-1)
			front++;
		arr[++rear]=num;
		
	}

	@Override
	public int dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}
		return arr[front++];
	}

	@Override
	public int getRear() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return -1;
		}
		return arr[rear];
	}

	@Override
	public int getFront() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return -1;
		}
		return arr[front];
		//return 0;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("queue is empty");
			return ;
		}
		for(int i=front;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(front==-1||front>rear)
			return true;
		return false;
	}

}
