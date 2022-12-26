
public class Triangle implements IShape{
	private double baseSide;
	private double side2;
	private double side3;
	private double height;
	private String type="Traingle";
	private String colour;
	private Renderer renderer;
	
	
	

	public Triangle(double baseSide, double side2, double side3, double height, String colour) {
		super();
		this.baseSide = baseSide;
		this.side2 = side2;
		this.side3 = side3;
		this.height = height;
		this.colour = colour;
	}
	
	

	public double getBaseSide() {
		return baseSide;
	}


	public void setBaseSide(double baseSide) {
		this.baseSide = baseSide;
	}


	public double getSide2() {
		return side2;
	}


	public void setSide2(double side2) {
		this.side2 = side2;
	}


	public double getSide3() {
		return side3;
	}


	public void setSide3(double side3) {
		this.side3 = side3;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
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
		return 0.5*baseSide*height;
	}

	@Override
	public double calcPerimeter() {
		// TODO Auto-generated method stub
		return  baseSide+side2+side3;
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		renderer=new Renderer(this, type);
		
		
	}

}
