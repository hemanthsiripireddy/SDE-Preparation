package stackAndQueue;

import java.util.Stack;

public class InfixToPostFixExpression {
	public static void method() {
		String infix="x+y*(z^p-q)";//(x+(y*((z^p)-q)))
		String postfix=infixToPostfix(infix);
		System.out.println(postfix);
	}

	private static String infixToPostfix(String infix) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<infix.length();i++) {
			char ch=infix.charAt(i);
			if(Character.isLetter(ch)) {
				sb.append(ch);
			}
			else if(ch=='(') {
				stack.push(ch);
				
			}else if(ch==')') {
				while(stack.peek()!='(') {
					sb.append(stack.pop());
				}
				stack.pop();
			}else {
				while(!stack.isEmpty()&& precedence(ch)<precedence(stack.peek()))
				{
					sb.append(stack.pop());
				}
				stack.push(ch);
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return new String(sb);
	}

	private static int precedence(char ch) {
		// TODO Auto-generated method stub
		switch(ch) {
		case '^':return 3;
		case '%':
		case '*':
			return 2;
		case '+':
		case '-':
			return 1;
		}
		return 0;
	}

}
