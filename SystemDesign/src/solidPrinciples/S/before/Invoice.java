package solidPrinciples.S.before;

import solidPrinciples.S.Book;

public class Invoice {
	Book book;
	int quantity;
	double discountRate;
	double taxRate;
	public Invoice(Book book, int quantity, double discountRate, double taxRate) {
		super();
		this.book = book;
		this.quantity = quantity;
		this.discountRate = discountRate;
		this.taxRate = taxRate;
	}
	public double calculateTotalPrice() {
		double price=quantity*(book.price-book.price*discountRate);
		price-=price*taxRate;
		return price;
	}
	public void printInvoice(){
		double totalPrice=calculateTotalPrice();
		System.out.println("Quantity: "+quantity+" bookName: "+book.name+" book price: "+book.price);
		System.out.println("discountRate: "+discountRate+" "+" taxRate: "+taxRate);
		System.out.println("Total price: "+totalPrice);
		
	}
	public void savToFile(String fileName) {
		
	}

}
