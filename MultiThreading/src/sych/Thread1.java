package sych;

public class Thread1 extends Thread{
	
	School sch;
	String name;
	
	
	public Thread1(School sc,String name) {
		this.name=name;
		//super();
		this.sch = sc;
	}


	public void run() {
		sch.display(name);
		
	}

}
