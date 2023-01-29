package driver;

import java.rmi.dgc.Lease;
import java.time.LocalDate;

import property.Address;
import property.EmptyMoveInDateException;
import property.EmptyMoveOutDateException;
import property.InvalidDurationException;
import property.LeaseRent;
import property.Property;
import property.RowHouse;
import tenant.IllegalTenantException;
import tenant.Resident;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address=new Address("12","tirupati","AP");
		Resident hemanth =new Resident(1, "hemanth", "Siripireddy");
		//hemanth.setTenant(true);
		
		Property gan=new RowHouse(address);
		 
		LocalDate moveInDate=LocalDate.of(2022, 1, 1);
		LocalDate moveOutDate=LocalDate.of(2021, 6, 30);
		try {
			LeaseRent lease=new LeaseRent(1,hemanth,moveInDate,moveOutDate,gan);
		} catch (IllegalTenantException illegalTenantException ) {
			System.out.println("Property can't be leased by exising tenant");
			System.out.println(illegalTenantException.getMessage());
			//illegalTenantException.getStackTrace()
			// TODO Auto-generated catch block
			illegalTenantException.printStackTrace();
		}
		catch(EmptyMoveInDateException emptyMoveInDateException) {
			System.out.println("Move in date can't be empty");
			System.out.println(emptyMoveInDateException.getMessage());
			emptyMoveInDateException.printStackTrace();
		}
		catch(EmptyMoveOutDateException emptyMoveOutDateException) {
			System.out.println("Move out date can't be empty");
			System.out.println(emptyMoveOutDateException.getMessage());
			emptyMoveOutDateException.printStackTrace();
		}
		catch(InvalidDurationException invalidDurationException) {
			System.out.println("move in date can't be greater than move out date");
			System.out.println(invalidDurationException.getMessage());
			invalidDurationException.printStackTrace();
		}
		

	}

}
