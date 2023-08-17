package designPattern.behavioral.TemplateDesign;

public class TemplateDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game cricket=new Cricket();
		cricket.play();

	}

}

abstract class Game{
	public  abstract void initializeGame();
	public abstract void playGame();
	public abstract void endGame();
	public final void play() {
		initializeGame();
		playGame();
		endGame();
	}
	
}
class Cricket extends Game{

	@Override
	public void initializeGame() {
		// TODO Auto-generated method stub
		System.out.println("Initializing cricket game");
		
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("Playing Cricket Game");
		
	}

	@Override
	public void endGame() {
		// TODO Auto-generated method stub
		System.out.println("Ending Cricket Game");
		
	}
	
}
class FootBall extends Game{

	@Override
	public void initializeGame() {
		// TODO Auto-generated method stub
		System.out.println("Initializing FootBall game");
		
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("Playing FootBall Game");
		
	}

	@Override
	public void endGame() {
		// TODO Auto-generated method stub
		System.out.println("Ending FootBall Game");
		
	}
	
}
