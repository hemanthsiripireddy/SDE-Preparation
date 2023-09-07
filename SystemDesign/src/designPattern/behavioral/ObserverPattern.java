package designPattern.behavioral;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject=new MySubject();
		Observer ob1=new MyObserver(subject);
		Observer ob2=new MyObserver(subject);
		subject.register(ob1);
		subject.register(ob2);
		ob1.update();
		subject.postMessage("this is new message");
		

	}

}
interface Subject{
	public void register(Observer obj);
	public void unRegister(Observer obj);
	public void postMessage(String msg);
	public String getUpdate();
	public void notifyAllUsers();
}
class MySubject implements Subject{
	String msg;
	boolean hasUpdate;
	List<Observer>list;

	
	public MySubject() {
		list=new ArrayList<>();
		
	}
	@Override
	public void register(Observer obj) {
		// TODO Auto-generated method stub
		list.add(obj);
		
	}

	@Override
	public void unRegister(Observer obj) {
		// TODO Auto-generated method stub
		list.remove(obj);
		
	}

	@Override
	public void postMessage(String msg) {
		// TODO Auto-generated method stub
		this.msg=msg;
		hasUpdate=true;
		notifyAllUsers();
		hasUpdate=false;
		
		
		
	}

	@Override
	public String getUpdate() {
		// TODO Auto-generated method stub
		return msg;
	}
	@Override
	public void notifyAllUsers() {
		// TODO Auto-generated method stub
		if(hasUpdate) {
			for(Observer observer:list) {
				observer.update();
			}
		}else {
			System.out.println("there is no update");
		}
		
	}
	
}
interface Observer{
	public void setSubject(Subject subject);
	public void update();
	
}
class MyObserver implements Observer{
	Subject subject;

	public MyObserver(Subject subject) {
		this.subject=subject;
	}
	@Override
	public void setSubject(Subject subject) {
		// TODO Auto-generated method stub
		this.subject=subject;
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		String msg=subject.getUpdate();
		if(msg==null) {
			System.out.println("there is not update");
			
		}else {
			System.out.println(msg);
		}
		
	}
	
}
