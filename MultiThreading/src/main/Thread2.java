package main;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=11;i>=0;i--) {
			System.out.println(Thread.currentThread()+"i: "+i);
		}
		
		
	}

}
