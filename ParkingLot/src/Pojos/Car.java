package Pojos;

import java.time.LocalTime;

public class Car extends Vehicle {
	private final double costPerHour=100;

	public Car(String vehicldNo, LocalTime entryTime, LocalTime exitTime, String slotNo) {
		super(vehicldNo, entryTime, exitTime, slotNo,100);
		// TODO Auto-generated constructor stub
	}
	public Car(String vehicldNo, LocalTime entryTime, String slotNo) {
		super(vehicldNo, entryTime, slotNo,100);
		// TODO Auto-generated constructor stub
	}

	

}
