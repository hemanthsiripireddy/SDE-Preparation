package arrays;

public class SetMatrixZero {
	public static void method() {
		//0,1,1
		//1,1,1
		//1,1,1
		int[][] arr=new int[][] {{1,1,0},{1,1,1},{1,1,1}};
		boolean hasTopRowHasZero=false;
		boolean hasTopColumnHasZero=false;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==0) {
					if(i==0) {
						hasTopRowHasZero=true;
					}
					if(j==0) {
						hasTopColumnHasZero=true;
					}
					arr[i][0]=0;
					arr[0][j]=0;
				}
			}
		}
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr[0].length;j++) {
				if(arr[i][0]==0||arr[0][j]==0)
					arr[i][j]=0;
			}
		}
		if(hasTopColumnHasZero) {
			for(int i=0;i<arr.length;i++) {
				arr[i][0]=0;
				
			}
		}
		if(hasTopRowHasZero) {
			for(int i=0;i<arr[0].length;i++) {
				arr[0][i]=0;
				
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
