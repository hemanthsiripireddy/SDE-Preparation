package officeManagementPortal.pojos;

public class TeamMate extends Employee{
	
	private int managerID;
	
	
	public TeamMate(int id, String name) {
		super(id,name,"","");
		//this.managerID=managerID;
		
	}
	
	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	//@Override
	public void displayDetails() {
		System.out.println(toString()+"ManagerID: "+managerID) ;
	}

	
	

}
