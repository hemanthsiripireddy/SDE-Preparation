
public class FinallyBlock {
	public static void finallyBlock() {
		try {
			int k=5/0;
		}
		finally {
			System.out.println("this is finally block");
		}
	}

}
