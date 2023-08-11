package designPattern.structural.adaptor;

public class AdaptorDesignerPatterExample2 {
	public static void run() {
		//testSocketClassAdaptor();
		testSocketObjectAdaptor();
	}

	private static void testSocketClassAdaptor() {
		// TODO Auto-generated method stub
		SocketAdaptor sa=new SocketClassAdaptor();
		Volt v120=getVolt(sa, 120);
		Volt v12=getVolt(sa, 12);
		Volt v3=getVolt(sa, 3);
		System.out.println("120 output: "+v120);
		System.out.println("120V to 12V adapter: "+v12);
		System.out.println("120V to 3V adapter: "+v3);
		
		
	}
	private static void testSocketObjectAdaptor() {
		SocketAdaptor sa=new SocketObjectAdaptorImpl();
		Volt v120=getVolt(sa, 120);
		Volt v12=getVolt(sa, 12);
		Volt v3=getVolt(sa, 3);
		System.out.println("120 output: "+v120);
		System.out.println("120V to 12V adapter: "+v12);
		System.out.println("120V to 3V adapter: "+v3);
		
	}
	private static Volt getVolt(SocketAdaptor sa,int i) {
		if(i==120)
			return sa.get120Volt();
		else if(i==12)
			return sa.get12Volt();
		else if(i==3)
			return sa.get3Volt();
		return null;
	}

}
class Socket{
	public Volt getVolt() {
		return new Volt(120);
	}
	
}
interface SocketAdaptor{
	public Volt get120Volt();
	public Volt get12Volt();
	public Volt get3Volt();
}

class SocketClassAdaptor extends Socket implements SocketAdaptor{

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		Volt v= getVolt();
		
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
        Volt v= getVolt();
		
		return convertVolt(v, 40);
	}
	private Volt convertVolt(Volt v,int i) {
		return new Volt(v.getVolts()/i);
	}
	
}
class SocketObjectAdaptorImpl implements SocketAdaptor{
	Socket socket=new Socket();

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		Volt v=socket.getVolt();
		return convertVolt(v, 12);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Volt v=socket.getVolt();
		return convertVolt(v, 40);
	}
	private Volt convertVolt(Volt v,int i) {
		return new Volt(v.getVolts()/i);
	}
	
	
}

class Volt{
	int volts;

	
	@Override
	public String toString() {
		return "Volt [volts=" + volts + "]";
	}

	public int getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}

	public Volt(int volts) {
		super();
		this.volts = volts;
	}
	
}
