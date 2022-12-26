
public class Circle implements IShape{
	private double radius;
	private String colour;
	private final String type="Circle";
	private Renderer renderer;
	

	public Circle(double radius, String colour) {
		super();
		this.radius = radius;
		this.colour = colour;
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

	@Override
	public double calcPerimeter() {
		// TODO Auto-generated method stub
		return 2*3.14*radius;
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		//new Renderer(, type)
		renderer=new Renderer(this, type);
				
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

}
