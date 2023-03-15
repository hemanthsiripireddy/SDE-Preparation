package week13;

public class ValidateIPAddress {
	public static void method() {
		String ip="";
		String res=validIPAddress(ip);
		System.out.println(res);
	}
	 public static String validIPAddress(String queryIP) {
	        String[] res=queryIP.split("\\.");
	        if(res.length==4){
	        	if(queryIP.charAt(0)=='.'||queryIP.charAt(queryIP.length()-1)=='.')
	        		return "Neither";
	            for(int i=0;i<4;i++){
	            	if(res[i].length()==0)
	            		return "Neither";
	                if(res[i].charAt(0)=='0'&&res[i].length()!=1)
	                return "Neither";
	                try{
	                    int num=Integer.parseInt(res[i]);
	                    if(num<0||num>255)
	                    return "Neither";
	                }
	                catch(NumberFormatException e){
	                    return "Neither";
	                }
	            }
	            return "IPv4";

	        }else{
	        	res=queryIP.split(":");
	        	if(res.length!=8)
		            return "Neither";
	        	
	        	if(queryIP.charAt(0)==':'||queryIP.charAt(queryIP.length()-1)==':')
	        		return "Neither";
	            
	            
	            for(int i=0;i<8;i++){
	                if(res[i].length()<1||res[i].length()>4)
	                return "Neither";
	                if(!isIPV6(res[i]))
	                return "Neither";
	            }
	            System.out.println(res[7].length());
	            return "IPv6";

	        
	        }
	        
	    }
	    public static  boolean isIPV6(String str){
	        for(int i=0;i<str.length();i++){
	            char ch=str.charAt(i);
	            if(ch>='0'&&ch<='9')
	            continue;
	            if(!((ch>='a'&&ch<='f')||(ch>='A'&&ch<='F')))
	            return false;
	        }
	        return true;
	    }

}
