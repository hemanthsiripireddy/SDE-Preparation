package stackAndQueue;

public class StackImpl {
	public static void method() {
		Stack1 stack=new Stack1(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.display();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.display();
	}

}
