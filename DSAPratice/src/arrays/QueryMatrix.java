package arrays;

public class QueryMatrix {
	int m,n;
	int[][] matrix;
	//int[] arr= new int[3]{1,2,3};

	public QueryMatrix(int m, int n) {
		super();
		this.m = m;
		this.n = n;
		matrix=new int[m][n];
		int count=1;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j--) {
				matrix[i][j]=count++;
			}
		}
	}
	public int handleQuery(char q,int x,int y) {
		if(q=='R') {
			for(int i=0;i<n;i++) {
				int temp=matrix[x-1][i];
				matrix[x-1][i]=matrix[y-1][i];
				matrix[y-1][i]=temp;
			}
		}
		else if(q=='C') {
			for(int i=0;i<m;i++) {
				int temp=matrix[i][x-1];
				matrix[i][x-1]=matrix[i][y-1];
				matrix[i][y-1]=temp;
			}
			
		}
		else if(q=='P') {
			return matrix[x-1][y-1];
		}
		return -1;
	}
	
	

}
