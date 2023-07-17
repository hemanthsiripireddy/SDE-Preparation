package stackAndQueue;

import java.util.Stack;

public class ValidParenthesisString {
	public static void method() {
		String s="(*)";
		boolean res=checkValidString(s);
		System.out.println(res);
	}
	public static boolean checkValidString(String s) {

        Stack<Character>stack=new Stack<>();
        int i=0;
      return   compute(i,stack,s);
        
    }
    public static boolean compute(int i,Stack<Character>stack,String s){
        if(i==s.length()){
            if(stack.size()==0) return true;
            return false;
        }

        if(s.charAt(i)=='('){
            stack.push('(');
            return compute(i+1,stack,s);
        }else if(s.charAt(i)=='*'){
            stack.push('(');
            if(compute(i+1,stack,s))return true;
            stack.pop();
            if(compute(i+1,stack,s)) return true;
            if(stack.size()>0&&stack.peek()=='('){
                stack.pop();
                return compute(i+1,stack,s);
            }
            return false;
            
        }else{
            if(stack.size()>0&&stack.peek()=='('){
              char ch=  stack.pop();
                boolean ans= compute(i+1,stack,s);
                if(ans) return true;
                stack.push(ch);
                return false;
            }
            return false;
        }
    }

}
