package heap;

public class MinHeapDemo {
	public static void method() {
		MinHeap heap=new MinHeap(5);
		for(int i=7;i>=1;i--) {
			heap.insert(i);
		}
		heap.display();
		int val=heap.delete();
		System.out.println("deleted val"+val);
		heap.display();
		heap.insert(-2);
		heap.delete();
		heap.insert(34);
		
		heap.display();
	}

}
