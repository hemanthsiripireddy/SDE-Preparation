package pojos;

public class Person {
	protected String name;
	protected String mailid;
	protected String password;
	protected String type;
	
	public Person(String name, String mailid, String password, String type) {
		super();
		this.name = name;
		this.mailid = mailid;
		this.password = password;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", mailid=" + mailid + ", password=" + password + ", type=" + type + "]";
	}
	
	
}
