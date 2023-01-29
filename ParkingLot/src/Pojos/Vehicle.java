package Pojos;

import java.time.LocalTime;

public abstract class Vehicle {
	private double costPerHour;
	
	private String vehicldNo;
	private LocalTime entryTime;
	private LocalTime exitTime;
	private String slotNo;
	public Vehicle(String vehicldNo, LocalTime entryTime, LocalTime exitTime, String slotNo,double cost) {
		this.costPerHour=cost;
		
		//super();
		this.vehicldNo = vehicldNo;
		this.entryTime = entryTime;
		this.exitTime = exitTime;
		this.slotNo = slotNo;
		
	}
	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}
	public double getCostPerHour1() {
		return this.costPerHour;
	}
	
	public Vehicle(String vehicldNo, LocalTime entryTime, String slotNo,double cost) {
		//super();
		this.vehicldNo = vehicldNo;
		this.entryTime = entryTime;
		//this.exitTime = exitTime;
		this.slotNo = slotNo;
		this.costPerHour=cost;
		
	}
	public String getVehicldNo() {
		return vehicldNo;
	}
	public void setVehicldNo(String vehicldNo) {
		this.vehicldNo = vehicldNo;
	}
	public LocalTime getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(LocalTime entryTime) {
		this.entryTime = entryTime;
	}
	public LocalTime getExitTime() {
		return exitTime;
	}
	public void setExitTime(LocalTime exitTime) {
		
		this.exitTime = exitTime;
	}
	public String getSlotNo() {
		return slotNo;
	}
	public void setSlotNo(String slotNo) {
		this.slotNo = slotNo;
	}
	

}
