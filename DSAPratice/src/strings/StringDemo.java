package strings;

import java.util.Scanner;

public class StringDemo {
	public static void method() {
		String greeting1=new String("Hi");
		String greeting2=new String("Hello");
		System.out.println(greeting1);
		System.out.println(greeting2);
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		System.out.println(str1);
		String str2=sc.next();
		System.out.println(str2);
	}

}
