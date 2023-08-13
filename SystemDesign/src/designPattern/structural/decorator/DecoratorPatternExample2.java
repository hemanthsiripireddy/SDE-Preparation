package designPattern.structural.decorator;

public class DecoratorPatternExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle =new  Circle();
		Shape redCircle=new RedCircle(circle);
		
		System.out.println("shape without border");
		circle.draw();
		System.out.println("shape with coloring border");
		redCircle.draw();

	}

}
interface Shape{
	public void draw();
}

abstract class Decorator implements Shape{
	public Shape shape;
	public Decorator(Shape shape) {
		this.shape=shape;
	}
	
}
class RedCircle extends Decorator{

	public RedCircle(designPattern.structural.decorator.Shape shape) {
		super(shape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		super.shape.draw();
		drawRedBorder();
	}
	private void drawRedBorder() {
		System.out.println("Drawing red border");
	}
	
}
class Circle implements Shape
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Shape: Circle");
		
	}
	
}
class Rectangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Shape: Rectangle");
		
	}
	
}