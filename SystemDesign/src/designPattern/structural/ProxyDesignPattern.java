package designPattern.structural;

public class ProxyDesignPattern {
	public static void main(String[] args) throws Exception {
		CommandExecutor ce=new CommandExecutorProxy("heemanth","123");
		ce.runCommand("cr-lr");
	}

}
interface CommandExecutor{
	public void runCommand(String str) throws Exception;
}
class CommandExecutorImpl implements CommandExecutor{

	@Override
	public void runCommand(String str) {
		// TODO Auto-generated method stub
		System.out.println(str+" is executed successfully");
		
	}
	
}
class CommandExecutorProxy implements CommandExecutor{
	boolean isAdmin;
	CommandExecutor ce;
	public CommandExecutorProxy(String user,String pwd) {
		if(user.equals("hemanth")&&pwd.equals("123"))isAdmin=true;
		ce=new CommandExecutorImpl();
		
		
	}

	@Override
	public void runCommand(String str) throws Exception {
		// TODO Auto-generated method stub
		if(isAdmin) {
			ce.runCommand(str);
		}else if(str.trim().startsWith("rm")) {
			throw new Exception("this command can't be execute");
		}else {
			ce.runCommand(str);
		}
		
	}
	
}
