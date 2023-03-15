package week11;

public class FindaPeakElementII {
	//Find a Peak Element II
	public int[] findPeakGrid(int[][] mat) {
        int start=0,end=mat[0].length-1;
        while(start<=end){
            int mid=(start+end)/2;
            int max_row=0;
            for(int i=0;i<mat.length;i++){
                if(mat[i][mid]>mat[max_row][mid])
                max_row=i;
            }
            if((mid==0||mat[max_row][mid]>mat[max_row][mid-1])&&(mid==mat[0].length-1||mat[max_row][mid]>mat[max_row][mid+1]))
            return new int[]{max_row,mid};
            else if(mid>0&&mat[max_row][mid-1]>mat[max_row][mid])
            end=mid-1;
            else start=mid+1;
        }
         return null;
    }
   

}
