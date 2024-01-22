package sych;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School sc=new School("Hemanth");
		Thread1 t1=new Thread1(sc,"sai");
		Thread2 t2=new Thread2(sc,"sai");
		t1.start();
		t2.start();

	}

}
