
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle=new Rectangle(11, 022, "black");
		System.out.println(rectangle.calcArea());
		System.out.println(rectangle.calcPerimeter());
		//System.out.println(rectangle.drawShape());
		rectangle.drawShape();
		Square square=new Square(23,"black");
		System.out.println(square.calcArea());
		System.out.println(square.calcPerimeter());
		square.drawShape();

	}

}
