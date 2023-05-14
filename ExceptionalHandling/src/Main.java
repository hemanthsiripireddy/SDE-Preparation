import java.io.IOException;

public class Main {

	public static void main  (String[] args)  {
	//	ThrowKeyword.throwKeyword();
	//throw new ArithmeticException("hello world");
		//TryWithResourcesDemo.tryWithResourcesDemo();
		//UserDefinedExceptionDemo.userDefinedExcepton();
		//TryWithResourcesDemo.tryWithResourcesDemo();
		try {
			throw new IOException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getStackTrace();
			System.out.println(e.getMessage());
			e.printStackTrace();
			//System.out.println(e.printStackTrace());
		}
		finally {
			
		}
		
		
	}

}
