package stackAndQueue;

public class QueueImpl {
	public static void method() {
		Queue1 lq=new ArrayQueueSpaceOptimized();
		lq.enqueue(5);
		lq.display();
		lq.dequeue();
		System.out.println(lq.isEmpty());
		lq.dequeue();
		lq.display();
		lq.getFront();
		lq.getRear();
		lq.enqueue(12);
		lq.enqueue(23);
		lq.enqueue(34);
		lq.enqueue(45);
		lq.enqueue(45);
		lq.enqueue(45);
		lq.enqueue(34);
		lq.display();
		lq.dequeue();
	
		lq.display();
//		System.out.println(lq.isEmpty());
		System.out.println(lq.getFront());
		System.out.println(lq.getRear());
	
	}

}
