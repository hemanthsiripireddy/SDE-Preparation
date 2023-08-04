package CollectionFramwork;

public class MyArrayList {
	int[] arr;
	int size;
	int capacity;
	
	public MyArrayList(int n) {
		arr=new int[n];
		capacity=n;
		size=0;
	}
	public MyArrayList() {
		arr=new int[8];
		capacity=8;
		size=0;
	}
	public void add(int val) {
		if(size==capacity) {
			int[] newArray=new int[2*capacity];
			copy(newArray,arr);
			arr=newArray;
			arr[size++]=val;
		}
		arr[size++]=val;
		
	}
	public void add(int index,int val) {
		
	}
	private void copy(int[] newArray, int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			newArray[i]=arr[i];
		}
		
	}

}
