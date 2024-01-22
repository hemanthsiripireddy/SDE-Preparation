package main;

public class Brackets {
	   synchronized void  printBrackets(char start, char end) {
		//synchronized(this) {
			 
			 for(int i=1;i<=10;i++) {
					if(i<=5) {
						System.out.print(start);
					}
					else
						System.out.print(end);
				}
			
			 
				
				System.out.println();
		//}
				
				try {
					Thread.sleep(225);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
		 //}
		
		
	}

}
