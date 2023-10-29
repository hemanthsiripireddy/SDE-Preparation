package strings;

import java.util.ArrayList;
import java.util.List;

public class SimilarStringGroups {
	public static void main(String[] args) {
		String[] strs= {"kccomwcgcs","socgcmcwkc","sgckwcmcoc","coswcmcgkc","cowkccmsgc","cosgmccwkc","sgmkwcccoc","coswmccgkc","kowcccmsgc","kgcomwcccs"};
		int res=numSimilarGroups(strs);
		
		System.out.println(res);
		
	}
	 public static int numSimilarGroups(String[] strs) {
	        List<List<String>>list=new ArrayList<>();
	       
	        for(String str:strs){
	            compute(list, str);
	        }
	        for(List<String>cur:list) {
	        	for(String str: cur) {
	        		System.out.println(str+" ");
	        	}
	        	System.out.println();
	        	
	        }
	        return list.size();

	        
	    }
	    public static void compute(List<List<String>>list,String str){


	        for(List<String>cur:list){
	            boolean res=isGroupMatch(cur,str);
	            if(res){

	                cur.add(str);
	                return ;

	            }

	        }
	        List<String>newGrp=new ArrayList<>();
	        newGrp.add(str);
	        list.add(newGrp);
	    }
	    public static boolean isGroupMatch(List<String>list,String str){


	        for(String cur:list){
	            boolean res=isMatch(cur,str);
	            if(res)
	            return res;
	        }
	        return false;

	    }
	    public static  boolean isMatch(String str1,String str2){
	        char ch1='1';
	        char ch2='1';
	        int n=0;
	        if(str1.length()!=str2.length())
	        return false;
	        for(int i=0;i<str1.length();i++){
	            if(str1.charAt(i)!=str2.charAt(i)){

	                if(n==0){
	                    ch1=str1.charAt(i);
	                    ch2=str2.charAt(i);
	                    n++;

	                }else if(n==1){
	                    if(str1.charAt(i)==ch2&&str2.charAt(i)==ch1){
	                        n++;
	                    }else{
	                        return false;
	                    }

	                }else if(n==2) {
	                	ch1=str1.charAt(i);
	                    ch2=str2.charAt(i);
	                    n++;
	                	
	                }else if(n==3) {
	                	if(str1.charAt(i)==ch2&&str2.charAt(i)==ch1){
	                        n++;
	                    }else{
	                        return false;
	                    }
	                	
	                }
	                
	                else {
	                	 return false;
	                }
	            }
	        }
	        return true;
	    }

}
