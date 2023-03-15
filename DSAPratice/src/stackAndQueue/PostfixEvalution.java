package stackAndQueue;

import java.util.Stack;

public class PostfixEvalution {
	public static void method() {
		String postfix="1230^5-*+";
		int res=postfixEvalution(postfix);
		System.out.println(res);
	}

	private static int postfixEvalution(String postfix) {
		// TODO Auto-generated method stub
		Stack<Integer>stack=new Stack();
		for(int i=0;i<postfix.length();i++) {
			char ch=postfix.charAt(i);
			if(Character.isDigit(ch)) {
				int num=ch-'0';
				stack.push(num);
			}else {
				int op2=stack.pop();
				int op1=stack.pop();
				int res=0;
				switch(ch) {
				case '/':res=op1/op2;
				break;
				case '*':res=op1*op2;
				break;
				case '+':res=op1+op2;
				break;
				case '-':res=op1-op2;
				break;
				case '^':res=(int)Math.pow(op1, op2);
				break;
				
				
				}
				stack.push(res);
				
			}
		}
		return stack.pop();
	}

}
