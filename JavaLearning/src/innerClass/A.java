package innerClass;

public class A {
	static public int a=3;
	public void show(int a) {
		
		System.out.println("inside show");
	}
	static class B{
		int c;
		public B(int k) {
			c=k;
		}
		public void config() {
			
			System.out.println(c+" inside config"); 
		}
	}

}
