package librarysbookcollections;

public class Book {
	private String title;
	private int numberOfPages;
	private String author;
	private String publisher;
	public Book(String title) {
		this.title=title;
	}
	public Book (String title,int numberofPages) {
		this.title=title;
		this.numberOfPages=numberofPages;
	}
	public Book (String title,String author,String publisher,int numberOfpages) {
		this.title=title;
		this.numberOfPages=numberOfPages;
		this.author=author;
		this.publisher=publisher;
	}
	public String getTitle() {
		return this.title;
	}
	public int getNumberOfPages() {
		return this.numberOfPages;
		
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	

}
