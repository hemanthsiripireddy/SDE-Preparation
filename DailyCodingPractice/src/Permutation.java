import java.util.HashSet;
import java.util.Set;

public class Permutation {
	static Set<Character>set=new HashSet<>();
	public static void main(String[] args) {
		 String s="abc";
		
		//rec(s,"");
		 recursion(s,"");
		
	}
	private static void recursion(String s,String newStr) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length();i++) {
			if(set.size()==s.length()) {
				System.out.println(newStr);
				break;
			}
			
			if(set.add(s.charAt(i))) {
					
				
					recursion(s,newStr+s.charAt(i));
					set.remove(s.charAt(i));
					
					
					
				
			}
			
			
		}
		
	}
 private static void rec(String s,int start,int end) {
	 if(start>=end) {
		 System.out.println(s);
	 }
	 for(int i=start;i<=end;i++) {
		String s1=s.charAt(i)+s.substring(start+1, i)+s.charAt(start)+s.substring(i+1);
		rec(s1, start, end);
	 }
	 
 }

}
