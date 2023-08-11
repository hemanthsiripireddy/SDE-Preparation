package solidPrinciples.DI.after;


// here store is not dependent on which payment vendor is used
// if we change payment vendor, modification is not needed  in store class 
public class Store {
	
	PaymentProcessor paymentProcessor;
	public Store(PaymentProcessor pp) 
	
	{
		this.paymentProcessor=pp;
		
		
	}
	public void purchaseBike(int quantity) {
		paymentProcessor.pay(200*quantity);
	}
	public void purchaseHelmet(int quantity) {
		paymentProcessor.pay(30*quantity);
	}
}
interface PaymentProcessor{
	public void pay(int amount);
}
class StripePayment implements PaymentProcessor{
	String user;
	public StripePayment(String user) {
		this.user=user;
	}

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		new Stripe(user).makePayment(amount*100);
		
	}
	
}
class PaypalPayment implements PaymentProcessor{
	String user;
	public PaypalPayment(String user) {
		this.user=user;
	}

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		new Paypal().makePayment(user, amount);
		
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

