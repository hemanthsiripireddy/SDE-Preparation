package designPattern.behavioral.chainOfResponsibility;

public class ATMChainOfResponsibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DispenseChain tend=new Dispense10$Currency();
		DispenseChain twd=new Dispense20$Currency();
		DispenseChain fd=new Dispense50$Currency();
		fd.setNextChain(twd);
		twd.setNextChain(tend);
		
		Currency cur=new Currency(120);
		fd.dispenseCurrency(cur);
				

	}

}
interface DispenseChain{
	public void setNextChain(DispenseChain next);
	public void dispenseCurrency(Currency cur);
	public DispenseChain getNext();
}
class Dispense50$Currency implements DispenseChain{
	DispenseChain next;

	@Override
	public void setNextChain(DispenseChain next) {
		// TODO Auto-generated method stub
		this.next=next;
		
	}

	@Override
	public void dispenseCurrency(Currency cur) {
		// TODO Auto-generated method stub
		if(cur.getAmount()/50>=1) {
			int count=cur.getAmount()/50;
			System.out.println("Dispensing "+count+" 50$ notes");
			int remainder=cur.getAmount()%50;
			if(remainder!=0)next.dispenseCurrency(new Currency(remainder));
			
		}else {
			next.dispenseCurrency(cur);
		}
		
	}

	@Override
	public DispenseChain getNext() {
		// TODO Auto-generated method stub
		return next;
	}
	
}
class Dispense20$Currency implements DispenseChain{
	DispenseChain next;

	@Override
	public void setNextChain(DispenseChain next) {
		// TODO Auto-generated method stub
		this.next=next;
		
	}

	@Override
	public void dispenseCurrency(Currency cur) {
		// TODO Auto-generated method stub
		if(cur.getAmount()/20>=1) {
			int count=cur.getAmount()/20;
			System.out.println("Dispensing "+count+" 20$ notes");
			int remainder=cur.getAmount()%20;
			if(remainder!=0)next.dispenseCurrency(new Currency(remainder));
			
		}else {
			next.dispenseCurrency(cur);
		}
		
	}

	@Override
	public DispenseChain getNext() {
		// TODO Auto-generated method stub
		return next;
	}
	
}
class Dispense10$Currency implements DispenseChain{
	DispenseChain next;

	@Override
	public void setNextChain(DispenseChain next) {
		// TODO Auto-generated method stub
		this.next=next;
		
	}

	@Override
	public void dispenseCurrency(Currency cur) {
		// TODO Auto-generated method stub
		if(cur.getAmount()/10>=1) {
			int count=cur.getAmount()/10;
			System.out.println("Dispensing "+count+" 10$ notes");
			int remainder=cur.getAmount()%10;
			if(remainder!=0)next.dispenseCurrency(new Currency(remainder));
			
		}else {
			next.dispenseCurrency(cur);
		}
		
	}

	@Override
	public DispenseChain getNext() {
		// TODO Auto-generated method stub
		return next;
	}
	
}
class Currency{
	private int amount;

	public Currency(int amount) {
		super();
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
