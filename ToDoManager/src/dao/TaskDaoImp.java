package dao;

import pojos.Task;

public class TaskDaoImp implements TaskDao{
	private int count=0;
	Task tasks[];
	

	public TaskDaoImp() {
		
		this.count = 0;
		this.tasks = new Task[104];
	}

	@Override
	public boolean addTask(Task task) {
		// TODO Auto-generated method stub
		if(count<tasks.length) {
			tasks[count++]=task;
			return true;
		}
		return false;
	}

	@Override
	public boolean removeTask(String title) {
		// TODO Auto-generated method stub
		for(int i=0;i<tasks.length;i++) {
			if(tasks[i]!=null&&tasks[i].getTitle().equalsIgnoreCase(title)) {
				tasks[i]=null;
				return true;
				
			}
		}
		return false;
	}

	@Override
	public boolean updateTask(Task task) {
		// TODO Auto-generated method stub
		for(int i=0;i<tasks.length;i++) {
			if(tasks[i]!=null&&tasks[i].getTaskID()==task.getTaskID()) {
				tasks[i]=task;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(count==tasks.length)
			return true;
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(count==0)
			return true;
		return false;
	}

	@Override
	public boolean assignTask(String titile, String name) {
		// TODO Auto-generated method stub
		for(int i=0;i<tasks.length;i++) {
			if(tasks[i]!=null&&tasks[i].getTitle().equalsIgnoreCase(titile)) {
				tasks[i].setAssignedTo(name);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean assignCompletoinDate(String title, String date) {
		// TODO Auto-generated method stub
		for(int i=0;i<tasks.length;i++) {
			if(tasks[i]!=null&&tasks[i].getTitle().equalsIgnoreCase(title)) {
				tasks[i].setCompletionDate(date);;
				return true;
			}
		}
		return false;
	}

	@Override
	public void showAllTasks(String name) {
		// TODO Auto-generated method stub
		int flag=0;
		for(int i=0;i<tasks.length;i++) {
			
			if(tasks[i]!=null&&tasks[i].getAssignedTo().equalsIgnoreCase(name)) {
				System.out.println(tasks[i].toString());
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("nothing to show");
		}
		
	}

	@Override
	public boolean markAsCompleted(String title, String name) {
		// TODO Auto-generated method stub
		//int flag=0;
		for(int i=0;i<tasks.length;i++) {
			if(tasks[i]!=null&&tasks[i].getTitle().equalsIgnoreCase(title)&&tasks[i].getAssignedTo().equalsIgnoreCase(name)){
				tasks[i].setCompleted(true);
				
				return true;
				
			}
				
		}
		return false;
	}

	@Override
	public void showPendinTasks(String name) {
		// TODO Auto-generated method stub
		int flag=0;
		for(int i=0;i<tasks.length;i++) {
			if(tasks[i]!=null&&tasks[i].getAssignedTo().equalsIgnoreCase(name)&&tasks[i].isCompleted()==false){
				System.out.println(tasks[i].toString());
				flag=1;
				
				
			}
				
		}
		if(flag==0) {
			System.out.println("nothing to display");
		}
		
		
	}

	@Override
	public void ShowCompletedTasks(String name) {
		// TODO Auto-generated method stub
		int flag=0;
		for(int i=0;i<tasks.length;i++) {
			if(tasks[i]!=null&&tasks[i].getAssignedTo().equalsIgnoreCase(name)&&tasks[i].isCompleted()==true){
				System.out.println(tasks[i].toString());
				flag=1;
				
				
			}
				
		}
		if(flag==0) {
			System.out.println("nothing to display");
		}
		
	}

	@Override
	public void showAllTasks() {
		// TODO Auto-generated method stub
		for(int i=0;i<tasks.length;i++) {
			if(tasks[i]!=null) {
				System.out.println(tasks[i].toString());
			}
		}
		
	}

}
