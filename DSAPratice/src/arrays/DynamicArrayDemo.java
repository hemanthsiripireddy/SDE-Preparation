package arrays;

public class DynamicArrayDemo {
	int[] arr;
	int size;
	int capacity;
	public DynamicArrayDemo(int capacity) {
		this.size=0;
		this.arr=new int[capacity];
		this.capacity = capacity;
	}
	public void insert(int val) {
		if(size==capacity) {
			growArray();
		}
		arr[size++]=val;
	}
	public int delete(int index) {
		if(index<0||index>=size)
			return -1;
		int val=arr[index];
		for(int i=index+1;i<size;i++) {
			arr[i-1]=arr[i];
		}
		size--;
		return val;
	}
	private void growArray() {
		// TODO Auto-generated method stub
		int[] temp=new int[2*capacity];
		for(int i=0;i<size;i++) {
			temp[i]=arr[i];
		}
		capacity=2*capacity;
		arr=temp;
		
	}
	public void display() {
		System.out.println("\nArray with size: ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nArray with capacity: ");
		for(int i=0;i<capacity;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
