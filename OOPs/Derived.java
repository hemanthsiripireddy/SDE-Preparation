class Derived extends Base {

  // addition of static causes compilation error
  public  int add(int a, int b) {
    System.out.println("In the child class.");
    return a + b;
  }

  // removal of static causes compilation error
  public static void print() {
    System.out.println("In the child class.");
  }
}