package ui;

import java.util.Scanner;

import dao.TaskDaoImp;
import dao.UserDaoImp;
import pojos.Client;
import pojos.User;
import pojos.Visitor;

public class HomeScreen {
	 public static void main(String[] args) {
		 UserDaoImp udi=new UserDaoImp();
		 TaskDaoImp tdi=new TaskDaoImp();
		 Scanner sc=new Scanner(System.in);
		 
		 int ch=0;
		 User user=null;
		 User[]users =udi.getUsers();
		while(ch!=3) {
			System.out.println("1: Register");
			 System.out.println("2: login");
			 System.out.println("3: exit");
			 System.out.println("Enter you choice");
			  ch=sc.nextInt();
			 switch(ch) {
			 case 1: 
				 if(udi.isFull()) {
					 System.out.println("Array Over flow");
				 }else
				 {
					 System.out.println("please enter you name: ");
					 String name=sc.next();
					 System.out.println("Please enter username");
					 String userName=sc.next();
					 System.out.println("Please enter password");
					 String password=sc.next();
					 System.out.println("Select Visitor/client");
					 String type=sc.next();
					 if(type.equalsIgnoreCase("visitor")) {
						 user=new Visitor(name,userName,password);
						 
					 } else if(type.equalsIgnoreCase("Client")) {
						 user= new Client(name,userName,password);
					 }
					 udi.register(user);
					 System.out.println("Registered Successfully");
					 
					
				 }
				 break;
			 case 2:
				 if(udi.isEmpty()) {
					 System.out.println("array under flow");
				 }
				 else {
					 System.out.println("Enter user name");
					 String userName=sc.next();
					 System.out.println("Enter password");
					 String password=sc.next();
					  user =udi.FindUser(userName, password);
					  if(user==null) {
						  System.out.println("user name or password is not valid");
					  }else {
						  if(user.getType().equalsIgnoreCase("Client")) {
							  System.out.println("logged in success fully");
							  System.out.println("Welcome "+user.getName());
							  ClientPage cp=new ClientPage(tdi,udi,user);
							  cp.client();
							  
							  
						  }else {
							  System.out.println("logged in success fully");
							  System.out.println("Welcome "+user.getName());
							  VisitorPage cp=new VisitorPage(udi,tdi,user);
							  cp.visitor();
							  
						  }
					  }
				 }
				 break;
			 case 3:
				 System.out.println("Existed sucessfully");
				 break;
			 }
			
		}
		 
	 }

}
