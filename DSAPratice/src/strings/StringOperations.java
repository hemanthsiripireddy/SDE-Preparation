package strings;

public class StringOperations {
	public static void method() {
		String str1=new String("Great ");
		String str2=new String("Learning");
		
		//concatenation:
		System.out.println(str1+str2);
		System.out.println(str1.concat(str2));
		
		//Length
		System.out.println(str1.length());
		
		//get character at a particular index
		System.out.println(str1.charAt(1));
		
		//equality check
		String str3=new String("Great ");
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		
		//compareTo
		System.out.println(str1.compareTo(str2));
		
		//substring
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(1,4));
		
		//replace
		System.out.println(str2.replace('n', 'h'));
		System.out.println(str2);
		
		//split
		String[] arr=str2.split("n");
		for(String str:arr) {
			System.out.println(str);
		}
		
		//case conversion
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		
		//trim
		String str4=" hello ";
		System.out.println(str4);
		System.out.println(str4.trim());
	}

}
