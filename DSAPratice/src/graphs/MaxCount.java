package graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaxCount {
	public static void method() {
		int[][] edges= {{1,2},{3,2},{1,3},{4,2}};
		int res=MaximalNetworkRank(edges);
		System.out.println(res);
	}
	
	public static int MaximalNetworkRank(int[][] edges) {
		
		Map<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<edges.length;i++) {
			
			map.put(edges[i][0], map.getOrDefault(edges[i][0], 0)+1);
			map.put(edges[i][1], map.getOrDefault(edges[i][1], 0)+1);
			
		}
		int[][] matrix=new int[map.size()+1][map.size()+1];
		int res=0;
		for(int i=0;i<edges.length;i++) {
			int v1=edges[i][0],v2=edges[i][1];
			matrix[v1][v2]=1;
			matrix[v2][v1]=1;
			
		}
		for(int i=1;i<matrix.length;i++) {
			for(int j=1;j<matrix.length;j++) {
				if(i!=j) {
					
					int cur=map.get(i)+map.get(j);
					if(matrix[i][j]==1)
						cur-=1;
					res=Math.max(res, cur);
				}
			}
		}
		
		
		
		
		return res;
		
	}

}
