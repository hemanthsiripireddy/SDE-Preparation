package designPattern.behavioral.chainOfResponsibility;

public class ChainOfReponsibilityDesignPattern {
	public static AbstractLogger getLogger() {
		AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.INFO);
		AbstractLogger fileLogger =new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger errorLooger=new ErrorLogger(AbstractLogger.ERROR);
		errorLooger.setLogger(fileLogger);
		fileLogger.setLogger(consoleLogger);
		return errorLooger;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractLogger logger=ChainOfReponsibilityDesignPattern.getLogger();
		
		System.out.println("Info ");
		logger.logMessage(1, "this is Info");
		System.out.println();
		System.out.println("error");
		logger.logMessage(3, "this is error ");

	}

}
 abstract class AbstractLogger{
	 public static int INFO=1;
	 public static int DEBUG=2;
	 public static int ERROR=3;
	 public int level;
	 public AbstractLogger(int level) {
		 this.level=level;
	 }
	 public AbstractLogger logger;
	 public void setLogger(AbstractLogger logger) {
		this.logger=logger;
	 }
	 public void logMessage(int level,String str) {
		 if(this.level<=level) {
			 write(str);
		 }
		 if(logger!=null) {
			 logger.logMessage(level, str);
		 }
	 }
	 public abstract void write(String msg);
 }
 class ConsoleLogger extends AbstractLogger{

	public ConsoleLogger(int level) {
		super(level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void write(String msg) {
		
		// TODO Auto-generated method stubs
		System.out.println("Consoler logger:: "+msg);
		
		
	}
	 
 }
 class FileLogger extends AbstractLogger{

		public FileLogger(int level) {
			super(level);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void write(String msg) {
			
			// TODO Auto-generated method stubs
			System.out.println("File logger:: "+msg);
			
			
		}
		 
	 }
 class ErrorLogger extends AbstractLogger{

		public ErrorLogger(int level) {
			super(level);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void write(String msg) {
			
			// TODO Auto-generated method stubs
			System.out.println("ErrorLogger logger:: "+msg);
			
			
		}
		 
	 }
