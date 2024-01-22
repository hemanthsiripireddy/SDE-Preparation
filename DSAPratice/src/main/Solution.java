package main;
import java.util.ArrayList;
import java.util.List;

class Solution{
    public int numberSequence(int m, int n)
    {
        // code here
        
       return rec(1,n,m);
    }
    public  int rec(int cur,int n,int m){
        if(n==1){
            if(cur<=m) return m-cur+1;
            return 0;
        }
        int res=0;
        for(int i=cur;gp(i,n,2)<=m;i++){
            res+=rec(i*2,n-1,m);
            
        }
        return res;
    }
    public static int gp(int a,int n,int r){
        return (int) (a*(Math.pow(r, n-1)));
    }
}