package solidPrinciples.LS.before;

public class Square extends Rectangle 
{

	public Square(int size) {
		super(size, size);
		// TODO Auto-generated constructor stub
	}
	public void setHeight(int height) {
		this.height=height;
		this.width=height;
	}
	public void setWidth(int width) {
		this.height=width;
		this.width=width;
	}

}
