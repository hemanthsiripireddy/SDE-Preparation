package designPattern.structural.bridgeDesign;

public class BridgeDesignExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment payment=new CardPayment(new IDBIGateWay());
		payment.makePayment();

	}

}
abstract class Payment{
	PaymentSystem ps;
	public Payment(PaymentSystem ps) {
		this.ps=ps;
	}
	public abstract void makePayment();
	
}
class CardPayment extends Payment{

	public CardPayment(PaymentSystem ps) {
		super(ps);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		ps.processPayment("card Payment");
	}
	
}
class NetBankingPayment extends Payment{

	public NetBankingPayment(PaymentSystem ps) {
		super(ps);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		ps.processPayment("netbanking");
		
	}
	
}
interface PaymentSystem{
	public void processPayment(String paymentMethod);
}
class IDBIGateWay implements PaymentSystem{

	@Override
	public void processPayment(String paymentMethod) {
		// TODO Auto-generated method stub
		System.out.println("Payment processed using IDBI Gate way for "+paymentMethod);
		
	}
	
}
class CityPaymentGateWay implements PaymentSystem{

	@Override
	public void processPayment(String paymentMethod) {
		// TODO Auto-generated method stub
		System.out.println("Payment processed using Citypayment Gate way for "+paymentMethod);

		
	}
	
}
