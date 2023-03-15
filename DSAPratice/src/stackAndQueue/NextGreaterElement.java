package stackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
	public static void method() {
		int[] arr= {3,5,7,1,4};
		int[] res=nexGreaterElement(arr);
		for(int i:res) {
			System.out.print(i+" ");
		}
	}

	private static int[] nexGreaterElement(int[] arr) {
		// TODO Auto-generated method stub
		int[] res=new int[arr.length];
		Arrays.fill(res, -1);
		Stack<Integer>stack=new Stack();
		stack.push(arr[arr.length-1]);
		for(int i=arr.length-2;i>=0;i--) {
			int num=arr[i];
			while(!stack.isEmpty()&&stack.peek()<=num)
				stack.pop();
			if(!stack.isEmpty())
				res[i]=stack.peek();
			stack.push(num);
		}
				
		return res;
	}

}
