package main;

public class Sych {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Brackets brackets = new Brackets();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				long startTime=System.currentTimeMillis();
				for (int i = 0; i < 5; i++) {
					brackets.printBrackets('[', ']');
				}
				long endTime=System.currentTimeMillis();
				System.out.println("Total time took by thread 1 is  "+ (endTime-startTime));

			}
		});
		t1.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				long startTime=System.currentTimeMillis();
				for (int i = 0; i < 5; i++) {
					brackets.printBrackets('(', ')');
				}
				long endTime=System.currentTimeMillis();
				System.out.println("Total time took by thread 2 is "+ (endTime-startTime));


			}
		});

		t2.start();

	}

}
