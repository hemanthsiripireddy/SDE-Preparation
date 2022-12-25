package pojos;

public class Account {
	private String accountNumber;
	private double balance;
	private String type;
	private Person customer;
	
	
	public Account(String accountNumber, double balance, String type) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.type = type;
	}
	
	
	public Account(String accountNumber, double balance, String type, Person customer) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.type = type;
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", type=" + type + ", customer="
				+ customer + "]";
	}


	public Person getCustomer() {
		return customer;
	}


	public void setCustomer(Person customer) {
		this.customer = customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void insertMoney(double money) {
		this.balance+=money;
	}
	public void withdrawMoney(double money) {
		if(this.balance<money) {
			System.out.println("insufficient money");
		}
		else {
			this.balance-=money;
			System.out.println("collect the money: "+money);
		}
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
