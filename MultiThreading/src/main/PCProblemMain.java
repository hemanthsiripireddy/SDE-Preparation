package main;

public class PCProblemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buffer buffer=new Buffer();
		
		Producer p=new Producer( buffer);
		Consumer c=new Consumer(buffer);
		p.start();
		c.start();

	}

}
