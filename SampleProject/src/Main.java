import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is a beautiful Sunday morning.
		Scanner sc=new Scanner(System.in);
		
		String str="This is a beautiful Sunday morning";
		
		StringBuilder res=new StringBuilder();
		
		int start=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==' ') {
				String temp=str.substring(start,i);
				String reversedStr=reverse(temp);
				res.append(reversedStr+" ");
				start=i+1;
			}
			
		}
		String temp=str.substring(start,str.length());
		String reversedStr=reverse(temp);
		res.append(reversedStr);
		String ans=new String(res);
		System.out.println(ans);
		

	}

	private static String reverse(String str) {
		// TODO Auto-generated method stub
		char[] chArr=str.toCharArray();
		int i=0,j=chArr.length-1;
		while(i<j) {
			char temp=chArr[i];
			chArr[i]=chArr[j];
			chArr[j]=temp;
			i++;
			j--;
			
		}
		return new String(chArr);
	}

}
