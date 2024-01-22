package sych;

public class School {
	
	private String name;
	
	
	
	public School(String name) {
		super();
		this.name = name;
	}



	public    void display(String tN) {
		synchronized (tN) {
			for(int i=1;i<=5;i++) {
				System.out.println(tN+" " +name+" "+ i);
			}
			
		}
	}

}
