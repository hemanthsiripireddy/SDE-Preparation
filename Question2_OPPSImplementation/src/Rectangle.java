
public class Rectangle implements IShape {
	private double length;
	private double width;
	private String colour;
	private final String type ="Recatagle";
	private Renderer renderer;
	

	public Rectangle(double length, double width, String colour) {
		super();
		this.length = length;
		this.width = width;
		this.colour = colour;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return this.length*this.width;
	}

	@Override
	public double calcPerimeter() {
		// TODO Auto-generated method stub
		return 2*this.length+2*this.width;
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		renderer=new Renderer(this, type);
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

}
