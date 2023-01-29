package ui;

import java.util.Scanner;

import dao.TaskDaoImp;
import dao.UserDaoImp;
import pojos.User;

public class VisitorPage {
	UserDaoImp udi;
	TaskDaoImp tdi;
	User user;

	public VisitorPage(UserDaoImp udi, TaskDaoImp tdi) {
		super();
		this.udi = udi;
		this.tdi = tdi;
	}
	

	public VisitorPage(UserDaoImp udi, TaskDaoImp tdi, User user) {
		super();
		this.udi = udi;
		this.tdi = tdi;
		this.user = user;
	}


	public void visitor() {
		Scanner sc=new Scanner(System.in);
		int ch=0;
		while(ch!=5) {
			System.out.println("1: view all tasks");
			System.out.println("2: complete a task");
			System.out.println("3: view completed tasks");
			System.out.println("4: view pending tasks");
			System.out.println("5: log out");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				tdi.showAllTasks(user.getName());
				break;
			case 2:
				System.out.println("Enter task title");
				String title=sc.next();
				if(tdi.markAsCompleted(title, user.getName())) {
					System.out.println("task marked as completed successfully");
					
				}
				else {
					System.out.println("title or username is not valid");
				}
				break;
			case 3:
				tdi.ShowCompletedTasks(user.getName());
				break;
			
			case 4:
				tdi.showPendinTasks(user.getName());
				break;
			case 5:
				System.out.println("Logged out sucessfully");
				break;
				
		}
	}

}
}
