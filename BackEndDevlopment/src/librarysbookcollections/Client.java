package librarysbookcollections;

import java.util.Scanner;

public class Client {
	public void runLibrary() {
		Scanner sc=new Scanner(System.in);
		Library library=new Library();
		boolean flag=true;
		while(flag) {
			int n=0;
			System.out.println("Enter you option:\n 1: to add a book\n "
					+ "2: to search for a book\n 3: to display list of books in library\n  "
					+ "4: to remove a book\n 5: to exit library");
			n=sc.nextInt();
			switch(n){
			case 1: 
				System.out.println("Please enter title of the book");
				String title=sc.next();
				System.out.println("Please enter authoer of the book");
				String author=sc.next();
				System.out.println("Please enter publisher of the book");
				String publisher=sc.next();
				System.out.println("Please enter size of book: ");

				int size=sc.nextInt();
				library.addBook(title,author,publisher,size);
				break;
			case 2: 
				System.out.println(" Please enter title of the  book to search ");
				 title =sc.next();
				 library.searchBooks(FeildName.Author, title);
				 break;
			case 3:  
				library.displayBooks();
				break;
			case 4: 
				System.out.println(" Please enter title of the  book to remove ");
				 title =sc.next();
				 library.removeBook(FeildName.Title, title);
				 break;
			case 5: 
				flag=false;
				break;
				 
				
				
			}
		}
	}

}
