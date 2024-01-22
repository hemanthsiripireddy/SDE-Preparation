package main;

public class Consumer extends Thread {
	Buffer buffer;

	public Consumer(Buffer buffer) {
		super();
		this.buffer = buffer;
	}
	
	public void run() {
		
		while(true) {
		int value=	buffer.consume_item();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
