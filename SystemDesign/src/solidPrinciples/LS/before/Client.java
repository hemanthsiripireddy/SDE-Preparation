package solidPrinciples.LS.before;

public class Client {
	public static void main(String[] args) {
		Rectangle rec=new Rectangle(11, 5);
		Square s=new Square(6);
		incrementRectangelWidth(rec);
		incrementRectangelWidth(s);
		System.out.println(rec.getArea());
		System.out.println(s.getArea());
		Duck d=new Duck();
		Penguin p=new Penguin();
		makeBirdFly(p);
		makeBirdFly(d);
		
	}
	public static void incrementRectangelWidth(Rectangle r) {
		r.setWidth(r.getWidth()+1);
		
	}
	public static void makeBirdFly(Bird b) {
		b.fly();
	}

}
