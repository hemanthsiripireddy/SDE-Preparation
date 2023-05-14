package heap;

public class MinHeap {

	int size;
	int capacity;
	int[] arr;
	public MinHeap(int capacity) {
		this.capacity=capacity;
		this.size=0;
		this.arr=new int[capacity];
	}
	public void insert(int val) {
		if(size==capacity) {
			System.out.println("Heap size is full, can't insert new value");
			return;
		}
		arr[size++]=val;
		heapfyUp(size-1);
	}
	private void heapfyUp(int i) {
		// TODO Auto-generated method stub
		
		int parent=getParent(i);
		if(parent>=0&&arr[parent]>arr[i]) {
			int temp=arr[parent];
			arr[parent]=arr[i];
			arr[i]=temp;
			heapfyUp(parent);
		}
		
		
	}
	public int delete() {
		if(size==0) {
			System.out.println("heap is empty, deletion can't be done");
			return -1;
		}
		int val=arr[0];
		arr[0]=arr[size-1];
		heapfyDown(0);
		size--;
		return val;
	}
	private void heapfyDown(int i) {
		// TODO Auto-generated method stub
		int max=i;
		int left=getLeftChild(i);
		int right=getRightChild(i);
		if(left<size&&arr[left]<arr[max])
			max=left;
		if(right<size&&arr[right]<arr[max])
			max=right;
		if(i!=max) {
			int temp=arr[i];
			arr[i]=arr[max];
			arr[max]=temp;
			heapfyDown(max);
		}
		
	}
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(); 
	}
	private int getParent(int i) {
		return (i-1)/2;
	}
	private int getLeftChild(int i) {
		return 2*(i)+1;
	}
	private int getRightChild(int i) {
		return 2*i+2;
	}
	

}
