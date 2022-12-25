package ui;

import java.util.List;
import java.util.Scanner;

import dao.PersonDao;
import pojos.Person;

public class EmployeePage {
	public static void employeePage(PersonDao personDao) {
		Scanner sc=new Scanner(System.in);
		int ch=0;
		while(ch!=2) {
			System.out.println("1: show all employees details: ");
			System.out.println("2: logout: ");
			System.out.println("enter your choice");
			ch=sc.nextInt();
			if(ch==1) {
				List<Person>persons=personDao.getPersons();
				for(int i=0;i<persons.size();i++) {
					if(persons.get(i).getType().equalsIgnoreCase("employee"))
					System.out.println(persons.get(i).toString());
				}
				
			}else {
				System.out.println("logged out sucessfully");
			}
			
		}
	}

}
