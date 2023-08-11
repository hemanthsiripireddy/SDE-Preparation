package designPattern.creational;

public class AdapterFactoryDesignPattern {
	public static void run() {
		Computer pc=ComputerFactory.getInstance(new PCFactory("4GB", "500GB", "Intet"));
		System.out.println(pc.toString());
		Computer s=ComputerFactory.getInstance(new ServerFactory("14GB", "5000GB", "Intet"));
		System.out.println(s.toString());
		
	}

}
class ComputerFactory{
	
	
	
	public ComputerFactory() {
		super();
		
	}


	public static Computer getInstance( ComputerAbstractFactory caf) {
		return caf.makeComputer();
	}
}
interface Computer{
	
}
class PC implements Computer{
	String ram;
	String hdd;
	String cpu;
	public PC(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	@Override
	public String toString() {
		return "PC [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}
	
}

class Server implements Computer{
	String ram;
	String hdd;
	String cpu;
	public Server(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	@Override
	public String toString() {
		return "Server [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}
}
	
	interface ComputerAbstractFactory{

		
		
		public Computer makeComputer();
	}
	 class PCFactory implements ComputerAbstractFactory{

		String ram;
		String hdd;
		String cpu;
		
		public PCFactory(String ram, String hdd, String cpu) {
			super();
			this.ram = ram;
			this.hdd = hdd;
			this.cpu = cpu;
		}

		@Override
		public Computer makeComputer() {
			// TODO Auto-generated method stub
			return new PC(ram,hdd,cpu);
		}
		
	}
	 class ServerFactory implements ComputerAbstractFactory{

		String ram;
		String hdd;
		String cpu;
		
		public ServerFactory(String ram, String hdd, String cpu) {
			super();
			this.ram = ram;
			this.hdd = hdd;
			this.cpu = cpu;
		}

		@Override
		public Computer makeComputer() {
			// TODO Auto-generated method stub
			return new Server(ram,hdd,cpu);
		}
		
	}
	

