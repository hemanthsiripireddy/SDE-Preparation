package dao;

import pojos.User;

public class UserDaoImp implements UserDao{
	private User[] users;
	private int  count;
	

	public UserDaoImp() {
		users=new User[10];
		this.count=0;
	}
	

	public User[] getUsers() {
		return users;
	}


	public void setUsers(User[] users) {
		this.users = users;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		if(count<users.length) {
			users[count++]=user;
			return true;
		}
		return false;
	}

	@Override
	public boolean login(String userName, String userPassword) {
		// TODO Auto-generated method stub
		for(int i=0;i<users.length;i++) {
			if(users[i].getEmail().equalsIgnoreCase(userName)&&users[i].getPassword().equalsIgnoreCase(userPassword)) {
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(count==users.length)
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
	public boolean assignTask(String title, String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean assignCompletionDate(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean markATaskCompleted(String title) {
		// TODO Auto-generated method stub
		return false;
	}





	@Override
	public User FindUser(String userName, String password) {
		// TODO Auto-generated method stub
		for(int i=0;i<count;i++) {
			if(users[i]!=null&users[i].getEmail().equalsIgnoreCase(userName)&&users[i].getPassword().equalsIgnoreCase(password)) {
				return users[i];
			}
		}
		return null;
	}

}
