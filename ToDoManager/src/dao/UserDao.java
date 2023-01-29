package dao;

import pojos.User;

public interface UserDao {
	//User[] users;
	boolean register(User user);
	boolean login(String userName,String userPassword);
	boolean isFull();
	boolean isEmpty();
	boolean assignTask(String title,String name);
	boolean assignCompletionDate(String title);
	boolean markATaskCompleted(String title);
	User FindUser(String userName,String password);
	
	

}
