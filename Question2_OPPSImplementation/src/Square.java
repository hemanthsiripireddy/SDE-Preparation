
public class Square extends Rectangle {
	private final String type="Square";

	public Square(double length, String colour) {
		super(length, length, colour);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calcArea() {
		return this.getLength()*this.getWidth();
	}
	public String getType() {
		return type;
	}

}
