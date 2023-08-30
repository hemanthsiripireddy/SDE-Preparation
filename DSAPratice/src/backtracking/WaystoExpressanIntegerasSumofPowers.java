package backtracking;

public class WaystoExpressanIntegerasSumofPowers {
	     static int res=0;
	     public static void main(String[] args) {
	    	 int ans=numberOfWays(10, 2);
	    	 System.out.println(ans);
	     }

	    public static int numberOfWays(int n, int x) {
	       
	        for(int i=1;(int)Math.pow(i,x)<=n;i++){
	            compute(0,i,n,x);

	        }
	        return res;
	        
	    }
	    public static void compute(int sum, int i,int n,int x){
	      
	        if(sum>n)
	        return;
	        if(sum==n){
	            res++;
	            return;
	        }
	        if(Math.pow(i,x)>n)
		        return;
	        compute(sum,i+1,n,x);
	        int val=sum+(int)Math.pow(i,x);
	        compute(val,i+1,n,x);
	    }

}
