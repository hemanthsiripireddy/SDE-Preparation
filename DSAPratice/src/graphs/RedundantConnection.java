package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class RedundantConnection {
	static int[] res=new int[2];
	static int edgeIndex=Integer.MIN_VALUE;
	static Stack<Integer>stack=new Stack<>();
	static   Set<Integer>set=new HashSet<>();
	public static void method() {
		int[][] edges= {{1,2},{2,3},{3,4},{1,4},{1,5}};
		findRedundantConnection(edges);
		System.out.println(res[0]+" "+res[1]);
	}
   public static int[] findRedundantConnection(int[][] edges) {

      
       Map<String,Integer>map=new HashMap<>();
       Map<Integer,List<Integer>>map2=new HashMap<>();
      
       for(int i=0;i<edges.length;i++){
           String str=""+edges[i][0]+" "+edges[i][1];
            
            map.put(str,i);
           
            map2.put(edges[i][0],map2.getOrDefault(edges[i][0],new ArrayList<>()));
            map2.put(edges[i][1],map2.getOrDefault(edges[i][1],new ArrayList<>()));
            map2.get(edges[i][0]).add(edges[i][1]);
            map2.get(edges[i][1]).add(edges[i][0]);
       }
       set.add(1);
       Pair<Boolean,Integer>pair=dfs(1,map2,-1);
       int breakPoint=pair.getValue();
       int cur=breakPoint;
       while(true){
           String str=stack.peek()+" "+cur;
           if(map.containsKey(str)) {
        	   if(map.get(str)>edgeIndex){
                   edgeIndex=map.get(str);
                   res[0]=stack.peek();
                   res[1]=cur;
               }
        	   
           }else {
        	   str=cur+" "+stack.peek();
        	   if(map.get(str)>edgeIndex){
                   edgeIndex=map.get(str);
                   res[0]=cur;
                   res[1]=stack.peek();
               }
        	   
           }
           
           if(stack.peek()==breakPoint)break;
           cur=stack.pop();

       }
       return res;

       
   }

   public static  Pair<Boolean,Integer> dfs(int index,Map<Integer,List<Integer>>map2,int parent){

       stack.push(index);



       if(map2.containsKey(index)){
           for(int node:map2.get(index)){
           if(node==parent)
           continue;
           if(set.contains(node)){
               return new Pair(true,node);
           }
           set.add(node);
         Pair<Boolean,Integer>pair=  dfs(node,map2,index);
         if(pair.getKey()) return pair;

       }
       }
       stack.pop();
       return new Pair(false,-1);


   }

}
