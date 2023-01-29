package property;

import java.time.LocalDate;

import tenant.IllegalTenantException;
import tenant.Resident;

public class LeaseRent {
	private int leaseID;
	private Resident resident;
	private LocalDate moveInDate;
	private LocalDate moveOutDate;
	private Property property;
	public LeaseRent(int leaseID, Resident resident, LocalDate moveInDate, LocalDate moveOutDate, Property property) throws IllegalTenantException, EmptyMoveInDateException, EmptyMoveOutDateException, InvalidDurationException {
		super();
		this.leaseID = leaseID;
		if(resident.isTenant())throw new IllegalTenantException("Resident is already a tenant");
		this.resident = resident;
		if(moveInDate==null) throw new EmptyMoveInDateException("move in date can't be null");
		this.moveInDate = moveInDate;
		if(moveOutDate==null)throw new EmptyMoveOutDateException("Move out date can't be null");
		this.moveOutDate = moveOutDate;
		if(moveInDate.compareTo(moveOutDate)>0)throw new InvalidDurationException("move in date can't be greater than move out date");
		this.property = property;
		System.out.println("lease create successfully");
	}
	public int getLeaseID() {
		return leaseID;
	}
	public void setLeaseID(int leaseID) {
		this.leaseID = leaseID;
	}
	public Resident getResident() {
		return resident;
	}
	public void setResident(Resident resident) {
		this.resident = resident;
	}
	public LocalDate getMoveInDate() {
		return moveInDate;
	}
	public void setMoveInDate(LocalDate moveInDate) {
		this.moveInDate = moveInDate;
	}
	public LocalDate getMoveODate() {
		return moveOutDate;
	}
	public void setMoveODate(LocalDate moveODate) {
		this.moveOutDate = moveODate;
	}
	public Property getProperty() {
		return property;
	}
	public void setProperty(Property property) {
		this.property = property;
	}
	
	

}
