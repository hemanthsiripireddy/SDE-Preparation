package week4;
//nitin
public class GridUniquepaths {
	static int count=0;
	public static void method() {
		int m=934,n=3678;
		int[][] arr=new int[m][n];
		 int ans=helper(arr,0,0);
		 System.out.println(ans);
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[0].length;j++) {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
		 System.out.println(count);
	}

	private static int helper(int[][] arr, int i, int j) {
		// TODO Auto-generated method stub
		count++;
		if(i==arr.length-1&&j==arr[0].length-1)
			return 1;
		if(arr[i][j]!=0)
			return arr[i][j];
		if(j+1<arr[0].length) {
			arr[i][j]+=helper(arr,i,j+1);
			
		}
		if(i+1<arr.length) {
			arr[i][j]+=helper(arr,i+1,j);
		}
		return arr[i][j];
		
	} 

}
