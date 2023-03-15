package stackAndQueue;

import java.util.Stack;

public class BalancedBrackets {
	public static void method() {
		String brackets="({[]]})";
				boolean res=checkBalancedBrackets(brackets);
				System.out.println(res);
	}

	private static boolean checkBalancedBrackets(String brackets) {
		// TODO Auto-generated method stub
		if(brackets.length()==0)
			return true;
		Stack<Character>stack=new Stack();
		for(int i=0;i<brackets.length();i++) {
			char ch=brackets.charAt(i);
			if(ch=='('||ch=='{'||ch=='['){
				stack.push(ch);
				
			}else {
				if(stack.size()==0||(!isMatch(stack.peek(),ch)))
					return false;
				stack.pop();
			}
		}
		if(stack.size()>0)
			return false;
		return true;
	}

	private static boolean isMatch(char open, char close) {
		// TODO Auto-generated method stub
		if((open=='('&&close==')')||(open=='['&&close==']')||(open=='{'&&close=='}'))
			return true;
		return false;
	}

}
