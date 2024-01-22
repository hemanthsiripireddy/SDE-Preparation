package sych;

public class Thread2 extends Thread {

School sch;
	
	
String name;


public Thread2(School sc,String name) {
	this.name=name;
	//super();
	this.sch = sc;
}



	public void run() {
		sch.display(name);
		
	}
}
