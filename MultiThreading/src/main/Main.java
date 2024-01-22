package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1();
		t1.start();
		Thread2 th=new Thread2();
		Thread t2=new Thread(th);
		t2.start();
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread()+"i: "+i);
		}
		
		
		
		

	}

}
