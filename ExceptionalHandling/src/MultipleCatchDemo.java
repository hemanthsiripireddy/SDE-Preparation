
public class MultipleCatchDemo {
	public static void multipleCatchDemo() {
		try {
			int[] arr=new int[10];
			arr[11]=12/6;
//			String s=null;
//			s.charAt(0);
			
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ae) {
			System.out.println("divide by zero is not possible: "+ae);
		}
//		catch(ArithmeticException ae) {
//			System.out.println("divide by zero is not possible: "+ae.getMessage());
//		}
//		catch(ArrayIndexOutOfBoundsException a) {
//			System.out.println("cant access array element outside of array length: "+a.getMessage());
//		}
		catch(Exception e) {
			System.out.println("any other generic exception: "+e.getMessage());
		}
		System.out.println("I am out of try-catch block");
	}

}
