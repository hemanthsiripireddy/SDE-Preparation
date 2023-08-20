package annotations;
@VeryImportant
public class Cat {
	@ImportantString
	public String name;
	String age;
	
	public Cat(String name) {
		super();
		this.name = name;
	}
	public void eat() {
		System.out.println("I'm eating");
	}
	@RunImmediately
	public void meow() {
		System.out.println("Meow Meow Meow");
	}

}
