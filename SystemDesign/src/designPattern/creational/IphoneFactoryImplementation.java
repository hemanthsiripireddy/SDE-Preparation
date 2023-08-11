package designPattern.creational;

public class IphoneFactoryImplementation {
	public static void main(String[] args) {
		Iphone iphone =IphoneFactory.getIphone(IphoneType.ELEVEN);
		String str=iphone.toString();
		System.out.println(str);
	}

}
interface Iphone{
	public String getRam();
	public String getMemory();
	public String getScreenSize();
}
class Iphone11 implements Iphone{
	private String ram;
	private String memory;
	private String screenSize;

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getMemory() {
		// TODO Auto-generated method stub
		return this.memory;
	}

	@Override
	public String getScreenSize() {
		// TODO Auto-generated method stub
		return this.screenSize;
	}

	public Iphone11(String ram, String memory, String screenSize) {
		super();
		this.ram = ram;
		this.memory = memory;
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "Iphone11 [ram=" + ram + ", memory=" + memory + ", screenSize=" + screenSize + "]";
	}
	
	
}
class Iphone12 implements Iphone{
	private String ram;
	private String memory;
	private String screenSize;

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getMemory() {
		// TODO Auto-generated method stub
		return this.memory;
	}

	@Override
	public String getScreenSize() {
		// TODO Auto-generated method stub
		return this.screenSize;
	}

	public Iphone12(String ram, String memory, String screenSize) {
		super();
		this.ram = ram;
		this.memory = memory;
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "Iphone12 [ram=" + ram + ", memory=" + memory + ", screenSize=" + screenSize + "]";
	}
	
}
enum IphoneType{
	ELEVEN,
	TWELVE
	
}
class IphoneFactory{
	public static Iphone getIphone(IphoneType type) {
		if(type.equals(IphoneType.ELEVEN)) {
			return new Iphone11("12GB","234GB","5.5");
		}
		else if(type.equals(IphoneType.TWELVE)) {
			return new Iphone11("16GB","500GB","6");
			
		}else
			return null;
		
	}
}