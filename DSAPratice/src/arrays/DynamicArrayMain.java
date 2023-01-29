package arrays;

public class DynamicArrayMain {
	public static void method() {
		DynamicArrayDemo arr=new DynamicArrayDemo(3);
		arr.insert(1);
		arr.insert(2);
		arr.insert(3);
		arr.insert(4);
		arr.display();
		arr.delete(0);
		arr.display();
		arr.delete(2);
		arr.display();
		
	}

}
