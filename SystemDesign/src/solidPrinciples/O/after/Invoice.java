package solidPrinciples.O.after;

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
	
	

}
