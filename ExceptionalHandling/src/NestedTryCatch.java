
public class NestedTryCatch {
	public static void nestedTryCatch() {
		try {
			try {
				try {
					int[] arr= {1,2,4,5};
					System.out.println(arr[8]);
				}
				catch(NullPointerException e) {
					System.out.println("NullPointerException in block 3");
				// throw e;
				}
			}
			catch(ArithmeticException e) {
				System.out.println("ArithmeticException in block 2");
				//throw e;
			}
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException in block 3");
			//throw e;
		}
//		try {
//			try {
//				try {
//					int[] arr= {1,2,4,5};
//					System.out.println(arr[8]);
//				}
//				catch(NullPointerException e) {
//					System.out.println("NullPointerException in block 3");
//				// throw e;
//				}
//			}
//			catch(ArithmeticException e) {
//				System.out.println("ArithmeticException in block 2");
//				//throw e;
//			}
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndexOutOfBoundsException in block 3");
//			//throw e;
//		}
		///////////////////////////////////////////////
//		try {
//			try {
//				try {
//					int[] arr= {1,2,4,5};
//					System.out.println(arr[8]);
//				}
//				catch(ArrayIndexOutOfBoundsException e) {
//					System.out.println("ArrayIndexOutOfBoundsException in block 3");
//				 throw e;
//				}
//			}
//			catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("ArrayIndexOutOfBoundsException in block 2");
//				throw e;
//			}
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndexOutOfBoundsException in block 3");
//			//throw e;
//		}
	}

}
