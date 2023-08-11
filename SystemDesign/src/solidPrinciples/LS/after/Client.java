package solidPrinciples.LS.after;

public class Client {
	public static void main(String[] args) {
		
		Duck d=new Duck();
		Penguin p=new Penguin();
		makeFlyingBirdFly(d);
		makeSwimmingBurdswmim(p);
		
	}
	
	private static void makeSwimmingBurdswmim(SwimmingBird p) {
		// TODO Auto-generated method stub
		p.swim();
		
	}

	private static void makeFlyingBirdFly(FlyingBird d) {
		// TODO Auto-generated method stub
		d.fly();
		
	}

	

}
