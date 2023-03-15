package stackAndQueue;

import java.util.Stack;

public class PostfixToInfix {
	public static void method() {
		String postfix="xyzp^q-*+";
		String infix=postfixToInfix(postfix);
		System.out.println(infix);
	}

	private static String postfixToInfix(String postfix) {
		// TODO Auto-generated method stub
		Stack<String>stack=new Stack();
		for(int i=0;i<postfix.length();i++) {
			char ch=postfix.charAt(i);
			if(Character.isLetter(ch)) {
				stack.push(ch+"");
			}else {
				String op2=stack.pop();
				String op1=stack.pop();
				String res="("+op1+ch+op2+")";
				stack.push(res);
			}
		}
		return stack.pop();
	}


}
