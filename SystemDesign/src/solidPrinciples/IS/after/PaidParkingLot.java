package solidPrinciples.IS.after;

public interface PaidParkingLot extends ParkingLot {
	public double calculateFee();
	public void doPayment();

}
