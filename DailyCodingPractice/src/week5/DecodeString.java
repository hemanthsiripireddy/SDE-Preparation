package week5;

public class DecodeString {
	static int i=0;
	static String res="";
	public static void method() {
		String str="20[abc]";
		String ans=helper(str);
		System.out.println(ans);
		
		
	}
	public static String helper(String str) {
		String ans="";
		while(i<str.length()) {
			int num=1;
			int start=i;
			
			while(str.charAt(i)-'0'>=0&&str.charAt(i)-'0'<=9) {
				i++;
			}
			if(start<i) {
				num=Integer.parseInt(str.substring(start,i)+"");
				i++;
				String str1=helper(str);
				i++;
				
				for(int j=0;j<num;j++) {
					ans+=str1;
				}
				//continue;
				
			}else {
				while(i<str.length()&&str.charAt(i)-'a'>=0&&str.charAt(i)-'a'<=26) {
					ans+=str.charAt(i++);
				}
				
			}
			if(i<str.length()&&str.charAt(i)==']')
				return ans;
			
		}
		return ans;
	}

}
