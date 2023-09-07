package designPattern.behavioral;

public class CommandDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileSystemReceiver fsr = FileSystemReceiverUtility.getUnderlyingFileSystemReceiver();
		Command c = new OpenCommand(fsr);
		Command wc = new WritingCommand(fsr);
		Command cc = new CloseCommand(fsr);
		Invoker i = new Invoker(c);
		Invoker i2 = new Invoker(wc);
		Invoker i3 = new Invoker(cc);
		i.execute();
		i2.execute();
		i3.execute();

	}

}

interface FileSystemReceiver {
	void openFile();

	void writeFile();

	void closeFile();
}

class WindowsFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		// TODO Auto-generated method stub
		System.out.println("Opening File in Windows");

	}

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub
		System.out.println("Writing File in Windows");

	}

	@Override
	public void closeFile() {
		// TODO Auto-generated method stub
		System.out.println("Closing File in Windows");

	}

}

class LinuxFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		// TODO Auto-generated method stub
		System.out.println("Opening File in Linux");

	}

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub
		System.out.println("Writing File in Linux");

	}

	@Override
	public void closeFile() {
		// TODO Auto-generated method stub
		System.out.println("Closing File in Linux");

	}

}

interface Command {
	void execute();

}

class OpenCommand implements Command {
	FileSystemReceiver fsr;

	public OpenCommand(FileSystemReceiver fsr) {
		this.fsr = fsr;

	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fsr.openFile();

	}

}

class CloseCommand implements Command {
	FileSystemReceiver fsr;

	public CloseCommand(FileSystemReceiver fsr) {
		this.fsr = fsr;

	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fsr.closeFile();

	}

}

class WritingCommand implements Command {
	FileSystemReceiver fsr;

	public WritingCommand(FileSystemReceiver fsr) {
		this.fsr = fsr;

	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fsr.writeFile();

	}

}

class Invoker {
	Command c;

	public Invoker(Command c) {
		this.c = c;

	}

	public void execute() {
		c.execute();
	}
}
class FileSystemReceiverUtility{
	public static FileSystemReceiver getUnderlyingFileSystemReceiver() {
		String osName=System.getProperty("os.name");
		System.out.println("Underlying OS is"+osName);
		if(osName.contains("Windows")) {
			return new WindowsFileSystemReceiver();
		}
		return new  LinuxFileSystemReceiver();
	}
}
