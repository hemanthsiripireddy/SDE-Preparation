public class Driver {

  public static void main(String args[]) {
	  Derived obj = new Derived();

    // Here Derive's add() is called
    //according to overriding rules
    System.out.println(obj.add(4, 5));

    //This should invoke the print method of class Derive,
    //as per overriding rules.
    //Because a static method can't be overridden,
    //it uses Base's print instead
    obj.print();
  }
}