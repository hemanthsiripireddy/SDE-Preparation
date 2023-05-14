package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
	public static void method() {
		int[][] img= {{1,0,1},{1,1,0},{1,1,1}};
		//floodFillBFS(img,1,1,2);
		floodFillDFS(img,1,1,2);
		printImg(img);
	}

	private static void floodFillDFS(int[][] img, int i, int j, int target) {
		
		// TODO Auto-generated method stub
		if(i>=0&&i<img.length&&j>=0&&j<img[0].length&&img[i][j]==1) {
			img[i][j]=target;
			floodFillDFS(img,i+1,j,target);
			floodFillDFS(img,i-1,j,target);
			floodFillDFS(img,i,j+1,target);
			floodFillDFS(img,i,j-1,target);
		}
		
		
		
	}

	private static void printImg(int[][] img) {
		// TODO Auto-generated method stub
		for(int i=0;i<img.length;i++) {
			for(int j=0;j<img[0].length;j++) {
				System.out.print(img[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static void floodFillBFS(int[][] img, int i, int j, int target) {
		// TODO Auto-generated method stub
		int curColor=img[i][j];
		if(curColor==target|| curColor==0)
			return;
		
		Queue<int[]> queue=new LinkedList<>();
		img[i][j]=target;
		queue.add(new int[] {i,j});
		while(queue.size()!=0) {
			int[][] h= {{0,1},{1,0},{-1,0},{0,-1}};
			int[] arr=queue.poll();
			int x=arr[0],y=arr[1];
			for(int it=0;it<4;it++) {
				int x1=x+h[it][0],y1=y+h[it][1];
				if(isvalidBFS(img,x+h[it][0],y+h[it][1],target)) {
					img[x1][y1]=target;
					queue.add(new int[] {x1,y1});
					
				}
				
			}
			
		}
		
	}

	private static boolean isvalidBFS(int[][] img, int i, int j, int target) {
		// TODO Auto-generated method stub
		if(i<0||i>=img.length||j<0||j>=img[0].length||img[i][j]==target||img[i][j]==0)
		return false;
		return true;
	}

}
