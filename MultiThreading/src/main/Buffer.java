package main;

public class Buffer {
	public int value;
	
	 synchronized public void produce_item(int value) {
		this.value=value;
		System.out.println("Produced item is: "+ this.value);
	}
	
	synchronized public int consume_item() {
		System.out.println("Consumed item is: "+this.value);
		return this.value;
	}

}
