package stackAndQueue;

public class ArrayQueueSpaceOptimized implements Queue1{
	int[] arr;
	int front=-1,rear=-1;
	public  ArrayQueueSpaceOptimized() {
		arr=new int[6];
		
	}

	@Override
	public void enqueue(int num) {
		// TODO Auto-generated method stub
		if(rear==arr.length-1) {
			System.out.println("can't add because queue is empty");
			return ;
		}
		if(isEmpty())
			front++;
		arr[++rear]=num;
		
	}

	@Override
	public int dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("can't remove because queue is empty");
			return -1;
		}
		int num=arr[0];
		if(rear==0) {
			front=-1;
			rear=-1;
			return num;
		}
		for(int i=front;i<rear;i++) {
			arr[i]=arr[i+1];
		}
		rear--;
		return num;
	}

	@Override
	public int getRear() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("no rear element becuase queue is empty");
			return -1;
		}
		return arr[rear];
	}

	@Override
	public int getFront() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("no front element becuase queue is empty");
			return -1;
		}
		return arr[0];
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("there are no element to display");
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
		if(front==-1)
			return true;
		return false;
				
	}

}
