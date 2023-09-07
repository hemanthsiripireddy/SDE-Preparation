package designPattern;

import java.io.Serial;

public class DependencyInjectionDesignPattern {

	public static void main(String[] args) {
		Injector injector;
		Consumer app;
		injector=new EmailServiceInjector();
		app=injector.getConsumer();
		app.processMessage("Hy How are You", "Hemanth");
		

	}

}
//class EmailService{
//	public void sendEmail(String msg,String receipient) {
//		System.out.println(msg+" is sent to "+receipient);
//	}
//}
//class MyApplication{
//	EmailService service=new EmailService();
//	public void processMail(String msg,String receipient) {
//		service.sendEmail(msg, receipient);
//	}
//}

interface Service{
	public void sendMessage(String msg,String receiver);
}
class EmailService implements Service{

	@Override
	public void sendMessage(String msg, String receiver) {
		// TODO Auto-generated method stub
		System.out.println("Email having message "+msg+" is sent to "+receiver);
		
	}
	
}
class SMSSerivce implements Service{

	@Override
	public void sendMessage(String msg, String receiver) {
		// TODO Auto-generated method stub
		System.out.println("SMS having message "+msg+" is sent to "+receiver);
		
	}
	
}
interface Consumer{
	public void processMessage(String msg,String receiver);
}
class MyDIApplication implements Consumer{
	Service service;
	
	public MyDIApplication(Service service) {
		this.service=service;
	}

	@Override
	public void processMessage(String msg, String receiver) {
		// TODO Auto-generated method stub
		this.service.sendMessage(msg, receiver);
		
	}
	
}
interface Injector{
	public Consumer getConsumer();
}
class EmailServiceInjector implements Injector{

	@Override
	public Consumer getConsumer() {
		// TODO Auto-generated method stub
		return new MyDIApplication(new EmailService());
	}
	
}
class SMSServiceInjector implements Injector{

	@Override
	public Consumer getConsumer() {
		// TODO Auto-generated method stub
		return new MyDIApplication(new SMSSerivce());
	}
	
}
