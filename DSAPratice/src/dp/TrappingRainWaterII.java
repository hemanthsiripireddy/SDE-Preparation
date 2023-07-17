package dp;

import java.util.PriorityQueue;

public class TrappingRainWaterII {
	 public static int trapRainWater(int[][] heightMap) {

         class Cell{
            int row;
            int col;
            int height;
            public Cell(int row,int col,int height){
                this.row=row;
                this.col=col;
                this.height=height;
            }
        }
        int n=heightMap.length;
        int m=heightMap[0].length;
        PriorityQueue<Cell>pq=new PriorityQueue<>((a,b)->(a.height-b.height));
        boolean visited[][]= new boolean[n][m];
        for(int i=0;i<n;i++){
            visited[i][0]=true;
            pq.add(new Cell(i,0,heightMap[i][0]));
            visited[i][m-1]=true;
            pq.add(new Cell(i,m-1,heightMap[i][m-1]));

         }
         for(int i=1;i<m-1;i++){
             visited[0][i]=true;
             pq.add(new Cell(0,i,heightMap[0][i]));
             visited[n-1][i]=true;
             pq.add(new Cell(n-1,i,heightMap[n-1][i]));
         }
         int res=0;
          int[][] arr=heightMap;
         int cor[][]={{-1,0},{1,0},{0,-1},{0,1}};
         while(pq.size()!=0){
              Cell cur=pq.poll();
         for(int i=0;i<4;i++){
             int r=cur.row+cor[i][0];
             int c=cur.col+cor[i][1];
             if(r>=0&&r<n&&c>=0&&c<m&&!visited[r][c]){
                 visited[r][c]=true;
                 res+=(Math.max(0,cur.height-arr[r][c]));
                 int h=Math.max(arr[r][c],cur.height);
                 pq.add(new Cell(r,c,h));

             }
         }

         }
         return res;
        
        

        
    }
}
