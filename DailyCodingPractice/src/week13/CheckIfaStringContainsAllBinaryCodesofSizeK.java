package week13;

import java.util.HashSet;
import java.util.Set;

public class CheckIfaStringContainsAllBinaryCodesofSizeK {
	public static void method() {
		boolean res=hasAllCodes1("00110110", 2);
		System.out.println(res);
	}
	 public static  boolean hasAllCodes(String s, int k) {
	        Set<String>set=new HashSet<>();
	        formSet(k,set,new StringBuilder());
	        for(int i=0;i<s.length()-k+1;i++){
	            String sub=s.substring(i,i+k);
	            if(set.contains(sub)){
	                set.remove(sub);
	            }
	        }
	        if(set.size()==0)
	        return true;
	        return false;
	        
	    }
	    public  static void formSet(int k,Set<String>set,StringBuilder sb){

	       
	            if(k==0){
	                String s=new String(sb);
	                set.add(s);
	                return;
	            }

	      
	        sb.append("0");
	        formSet(k-1,set,sb);
	        int last = sb.length() - 1;
	        sb.replace(last, last + 1, "");

	        sb.append("1");
	        formSet(k-1,set,sb);
	        sb.replace(last, last + 1, "");
	    }
	    public static boolean hasAllCodes1(String s, int k) {
	        Set<Integer>set=new HashSet<>();
	        //formSet(k,set,new StringBuilder());
	          int b=(int)(Math.pow(2,k));
	        for(int i=0;i<s.length()-k+1;i++){
	            String sub=s.substring(i,i+k);
	            int num=formNum(sub);
	          
	            if(num>=0&&num<b){
	               set.add(num);
	            }
	        }
	        if(set.size()==b)
	        return true;
	        return false;
	        
	    }
	    public static int formNum(String s){
	        int res=0;
	        int num=2;
	        int l=s.length();
	        if(s.charAt(l-1)=='1')
	        res=1;
	        for(int i=l-2;i>=0;i--){
	            if(s.charAt(i)=='1'){
	                res+=num;
	            }

	            num=num*2;
	        }
	        return res;
	    }
	   

}
