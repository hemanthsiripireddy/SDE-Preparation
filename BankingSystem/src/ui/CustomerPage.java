package ui;

import java.util.Scanner;

import dao.AccountDao;
import dao.PersonDao;
import pojos.Account;
import pojos.Person;

public class CustomerPage {
	static Person person;
	static AccountDao accountDao;
	static Scanner sc=new Scanner(System.in);
	public static void customerPage(Person person1,AccountDao accountDao1) {
		
		person=person1;
		accountDao= accountDao1;
		
		int ch=0;
		while(ch!=5) {
			System.out.println("1:create savings or current account: ");
			System.out.println("2: insert money");
			System.out.println("3:with draw money");
			System.out.println("4:display account details");
			System.out.println("5:logout ");
			System.out.println("enter your choice");
			ch=sc.nextInt();
			switch(ch){
			case 1:createAccount();
			break;
			case 2: insertMoney();
			break;
			case 3: withdrawMoney();
			break;
			case 4: displayDetails();
			break;
			case 5:
				System.out.println("logged out sucessfully");
			}
		}
	}
	public static void createAccount() {
		System.out.println("Enter account number");
		String number =sc.next();
		System.out.println("Enter account type: savings/current  ");
		String type=sc.next();
		accountDao.createAcoount(person, number, type);
		
	}
	public static void insertMoney() {
		System.out.println("enter account number: ");
		String number =sc.next();
		Account account=accountDao.findAccount(person, number);
		if(account==null) {
			System.out.println("account not found");
		}else {
			System.out.println("enter amount to add");
			double amount=sc.nextDouble();
			account.insertMoney(amount);
			System.out.println("money added sccesfuly");
		}
	}
	public static void withdrawMoney() {
		System.out.println("enter account number: ");
		String number =sc.next();
		Account account=accountDao.findAccount(person, number);
		if(account==null) {
			System.out.println("account not found");
		}else {
			System.out.println("enter amount to withdraw");
			double amount=sc.nextDouble();
			account.withdrawMoney(amount);
			System.out.println("money withdrawn sccesfuly");
		}
		
	}
	public static void displayDetails() {
		System.out.println("enter account number: ");
		String number =sc.next();
		Account account=accountDao.findAccount(person, number);
		if(account==null) {
			System.out.println("account not found");
		}else {
			System.out.println("Account details: "+ account.toString());
		}
		
	}

}
