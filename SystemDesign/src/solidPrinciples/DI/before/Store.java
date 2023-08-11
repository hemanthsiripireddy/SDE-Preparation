package solidPrinciples.DI.before;

public class Store {
	// if payment API is stripe;

//	Stripe stripe;
//	public Store(String user) {
//		stripe=new Stripe(user);
//		
//	}
//	public void purchaseBike(int quantity) {
//		stripe.makePayment(200*quantity*100);
//	}
//	public void purchaseHelmet(int quantity) {
//		stripe.makePayment(30*quantity*100);
//	}
	
	//if Payment API is Paypal
	// had to change lot of code in Store class to change from Stripe to Paypal
	String user;
  Paypal paypal;
	public Store(String user) {
		this.user=user;
		 paypal=new Paypal();
		
	}
	public void purchaseBike(int quantity) {
		paypal.makePayment(user,200*quantity);
	}
	public void purchaseHelmet(int quantity) {
		paypal.makePayment(user,30*quantity*100);
	}
}
class Stripe{
	String user;
	public Stripe(String user) {
		this.user=user;
	}
	public void makePayment(int amountInCents) {
		System.out.println(user+" made payment of "+amountInCents/100);
	}
}
class Paypal{
	public void makePayment(String user, int amountInDollars) {
		System.out.println(user+" made payment of "+ amountInDollars);
	}
}
