package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.AccountDao;
import dao.PersonDao;
import pojos.Customer;
import pojos.Employee;
import pojos.Person;

public class BankingSystem {
	static Scanner sc=new Scanner(System.in);
	static PersonDao personDao;
	static AccountDao accountdao;
	public static void main(String[] args) {
		personDao =new PersonDao();
		accountdao=new AccountDao();
		
		 int ch=0;
		 while(ch!=3) {
			 System.out.println("1: Register");
			 System.out.println("2: login");
			 System.out.println("3: exit");
			 System.out.println("Enter you choice");
			 ch=sc.nextInt();
			 switch(ch) {
			 case 1:registration();
			 break;
			 case 2:
				 login();
				 break;
			 case 3:
				 System.out.println("existed successfully");
				 break;
			 
			 
			 
			 }
		 }
	}
	public static void registration() {
		System.out.println("1: for Employee Registration");
 		System.out.println("2: for Cusotomer Registration");
 		System.out.println("Enter your choice");
 		int ch=sc.nextInt();
 		if(ch==1) {
 			System.out.println("Employee Name");
 			String name=sc.next();
 			System.out.println("emailID: ");
 			String mailID=sc.next();
 			System.out.println("password: ");
 			String password=sc.next();
 			System.out.println("Employee Code: ");
 			String code=sc.next();
 			System.out.println("Employee contact number: ");
 			String number=sc.next();
 			Person person=new Employee(name,mailID,password,code,number);
 			personDao.getPersons().add(person);
 			System.out.println("rigistered successfully");
 			
 		}
 		else if(ch==2) {
 			System.out.println("customer Name");
 			String name=sc.next();
 			System.out.println("emailID: ");
 			String mailID=sc.next();
 			System.out.println("password: ");
 			String password=sc.next();
 			Person person=new Customer(name, mailID,password);
 			personDao.getPersons().add(person);
 			System.out.println("rigistered successfully");
 			
 		}else {
 			System.out.println("enter valid input");
 		}
 		
		
	}
	public static  void login() {
		System.out.println("Enter mailid");
		String mailID=sc.next();
		System.out.println("Enter password");
		String password=sc.next();
		Person person=personDao.findPeron(mailID, password);
		if(person==null) {
			System.out.println("mailid or password is not correct");
		}
		else if(person.getType().equalsIgnoreCase("employee")){
			System.out.println("wolcome: "+person.getName());
			EmployeePage.employeePage(personDao);
			
		}else {
			System.out.println("wolcome: "+person.getName());
			CustomerPage.customerPage(person, accountdao);
			
			
			
		}
	}

}
