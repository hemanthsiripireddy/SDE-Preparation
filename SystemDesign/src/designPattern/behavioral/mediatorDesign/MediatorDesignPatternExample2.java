package designPattern.behavioral.mediatorDesign;

import java.util.ArrayList;
import java.util.List;

public class MediatorDesignPatternExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mediator med=new MediatorImpl();
		User hemanth =new UserImpl("Hemanth",med);
		User ramesh=new UserImpl("Ramesh",med);
		User suresh=new UserImpl("Suresh",med);
		med.addUser(suresh);
		med.addUser(hemanth);
		med.addUser(ramesh);
		 hemanth.sendMessage("Hi All");

	}

}
abstract class Mediator{
	List<User> users;

	public Mediator() {
		super();
		this.users = new ArrayList<>();
	}
	 
	public abstract void addUser(User user);
	public abstract void sendMessage(User user, String mg);
	
}
class MediatorImpl extends Mediator{

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		super.users.add(user);
		
	}
	

	


	@Override
	public void sendMessage(User user, String mg) {
		// TODO Auto-generated method stub
		for(User u:users) {
			if(u!=user) {
				u.receiveMessage(user, mg);
			}
			
		}
		
	}
	
}

interface User{
	public void sendMessage(String msg);
	public void receiveMessage(User user, String msg);
}
class UserImpl implements User{
	String name;
	Mediator med;
	

	@Override
	public String toString() {
		return name;
	}

	public UserImpl(String name, Mediator med) {
		super();
		this.name = name;
		this.med = med;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserImpl(String name) {
		super();
		this.name = name;
	}

	@Override
	public void sendMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println(this+ " sent msg to all: "+msg);
		med.sendMessage(this, msg);
		
	}

	@Override
	public void receiveMessage(User user, String msg) {
		// TODO Auto-generated method stub
		System.out.println(this+" received from ["+user+"] :"+msg);
		
	}
	
}
