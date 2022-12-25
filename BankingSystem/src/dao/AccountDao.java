package dao;

import java.util.ArrayList;
import java.util.List;

import pojos.Account;
import pojos.CurrentAccount;
import pojos.Person;
import pojos.SavingsAccount;

public class AccountDao {
	List<Account> accounts;

	public AccountDao() {
		this.accounts=new ArrayList<>();
	}
	
	public void createAcoount(Person person,String accountNumber,String type) {
		if(type.equalsIgnoreCase("savings")) {
			Account account=new SavingsAccount(accountNumber, 0, person);
			accounts.add(account);
			System.out.println("Created savings account seccessfully");
		}else if(type.equalsIgnoreCase("current")){
			Account account=new CurrentAccount(accountNumber, 0, person);
			accounts.add(account);
			System.out.println("Created current account seccessfully");
			
		}
		
	}
	public Account findAccount(Person person,String number) {
		for(int i=0;i<accounts.size();i++) {
			if(accounts.get(i).getAccountNumber().equalsIgnoreCase(number)&&accounts.get(i).getCustomer().equals(person)) {
				return accounts.get(i);
			};
			
		}
		return null;
	}
	

}
