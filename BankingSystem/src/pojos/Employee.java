package pojos;

public class Employee extends Person {
	
	//private String name;
	private String code;
	private String contactNumber;
	
	
	public Employee(String name, String mailid, String password, String code, String contactNumber) {
		super(name, mailid, password, "Employee");
		this.code = code;
		this.contactNumber = contactNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	

}
