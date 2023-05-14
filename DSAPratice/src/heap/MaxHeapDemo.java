package heap;

public class MaxHeapDemo {
	public static void method() {
		MaxHeap heap=new MaxHeap(5);
		for(int i=1;i<7;i++) {
			heap.insert(i);
		}
		heap.display();
		int val=heap.delete();
		System.out.println("deleted val"+val);
		heap.display();
		
	}

}
