package designPattern.behavioral;

import java.util.Date;

public class MediatorDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User hemanth =new User("Hemanth");
		hemanth.sendMessage("Hi I Love you");

	}

}
class ChatRoom{
	public static void sendMessage(User user, String msg) {
		System.out.println(new Date().toString()+" ["+user.getName()+"] "+msg);
	}
}
class User{
	private String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void sendMessage(String msg) {
		ChatRoom.sendMessage(this, msg);
	}
	
}