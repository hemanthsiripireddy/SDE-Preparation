package week4;

public class PrintAllPanlidromicSubstrings {
	public static void method() {
		String s="aaa";
		
		 int ans=0;
	        for(int i=0;i<s.length();i++){
	            int start=i,end=i;
	            
	            while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
	                ans++;
	                System.out.println(s.substring(start,end+1));
	                start--;
	                end++;
	            }

	        }
	         for(int i=0;i<s.length()-1;i++){
	            int start=i,end=i+1;
	           if(s.charAt(start)==s.charAt(end)){
	              
	            while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
	            	System.out.println(s.substring(start,end+1));
	                ans++;
	                start--;
	                end++;
	            }
	           }

	        }
	}

}
