package week17;

public class UglyNumberII {
	public static void method() {
		int n=1352;
		int res=nthUglyNumber(n);
		System.out.println(res);
		
	}
	public static int nthUglyNumber(int n) {
        int count=0;
        int num=0;
        while(count<n){
            if(isUgly(num+1)){
                count++;
                
            }
            num++;
        }
        return num;
        
        
    }
    public static boolean isUgly(int n){
        for(int i:new int[]{2,3,5}){
            while(n%i==0)
            n=n/i;
        }
        return n==1;
    }

}
