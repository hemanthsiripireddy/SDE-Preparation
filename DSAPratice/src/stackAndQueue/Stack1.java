package stackAndQueue;

public class Stack1 {
	int[] arr;
	int top;
	public Stack1(int size) {
		arr=new int[size];
		top=-1;
		
	}
	public void push(int num) {
		if(top==arr.length-1) {
			System.out.println("overflow");
			return;
		}
		arr[++top]=num;
		System.out.println(num+" pushed!");
		
	}
	public int pop() {
		if(top==-1) {
			System.out.println("under flow");
			return -1;
		}
		return arr[top--];
	}
	public void display() {
		System.out.println("Stack is: ");
		for(int i=top;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
