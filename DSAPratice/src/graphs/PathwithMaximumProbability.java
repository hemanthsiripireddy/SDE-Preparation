package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class PathwithMaximumProbability {
	public static void method() {
		int n=3;
		int[][] edges= {{0,1},{1,2},{0,2}};
		double[] succProb= {0.5,0.5,0.2};
		int start=0;
		int end=2;
		double res=maxProbability(n, edges, succProb, start, end);
		System.out.println(res);
	}
	public static  double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {

        double[] p=new double[n];
        Arrays.fill(p,-1);
        p[start]=1.0;
        Set<Integer>set=new HashSet<>();
        Map<Integer,List<Pair1<Integer,Double>>>map=new HashMap<>();
        PriorityQueue<Pair1<Integer,Double>>pq=new PriorityQueue<>((p1,p2)->{
			if(p2.getValue()-p1.getValue()>0) return 1;
			return 0;
		});
        pq.add(new Pair1(start,1));
       
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            // map.put(edges[i][0],map.getOrDefault(edges[i][0],new ArrayList<>()));
            // map.put(edges[i][1],map.getOrDefault(edges[i][1],new ArrayList<>()));
            map.get(edges[i][0]).add(new Pair1(edges[i][1],succProb[i]));
            map.get(edges[i][1]).add(new Pair1(edges[i][0],succProb[i]));

        }
        while(!pq.isEmpty()){
             
        Pair1<Integer,Double>pair= pq.poll();
        int curNode =pair.getKey();
        double prob=pair.getValue();
        set.add(curNode);
        for(Pair1<Integer,Double> cur:map.get(curNode)){
            if(!set.contains(cur.getKey())){
                if(prob*cur.getValue()>p[cur.getKey()]){
                    p[cur.getKey()]=prob*cur.getValue();
                    pq.add(new Pair1(cur.getKey(),p[cur.getKey()]));
                }

            }
        }
        }
        return p[end];
        
    }
   

}
