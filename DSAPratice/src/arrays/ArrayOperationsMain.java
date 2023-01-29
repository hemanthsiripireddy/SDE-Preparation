package arrays;

public class ArrayOperationsMain {
	public static void method() {
		ArrayOperationsDemo arr=new ArrayOperationsDemo(15);
		arr.insertInEnd(4);
		arr.insertInEnd(3);
		arr.insertInEnd(2);
		arr.insertInEnd(1);
		arr.insertAtIndex(0, 5);
		arr.traversal();
		//arr.traversal();
//		arr.deleteInEnd();
//		arr.traversal();
//		arr.deleteAtIndex(0);
//		arr.traversal();
//		System.out.println("is 4 present: "+arr.search(4));
//		System.out.println("is 2 present: "+arr.search(2));
//		arr.sort();
//		arr.traversal();
	}

}
