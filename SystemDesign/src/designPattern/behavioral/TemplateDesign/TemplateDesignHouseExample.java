package designPattern.behavioral.TemplateDesign;

public class TemplateDesignHouseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wooden house");
		House wodenHouse=new WodenHouse();
		wodenHouse.buildHouse();
		
		System.out.println("\n\nGlass House ");
		House glassHouse=new GlassHouse();
		glassHouse.buildHouse();

	}

}

abstract class House{
	public final void buildHouse() {
		
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is Built");
	}
	public void buildFoundation() {
		System.out.println("Building foundation");
	}
	public void buildWindows() {
		System.out.println("Building Windows");
	}
	public abstract void buildPillars();
	public abstract void buildWalls();
}
class WodenHouse extends House {

	@Override
	public void buildPillars() {
		// TODO Auto-generated method stub
		System.out.println("building wooden coated pillars");
		
	}

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		System.out.println("building wooden walls");
		
	}
	
}
class GlassHouse extends House {

	@Override
	public void buildPillars() {
		// TODO Auto-generated method stub
		System.out.println("building Glass coated pillars");
		
	}

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		System.out.println("building Glass walls");
		
	}
	
}
