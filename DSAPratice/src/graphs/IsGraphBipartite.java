package graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class IsGraphBipartite {
	public static void method() {
		int[][] graph= {{1,3},{0,2},{1,3},{0,2}};
		boolean res =isBipartite(graph);
		System.out.println(res);
	}
	public static boolean isBipartite(int[][] graph) {
		
        int[] color=new int[graph.length];
        Arrays.fill(color,-1);
        return compute(0,color,graph);
        
    }
    public static boolean compute(int index,int[] color,int[][] graph){

        color[index]=1;
        Queue<Integer>queue=new LinkedList<>();
        queue.add(index);
        while(!queue.isEmpty()){
            int cur=queue.poll();
            for(int i=0;i<graph[cur].length;i++){
                if(color[cur]==color[i])
                return false;

                if(color[i]==-1){
                    color[i]=1-color[cur];
                    queue.add(i);
                }
            }

        }
        return true;
    }

}
