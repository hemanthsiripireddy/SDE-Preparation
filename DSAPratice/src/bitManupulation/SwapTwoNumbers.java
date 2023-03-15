package bitManupulation;

import javax.sql.rowset.serial.SQLOutputImpl;

public class SwapTwoNumbers {
	public static void method() {
		int a=10,b=4;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+b);
	}
}
