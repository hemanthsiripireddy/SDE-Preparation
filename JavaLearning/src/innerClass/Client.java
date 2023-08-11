package innerClass;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.show(4);
		A.B b=new A.B(5);
		b.config();
		A.B c=new A.B(6);
		c.config();
		
	}

}
