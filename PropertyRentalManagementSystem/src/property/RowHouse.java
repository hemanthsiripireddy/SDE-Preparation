package property;

import property.rent.RentCalculator;

public class RowHouse extends Property implements RentCalculator{
	public RowHouse(Address address) {
		super(address);
		// TODO Auto-generated constructor stub
	}
	private double backyardArea;
	private double frontyardArea;
	
	public RowHouse(Address address, double backyardArea, double frontyardArea) {
		super(address);
		this.backyardArea = backyardArea;
		this.frontyardArea = frontyardArea;
	}
	@Override
	public double rentCalcualtor() {
		// TODO Auto-generated method stub
		return 10000+(backyardArea+frontyardArea);
	}
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		return 1000+(backyardArea+frontyardArea);
	}
	public double getBackyardArea() {
		return backyardArea;
	}
	public void setBackyardArea(double backyardArea) {
		this.backyardArea = backyardArea;
	}
	public double getFrontyardArea() {
		return frontyardArea;
	}
	public void setFrontyardArea(double frontyardArea) {
		this.frontyardArea = frontyardArea;
	}
	

}
