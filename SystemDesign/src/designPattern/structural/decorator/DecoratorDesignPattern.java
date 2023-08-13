package designPattern.structural.decorator;

public class DecoratorDesignPattern {
	public static void main(String[] args) {
		Computer computer =new GamingComputer(new BasicComputer());
		computer.assembleComputer();
		System.out.println("--------------------");
		Computer computer2=new HighPerformanceComputer(new GamingComputer(new BasicComputer()));
		computer2.assembleComputer();
		
	}

}
interface Computer{
	public void assembleComputer();
}
class BasicComputer implements Computer {

	@Override
	public void assembleComputer() {
		// TODO Auto-generated method stub
		System.out.println("basic computer is constructed");
		
	}
	
}
class CompterDecorator implements Computer{
	protected Computer computer;
	public CompterDecorator(Computer computer) {
		this.computer=computer;
				
	}

	@Override
	public void assembleComputer() {
		// TODO Auto-generated method stub
		this.computer.assembleComputer();
		
	}
	
}
class GamingComputer extends CompterDecorator{

	public GamingComputer(Computer computer) {
		super(computer);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void assembleComputer() {
		super.assembleComputer();
		System.out.println("added features of Gaming");
		
	}
	
}
class HighPerformanceComputer extends CompterDecorator{

	public HighPerformanceComputer(Computer computer) {
		super(computer);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void assembleComputer() {
		super.assembleComputer();
		System.out.println("added features of High Performance");
		
	}
	
}
