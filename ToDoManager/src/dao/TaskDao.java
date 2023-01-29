package dao;

import pojos.Task;

public  interface TaskDao {
	//Task[] tasks;
	boolean addTask(Task task);
	boolean removeTask(String title);
	boolean updateTask(Task task);
	boolean isFull();
	boolean isEmpty();
	boolean assignTask(String titile,String name);
	boolean assignCompletoinDate(String title,String date);
	void showAllTasks(String name);
	boolean markAsCompleted(String title, String name);
	void showPendinTasks(String name);
	void ShowCompletedTasks(String name);
	void showAllTasks();
	

}
