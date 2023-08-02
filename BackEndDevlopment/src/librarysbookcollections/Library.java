package librarysbookcollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Library {
	private List<Book>books;
	public Library() {
		books=new ArrayList<>();
	}
	
	public void addBook(String title,String author,String publisher,int numberOfpages) {
		Book newBook=new Book(title,author,publisher,numberOfpages);
		books.add(newBook);
			
		
	}

public List<Book> getBooks(FeildName feildName,String value) {
	List<Book>list;
	if(feildName==FeildName.Author) {
		list=books.stream().filter(book->book.getAuthor().equals(value)).collect(Collectors.toList());
	}else if(feildName==FeildName.Publisher) {
		list=books.stream().filter(book->book.getPublisher().equals(value)).collect(Collectors.toList());
		
	}else if(feildName==FeildName.Title) {
		list=books.stream().filter(book->book.getTitle().equals(value)).collect(Collectors.toList());
	}else {
		list=null;
	}
	return list;
	
	
}
public void searchBooks(FeildName fieldname,String title) {
	List<Book>list=getBooks(fieldname, title);
	if(list==null||list.size()==0) {
		System.out.println("found no books with applied filer");
		return;
	}
	for(Book book:list) {
		System.out.println("Book Name: "+book.getTitle()+" Author: "+book.getAuthor()+" publisher: "+book.getPublisher());
	}
	
}
public void displayBooks(){
	if(books.size()==0) {
		System.out.println("there are no books in the library");
		return;
	}
	for(Book book:books) {
		System.out.println("Book Name: "+book.getTitle()+" Author: "+book.getAuthor()+" publisher: "+book.getPublisher());
	}
	
	
}
public void removeBook(FeildName fieldname,String value) {
	List<Book>list=getBooks(fieldname, value);
	
	if(list==null||list.size()==0) {
		System.out.println("no books to remove");
	}
	for(Book b:list) {
		books.remove(b);
	}
	System.out.println("removed books with given filer criteria");
}

}

