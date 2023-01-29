package arrays;

public class ArrayOperationsDemo {
	int[] arr;
	int size;
	int capacity;

	public ArrayOperationsDemo(int capacity) {

		this.capacity = capacity;
		this.arr = new int[capacity];
		this.size = 0;
	}

	public void insertInEnd(int val) {
		if (size == capacity) {
			System.out.println("array size is full");
			return;

		}
		arr[size++] = val;

	}
	public void insertAtIndex(int index,int val) {
		if(size==capacity) {
			System.out.println("array is full");
			return ;
		}
		for(int i=index;i<size;i++) {
			arr[i+1]=arr[i];
		}
		arr[index]=val;
		size++;
		
	}
	public void insertAtIndex1(int index,int val) {
		if(size==capacity) {
			System.out.println("array is full");
			return ;
		}
		for(int i=size;i>index;i--) {
			arr[i]=arr[i-1];
		}
		arr[index]=val;
		size++;
		
	}

	public int deleteInEnd() {
		if (size == 0) {
			System.out.println("array size is empty");
			return -1;
		}
		return arr[size--];
	}

	public int deleteAtIndex(int index) {
		if (index < 0 || index >= size) {
			System.out.println("invalid index");
			return -1;
		}
		int val = arr[index];
		for (int i = index + 1; i < size; i++) {
			arr[i - 1] = arr[i];
		}
		arr[size - 1] = 0;
		size--;
		return val;
	}

	public boolean search(int val) {
		for (int i = 0; i < size; i++) {
			if (val == arr[i])
				return true;
		}
		return false;
	}

	public void sort() {
		int flag = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					flag = 1;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (flag == 0)
				break;
		}
	}

	public void traversal() {
		System.out.println("Array traversal is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
