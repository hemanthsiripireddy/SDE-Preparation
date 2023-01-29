package property;

public abstract class Property {
	private Address address;
	abstract double calculateInterest();
	public Property(Address address) {
		super();
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
