package main;

public class Producer extends Thread{
	Buffer buffer;

	public Producer(Buffer buffer) {
		super();
		this.buffer = buffer;
	}
	public void run() {
		int i=1;
		while(true) {
			buffer.produce_item(i);
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
