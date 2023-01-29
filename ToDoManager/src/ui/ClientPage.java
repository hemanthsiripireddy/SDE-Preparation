package ui;

import java.util.Scanner;

import dao.TaskDaoImp;
import dao.UserDaoImp;
import pojos.Task;
import pojos.User;

public class ClientPage {
	TaskDaoImp tdi;
	UserDaoImp udi;
	User user;

	public ClientPage(TaskDaoImp tdi, UserDaoImp udi) {
		super();
		this.tdi = tdi;
		this.udi = udi;
	}
	
	public ClientPage(TaskDaoImp tdi, UserDaoImp udi, User user) {
		super();
		this.tdi = tdi;
		this.udi = udi;
		this.user = user;
	}

	public ClientPage(TaskDaoImp tdi) {
		super();
		this.tdi = tdi;
	}
	public void client() {
		Scanner sc=new Scanner(System.in);
		int ch=0;
		while(ch!=10) {
			System.out.println("1: Add a Task");
			System.out.println("2: delete a Task");
			System.out.println("3: update a Task");
			System.out.println("4: Assign a Task to visitor");
			System.out.println("5: assign a completion data to task");
			System.out.println("6: show all tasks");
			System.out.println("10: logout");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				if(tdi.isFull()) {
					System.out.println("Array over flowm");
				}else {
					System.out.println("Enter task ID: ");
					String taskID=sc.next();
					System.out.println("Enter task title");
					String title=sc.next();
					System.out.println("Enter task description");
					String description=sc.next();
					Task task=new Task(taskID,title,description);
					tdi.addTask(task);
					System.out.println("task added successfully");
				}
				break;
			case 2:
				if(tdi.isEmpty()) {
					System.out.println("Array under flown");
					
				}
				else {
					System.out.println("Enter task title to be deleted: ");
					String title =sc.next();
					if(tdi.removeTask(title)) {
						System.out.println(" task deleted sucessfully");
					}else {
						System.out.println("task selected is not present");
					}
				}
				break;
			case 3:
				System.out.println("Enter taskID");
				String taskID=sc.next();
				System.out.println("Enter task Title");
				String title=sc.next();
				System.out.println("Enter task decrption");
				String description=sc.next();
				Task task=new Task(taskID,title,description);
				if(tdi.updateTask(task)) {
					System.out.println("taks updated successfully");
				}else {
					System.out.println("selected task is not valid");
				}
				break;
			case 4:
				System.out.println("Enter task Title");
				 title=sc.next();
				 System.out.println("Enter user Name");
				 String name=sc.next();
				 if(tdi.assignTask(title, name)) {
					 System.out.println("task assigned to user sucessfully");
				 }else {
					 System.out.println(" user or task not found");
				 }
				 break;
			case 5: System.out.println("Enter task title: ");
					 title=sc.next();
					 System.out.println("Enter completion data: ");
					 String date=sc.next();
					 if(tdi.assignCompletoinDate(title, date)) {
						 System.out.println("date added successfully");
					 }else {
						 System.out.println("task is not valid");
					 }
					 break;
			case 6:
				tdi.showAllTasks();
				break;
				
			case 10:
				System.out.println("logged out successfully ");
					
				
			}
			
		}
	}

}
