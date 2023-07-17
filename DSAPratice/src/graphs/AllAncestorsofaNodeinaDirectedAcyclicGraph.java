package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AllAncestorsofaNodeinaDirectedAcyclicGraph {
	static Set<Integer>g=new HashSet<>();
   static  List<Set<Integer>>fres=new ArrayList<>();
   public static void method() {
	   int[][] edges= {{4,0},{0,5},{3,0},{6,3},{4,5},{2,6},{6,5},{4,3},{2,0}};
	   List<List<Integer>> res=getAncestors(8, edges);
	   for(int i=0;i<res.size();i++) {
		   System.out.println(res.get(i));
	   }
   }
    public static List<List<Integer>> getAncestors(int n, int[][] edges) {

        Map<Integer,List<Integer>>map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
            fres.add(new HashSet<>());

        }
        for(int i=0;i<edges.length;i++){
            map.get(edges[i][1]).add(edges[i][0]);
        }
        
        for(int i=0;i<n;i++){
            Set<Integer>list=fres.get(i);
           // if(!g.contains(i))
           Set<Integer>temp= compute(i,map,list);
           list.addAll(temp);
           

        }
        List<List<Integer>>ans=new ArrayList<>();

        for(int i=0;i<n;i++ ){
            ans.add(new ArrayList<>(fres.get(i)));
        }
        return ans;
        
    }
    public static Set<Integer> compute(int node,Map<Integer,List<Integer>>map,Set<Integer>res){
        if(map.get(node).size()!=0)
        	g.add(node);
       Set<Integer>now=new HashSet<>();

        for(int cur:map.get(node)){
            now.add(cur);
            
            if(g.contains(cur)){
                now.addAll(fres.get(cur));
            }else {
            	Set<Integer>r= compute(cur,map,res);
            	now.addAll(r);
            	
            }
           
        }
        fres.get(node).addAll(now);
        return now;
    }

}
