package designPattern.structural.fascadeDesign;


public class FascadeDesingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FascadeMaker fm=new FascadeMaker();
		fm.drawCircle();
		fm.drawRectangle();
		fm.drawSquare();
		

	}

}
interface Shape{
	public void draw();
}
class Rectangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw::Rectangle");
		
	}
	
}
class Square implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw::Rectangle");
		
	}
	
}
class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw::Circle");
		
	}
	
}
class FascadeMaker{
	private Shape rectangle;
	private Shape square;
	private Shape circle;
	public FascadeMaker() {
		rectangle=new Rectangle();
		square=new Rectangle();
		circle=new Circle();
	}
	public void drawCircle() {
		circle.draw();
	}
	public void drawRectangle() {
		rectangle.draw();
	}
	public void drawSquare() {
		
		square.draw();
	}
	
}
