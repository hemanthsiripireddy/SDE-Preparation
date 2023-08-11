package designPattern.structural;

import java.util.ArrayList;
import java.util.List;

public class CompositeDesignPattern {
	public static void run() {
		Component computer =createComputer();
		computer.showPrice();
	}

	private static Component createComputer() {
		// TODO Auto-generated method stub
		Composite computer=new Composite("computer");
		Composite peripheral=createPeripheral();
		Composite cabinet=createCabinet();
		computer.add(cabinet);
		computer.add(peripheral);
		return computer;
	}

	private static Composite createCabinet() {
		// TODO Auto-generated method stub
		Composite cabinet=new Composite("Cabinet");
		Component hdd=new Leaf("HDD",5000);
		Composite motherBoard=createMotherBoard();
		cabinet.add(hdd);
		cabinet.add(motherBoard);
		return cabinet;
	}

	private static Composite createMotherBoard() {
		// TODO Auto-generated method stub
		Composite motherBoard=new Composite("Mother Board");
		
		
		
		Component ram=new Leaf("ram",2000);
		Component cpu=new Leaf("CPU", 15000);
		motherBoard.add(ram);
		motherBoard.add(cpu);
		return motherBoard;
	}

	private static Composite createPeripheral() {
		// TODO Auto-generated method stub
		Composite pheripheral=new Composite("Pheripheral");
		Component monitor=new Leaf("monitor", 10000);
		Component mouse=new Leaf("mouse", 600);
		pheripheral.add(mouse);
		pheripheral.add(monitor);
		
		return pheripheral;
	}
	

}
interface Component{
	public void showPrice();
}
class Leaf implements Component{
	int price;
	String name;
	

	public Leaf( String name,int price) {
		super();
		this.price = price;
		this.name = name;
	}
	


	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(name+": "+price);
		
	}
	
}
class Composite implements Component{
	List<Component> components;
	String name;
	

	public Composite(String name) {
	
		this.name = name;
		components=new ArrayList<>();
	}
	public void add(Component c) {
		components.add(c);
	}


	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(name+": ");
		for(Component c: components) {
			c.showPrice();
		}
		
	}
	
}

