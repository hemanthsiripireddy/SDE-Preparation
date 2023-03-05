package strings;

public class CompareVersionNumbers {
	public static  void method() {
		int res=compareVersion("0.1","1.1");
		System.out.println(res);
		
	}
	 public static int compareVersion(String version1, String version2) {
	        String ver1[] =version1.split("\\.");
	        String ver2[] =version2.split("\\.");
	        int it1=0,it2=0;
	        while(it1<ver1.length&&it2<ver2.length){
	            int val1=Integer.parseInt(ver1[it1++]);
	            int val2=Integer.parseInt(ver2[it2++]);
	            if(val1<val2){
	                return -1;
	            }
	            if(val1>val2)
	            return 1;
	        }
	        while(it1<ver1.length){
	            int val=Integer.parseInt(ver1[it1++]);
	            if(val!=0)
	            return 1;
	        }
	         while(it2<ver2.length){
	            int val=Integer.parseInt(ver2[it2++]);
	            if(val!=0)
	            return -1;
	        }
	        return 0;
	        
	    }

}
