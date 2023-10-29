package dp;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class MaximumStrictlyIncreasingCellsinaMatrix {
	public static void main(String[] args) {
		int[][]mat= {{3,1},{3,4}};
		int res=maxIncreasingCells(mat);
		System.out.println(res);
	}
	 static class Pair{
	        int index;
	        int value;
	        public Pair(int index,int  value){
	            this.index=index;
	            this.value=value;
	        }
	    }
	static class SortByValue implements Comparator<Pair> {
		 
		    
		    public int compare(Pair a, Pair b)
		    {
		        if(a.value!=b.value)
		        return a.value-b.value;
		        return a.index-b.index;
		 
		        
		    }
	}
	   static  int[][]dp;
	    public static int maxIncreasingCells(int[][] mat) {

	        Map<Integer,TreeSet<Pair>>row=new HashMap<>();
	        Map<Integer,TreeSet<Pair>>col=new HashMap<>();

	        int m=mat.length;
	        int n=mat[0].length;
	        dp=new int[m][n];

	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                row.put(i,row.getOrDefault(i,new TreeSet<>(new SortByValue())));
	                 col.put(j,col.getOrDefault(j,new TreeSet<>(new SortByValue())));
	                 row.get(i).add(new Pair(j,mat[i][j]));
	                 col.get(j).add(new Pair(i,mat[i][j]));


	            }
	        }
	        int res=0;
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(dp[i][j]!=0){
	                    res=Math.max(res,dp[i][j]);
	                }
	                else{
	                    int ans=compute(i,j,mat,row,col);
	                    dp[i][j]=ans;
	                    res=Math.max(res,dp[i][j]);
	                }

	            }

	        }
	        return res;
	        
	    }
	    public static int compute(int i,int j,int[][] mat,Map<Integer,TreeSet<Pair>>row,Map<Integer,TreeSet<Pair>>col){

	        if(dp[i][j]!=0)
	        return dp[i][j];
	        int res=1;

	        SortedSet<Pair>rowSet=row.get(i).tailSet(new Pair(0,mat[i][j]),false);
	        SortedSet<Pair>colSet=col.get(j).tailSet(new Pair(0,mat[i][j]),false);

	        for(Pair pair:rowSet){
	          if(pair.value>mat[i][j]) {
	        	  int ans=compute(i,pair.index,mat,row,col);
		            res=Math.max(ans+1,res);
	          }

	        }
	        for(Pair pair:colSet){
	        	if(pair.value>mat[i][j]) {
	        		 int ans=compute(pair.index,j,mat,row,col);
	 	            res=Math.max(ans+1,res);
	        		
	        	}
	           

	        }
	        dp[i][j]=res;
	        return res;

	    }

}
