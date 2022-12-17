package officeManagementPortal.pojos;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
	
	
	private int numberOfTeamMates;
	List<TeamMate>teamMates;
	
	public int getNumberOfTeamMates() {
		return numberOfTeamMates;
	}
	public void setNumberOfTeamMates(int numberOfTeamMates) {
		this.numberOfTeamMates = numberOfTeamMates;
	}
	public List<TeamMate> getTeamMates() {
		return teamMates;
	}
	public void setTeamMates(List<TeamMate> teamMates) {
		this.teamMates = teamMates;
	}
	public Manager(int id, String name, String department, String teamName) {
		super(id,name,department,teamName);
		teamMates=new ArrayList<>();
		numberOfTeamMates=0;
		
		//this.numberOfTeamMates = numberOfTeamMates;
	}
	public void displayDetails() {
		System.out.println(toString()+"Number Of Team Memebers : "+numberOfTeamMates); 
	}
	public void addTeamMember(TeamMate teamMate) {
		teamMates.add(teamMate);
		numberOfTeamMates++;
		teamMate.setDepartment(this.getDepartment());
		teamMate.setManagerID(this.getId());
		teamMate.setTeamName(this.getTeamName());
		
	}
	public void displayDetailsOfTeamMates() {
		for(int i=0;i<teamMates.size();i++) {
			System.out.println(teamMates.get(i).toString());
		}
	}
	

}
