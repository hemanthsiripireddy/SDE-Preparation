package stackAndQueue;

import java.util.Stack;

public class FindCelebrity {
	public static void method() {
		//1
		int[][] arr= {{0,1,0,0},{1,0,0,0},{0,1,0,0},{0,1,0,0}};//arr[1][0]
		int celebrity=findCelebrityUsingStack(arr);
		System.out.println(celebrity);
	}

	private static int findCelebrityUsingStack(int[][] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		Stack<Integer>stack=new Stack();
		for(int i=0;i<n;i++) {
			stack.push(i);
		}
		while(stack.size()>1) {
			int n1=stack.pop();
			int n2=stack.pop();
			if(arr[n1][n2]==1) {
				stack.push(n2);
			}else {
				stack.push(n1);
			}
		}
		int celebrity=stack.pop();
		for(int i=0;i<n;i++) {
			if(celebrity!=i&&(arr[i][celebrity]==0||arr[celebrity][i]==1))
				return -1;
		}
		
		return celebrity;
	}

}
