package solidPrinciples.DI.before;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store=new Store("hemanth");
		store.purchaseBike(2);
		store.purchaseHelmet(3);

	}

}
