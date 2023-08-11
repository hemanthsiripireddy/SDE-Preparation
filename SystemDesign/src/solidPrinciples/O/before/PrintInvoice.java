package solidPrinciples.O.before;

public class PrintInvoice {
	private Invoice invoice;

	public PrintInvoice(Invoice invoice) {
		
		this.invoice = invoice;
	}
	public void printInvoice(){
		double totalPrice=invoice.calculateTotalPrice();
		System.out.println("Quantity: "+invoice.quantity+" bookName: "+invoice.book.name+" book price: "+invoice.book.price);
		System.out.println("discountRate: "+invoice.discountRate+" "+" taxRate: "+invoice.taxRate);
		System.out.println("Total price: "+totalPrice);
		
	}
	

}
