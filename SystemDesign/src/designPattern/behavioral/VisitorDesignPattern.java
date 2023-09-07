package designPattern.behavioral;

public class VisitorDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemElement[] items= {new Book(45, "1234"),new Book(100, "98765"),new 
				Fruit(12, 2, "Apple"),new Fruit(40,5,"Mango")};
		ShoppingCartVisitor visitor=new ShoppingCartVisitorImp();
		int price =calculatePrice(items,visitor);
		System.out.println("total price: "+price);
		

	}
	public static int calculatePrice(ItemElement[] items,ShoppingCartVisitor visitor) {
		int price=0;
		for(ItemElement item:items) {
			price+=item.accept(visitor);
		}
		return price;
	}

}
interface ItemElement{
	public int accept(ShoppingCartVisitor visitor);
}
interface ShoppingCartVisitor{
	public int visit(Book book);
	public int visit(Fruit fruit);
	
}
class ShoppingCartVisitorImp implements ShoppingCartVisitor{

	@Override
	public int visit(Book book) {
		// TODO Auto-generated method stub
		int cost=0;
		if(book.getPrice()>5) {
			cost=book.getPrice()-5;
		}else {
			cost=book.getPrice();
		}
		System.out.println("ISBN: "+book.getIsbn()+" "+"Cost: "+cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		// TODO Auto-generated method stub
		int cost;
		cost=fruit.getPrice()*fruit.getWeight();
		System.out.println("Fruit Name: "+fruit.getName()+" cost: "+cost);
		return cost;
	}
	
}
class Book implements ItemElement{
	private int price;
	private String isbn;
	public Book(int price,String isbn) {
		this.price=price;
		this.isbn=isbn;
	}
	public int getPrice()
	{
		return price;
	}
	public String getIsbn() {
		return isbn;
		
	}
	

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
	
}
class Fruit implements ItemElement{
	private int price;
	private int weight;
	private String name;
	

	public Fruit(int price, int weight, String name) {
		//super();
		this.price = price;
		this.weight = weight;
		this.name = name;
	}
	


	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
	
}