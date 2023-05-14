package heap;

public class HeapSort {
	public void sort(int[] arr,int size) {
		for(int i=size/2-1;i>=0;i--) {
			heapfyDown(arr,size,i);
		}
		for(int i=size-1;i>0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapfyDown(arr,i,0);
		}
	}
	private void heapfyDown(int[] arr,int size,int i) {
		// TODO Auto-generated method stub
		int max=i;
		int left=getLeftChild(i);
		int right=getRightChild(i);
		if(left<size&&arr[left]>arr[max])
			max=left;
		if(right<size&&arr[right]>arr[max])
			max=right;
		if(i!=max) {
			int temp=arr[i];
			arr[i]=arr[max];
			arr[max]=temp;
			heapfyDown(arr,size,max);
		}
		
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
