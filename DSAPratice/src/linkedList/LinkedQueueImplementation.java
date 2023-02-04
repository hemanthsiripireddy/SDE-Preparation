package linkedList;

public class LinkedQueueImplementation {
	public static  void method() {
		LinkedQueue queue=new LinkedQueue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.display();
		queue.dequeue();
		queue.display();
		queue.enqueue(40);
		queue.dequeue();
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		
	}

}
