package Pojos;

import java.time.LocalTime;

public class Cycle extends Vehicle {
	private final double costPerHour=10;

	public Cycle(String vehicldNo, LocalTime entryTime, LocalTime exitTime, String slotNo) {
		super(vehicldNo, entryTime, exitTime, slotNo,10);
		// TODO Auto-generated constructor stub
	}

	

}
