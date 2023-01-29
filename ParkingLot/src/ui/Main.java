package ui;

import java.time.LocalTime;
import java.util.Scanner;

import Pojos.Bike;
import Pojos.Car;
import Pojos.IncorrectVehicleNoFormatException;
import Pojos.InvalidDuratinException;
import Pojos.NotImplementedException;
import Pojos.Vehicle;
import dao.VehicleParkingLot;


public class Main {
	static Scanner sc=new Scanner(System.in);
	static VehicleParkingLot vpl;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			 vpl=new VehicleParkingLot();
				int ch=0;
				while(ch!=3) {
					try {
						System.out.println("Enter your option: ");
						System.out.println("1: park a vehicle: ");
						System.out.println("2: take out your vehicle from parking: ");
						System.out.println("3: exit");
						ch=sc.nextInt();
						switch(ch) {
						case 1:parkVehicle();
						break;
						case 2: takeOut();
						break;
						
						}
					}
					catch(NotImplementedException e) {
						System.out.println(e.getMessage());
						//e.printStackTrace();
						
						
					}
					catch(IncorrectVehicleNoFormatException e) {
						System.out.println(e.getMessage());
					}
					catch(InvalidDuratinException e) {
						System.out.println(e.getMessage());
					}
				}
		
		

	}

	private static void takeOut() {
		// TODO Auto-generated method stub
		System.out.println("Enter vehicle no:");
		String vno=sc.next();
		System.out.println("Enter exit time");
		int hour=sc.nextInt();
		int minute=sc.nextInt();
		LocalTime t=LocalTime.of(hour, minute);
		
		
		Vehicle v=vpl.findVehicle(vno);
		v.setExitTime(t);
		if(v.getEntryTime().compareTo(v.getExitTime())>0) {
			throw new InvalidDuratinException("exit time can't be less than entry time");
		}
		
		System.out.println("pls pay parking fee of amout and collect your vehicle:"+vpl.computeCost(v) );
		
	}

	private static void parkVehicle() {
		// TODO Auto-generated method stub
		System.out.println("Enter vehicle Type: ");
		String type=sc.next();
		if(type.equalsIgnoreCase("cycle")) {
			throw new NotImplementedException("Cycle implementation is not done ");

		}
		System.out.println("Enter vehicle Number");
		String vehicleNo=sc.next();
		System.out.println("Enter entry Time: ");
		int hour=sc.nextInt();
		int minute=sc.nextInt();
		LocalTime entryTime=LocalTime.of(hour, minute);
		System.out.println("Enter slot no: ");
		String slotNo=sc.next();
		if(slotNo.length()!=5) {
			throw new IncorrectVehicleNoFormatException("IncorrectVehicleNoFormatException");
		}
		Vehicle v;
		
		if(type.equalsIgnoreCase("car")) {
			v= new Car(vehicleNo, entryTime, slotNo);
			vpl.getVehicles().add(v);
			System.out.println("vehicle parked successfully");
		}
			 
		else if(type.equalsIgnoreCase("bike")){
			v=new Bike(vehicleNo, entryTime, slotNo);
			vpl.getVehicles().add(v);
		}
		

		
		
	}

}
