package tenant;

public class Resident {
	private int socailID;
	private String firstName;
	private String lastName;
	private boolean isTenant;
	public Resident(int socailID, String firstName, String lastName) {
		super();
		this.socailID = socailID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getSocailID() {
		return socailID;
	}
	public void setSocailID(int socailID) {
		this.socailID = socailID;
	}
	public String getFirstName() {
		return firstName;
	}
	public boolean isTenant() {
		return isTenant;
	}
	public void setTenant(boolean isTenant) {
		this.isTenant = isTenant;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
