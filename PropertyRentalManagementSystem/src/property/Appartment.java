package property;

import property.rent.RentCalculator;

public class Appartment extends Property implements RentCalculator{
	private double coveredArea;
	private double superArea;

	public Appartment(Address address) {
		super(address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double rentCalcualtor() {
		// TODO Auto-generated method stub
		
		return 10000+(coveredArea+superArea);
	}

	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		return 1000+0.3*(coveredArea+superArea);
	}

	public double getCoveredArea() {
		return coveredArea;
	}

	public void setCoveredArea(double coveredArea) {
		this.coveredArea = coveredArea;
	}

	public double getSuperArea() {
		return superArea;
	}

	public void setSuperArea(double superArea) {
		this.superArea = superArea;
	}

	public Appartment(Address address, double coveredArea, double superArea) {
		super(address);
		this.coveredArea = coveredArea;
		this.superArea = superArea;
	}

}
