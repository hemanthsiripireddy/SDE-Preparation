package second;

import java.io.IOException;

import javax.management.RuntimeErrorException;

public class SubClass1 extends SuperClass1{
	public void method() throws IOException {
		throw new NullPointerException();
		
	}

}

