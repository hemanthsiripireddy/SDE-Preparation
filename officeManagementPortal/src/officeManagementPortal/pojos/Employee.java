package officeManagementPortal.pojos;

 abstract class Employee {
	private int id;
	 private String name;
	 private String department;
	 private String teamName;
	public Employee(int id, String name, String department, String teamName) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.teamName = teamName;
	}
	public abstract void displayDetails();
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", teamName=" + teamName + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	 
	 
	
}
