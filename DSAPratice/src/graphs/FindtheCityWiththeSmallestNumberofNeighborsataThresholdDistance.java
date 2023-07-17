package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class FindtheCityWiththeSmallestNumberofNeighborsataThresholdDistance {
	
	public static void method() {
		int n=4;
		int[][] edges= {{0,1,3},{1,2,1},{1,3,4},{2,3,1}};
		int distance=4;
		int res=findTheCity(n, edges, distance);
		System.out.println(res);
		
	}
	public static int findTheCity(int n, int[][] edges, int distanceThreshold) {

        Map<Integer,List<Pair<Integer,Integer>>>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            map.get(edges[i][0]).add(new Pair(edges[i][1],edges[i][2]));
            map.get(edges[i][1]).add(new Pair(edges[i][0],edges[i][2]));
        }
        int res=-1;
        int c=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
           
            //pq.add(new Pair(i,0));
            int d=compute(i,map, distanceThreshold);
            if(d<c){
                res=i;
                c=d;
            }else if(d==c){
                res=i;
            }

                
            
        }
        return res;

        
    }
    public static int compute(int node,Map<Integer,List<Pair<Integer,Integer>>>map,int max){
        Set<Integer>set=new HashSet<>();
         PriorityQueue<Pair<Integer,Integer>>pq=new PriorityQueue<>((p1,p2)->{
                return p1.getValue()-p2.getValue();

            });
            pq.add(new Pair(node,0));
            int[] dist=new int[map.size()];
            Arrays.fill(dist,Integer.MAX_VALUE);
        set.add(node);
        int res=0;
        while(!pq.isEmpty()){
            Pair<Integer,Integer>pair=pq.poll();
            int d=pair.getValue();
            int curN=pair.getKey();
            if(d<=max)
            res++;
            else
            break;
            set.add(curN);
            
            for(Pair<Integer,Integer> cur:map.get(curN)){
                if(!set.contains(cur.getKey())){
                    pq.add(new Pair(cur.getKey(),d+cur.getValue()));
                }
            }

        }
        return set.size();
    }

}
