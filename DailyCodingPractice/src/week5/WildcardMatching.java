package week5;

public class WildcardMatching {
	public static void method() {
		String s="";
		String p="****";
		boolean ans=isMatch(s,p);
		System.out.println(ans);
		
	}
	
	 public static boolean isMatch(String s, String p) {
	        int sv=0,pv=0,index=-1,match=0;
	        while(sv<s.length()){
	            if(pv<p.length()&&(p.charAt(pv)=='?'||p.charAt(pv)==s.charAt(sv))){
	                pv++;
	                sv++;
	            }else if(pv<p.length()&&p.charAt(pv)=='*'){
	                index=pv;
	                match=sv;
	                pv++;
	                
	            }else if(index!=-1){
	                pv=index+1;
	                match++;
	                sv=match;


	            }else{
	                return false;
	            }

	        }
	        while(pv<p.length()&&p.charAt(pv)=='*')
	        pv++;
	        return pv==p.length();
	        
	    }
	    
}
