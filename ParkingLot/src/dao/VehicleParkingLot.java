package dao;

import java.util.ArrayList;
import java.util.List;

import Pojos.Vehicle;

public class VehicleParkingLot {
	private List<Vehicle>vehicles;

	public VehicleParkingLot() {
		super();
		this.vehicles = new ArrayList<>();
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	public Vehicle findVehicle(String vehicleNO) {
		for(int i=0;i<vehicles.size();i++) {
			if(vehicles.get(i).getVehicldNo().equalsIgnoreCase(vehicleNO)) {
				return vehicles.get(i);
			}
		}
		return null;
	}
	public double computeCost(Vehicle v) {
		double price=((v.getExitTime().getHour()-v.getEntryTime().getHour())*v.getCostPerHour1());
		return price;
	}
	
	

}
