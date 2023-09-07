package designPattern.behavioral;

public class StateDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		State onState=new OnState();
		State offState=new  OFFState();
		ContextTV context=new ContextTV();
		context.setState(onState);
		context.doAction();
		context.setState(offState);
		context.doAction();

	}

}
interface State{
	public void doAction();
}
class OnState implements State{

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		System.out.println("TV is switched ON");
		
	}
	
}
class OFFState implements State{

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		System.out.println("TV is switched OFF");
		
	}
	
}

class ContextTV implements State{
	private State state;
	

	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}


	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		state.doAction();
		
	}
	
}
