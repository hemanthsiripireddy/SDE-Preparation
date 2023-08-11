package solidPrinciples.DI.after;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Store store=new Store(new PaypalPayment("hemanth"));
		store.purchaseBike(2);
		store.purchaseHelmet(3);

	}

}
