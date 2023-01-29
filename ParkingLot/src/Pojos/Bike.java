package Pojos;

import java.time.LocalTime;

public class Bike extends Vehicle{
	private final double costPerHour=50;

	public Bike(String vehicldNo, LocalTime entryTime, LocalTime exitTime, String slotNo) {
		super(vehicldNo, entryTime, exitTime, slotNo,50);
		// TODO Auto-generated constructor stub
	}
	public Bike(String vehicldNo, LocalTime entryTime, String slotNo) {
		super(vehicldNo, entryTime, slotNo,50);
		// TODO Auto-generated constructor stub
	}

	

}
