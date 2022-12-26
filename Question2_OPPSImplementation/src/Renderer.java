
public class Renderer {
	IShape shape;
	String type;
	
	public Renderer(IShape shape,String type) {
		super();
		this.shape = shape;
		this.drawShape(shape);
		this.type=type;
	}

	public void drawShape(IShape shape) {
		System.out.println(shape.getType()+" is drawn");
	}
	

}
