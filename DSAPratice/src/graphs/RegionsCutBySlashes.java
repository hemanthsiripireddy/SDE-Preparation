package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RegionsCutBySlashes {
	public static void method() {
		String[] grid= {" /","/ "};
		int res=regionsBySlashes(grid);
		System.out.println(res);
	}
	 public static int regionsBySlashes(String[] grid) {
	        int n=grid.length;
	        int or=0;
	        int oc=0;
	        
	        Map<String,List<String>>map=new HashMap<>();
	        map.put(0+" "+0,new ArrayList<>());
	        for(int c=1;c<=n;c++){
	            String s=(or)+" "+c;
	            String p=(or)+" "+(c-1);
	            map.put(p,map.getOrDefault(p,new ArrayList<>()));
	            map.put(s,map.getOrDefault(s,new ArrayList<>()));
	            map.get(p).add(s);
	             map.get(s).add(p);
	            

	        }
	        oc=n;
	        for(int r=1;r<=n;r++ ){
	             String s=(r)+" "+oc;
	            String p=(r-1)+" "+(oc);
	            map.put(p,map.getOrDefault(p,new ArrayList<>()));
	            map.put(s,map.getOrDefault(s,new ArrayList<>()));
	            map.get(p).add(s);
	             map.get(s).add(p);

	        }
	        or=n;
	        for(int c=n-1;c>=0;c--){
	            String s=(or)+" "+c;
	            String p=(or)+" "+(c+1);
	            map.put(p,map.getOrDefault(p,new ArrayList<>()));
	            map.put(s,map.getOrDefault(s,new ArrayList<>()));
	            map.get(p).add(s);
	             map.get(s).add(p);

	        }
	        oc=0;
	        for(int r=n-1;r>=0;r--){
	            String s=(r)+" "+oc;
	            String p=(r+1)+" "+(oc);
	            map.put(p,map.getOrDefault(p,new ArrayList<>()));
	            map.put(s,map.getOrDefault(s,new ArrayList<>()));
	            map.get(p).add(s);
	             map.get(s).add(p);

	        }
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                if(grid[i].charAt(j)=='\\'){
	                    String s=i+" "+j;
	                    String p=(i+1)+" "+(j+1);
	                    map.put(p,map.getOrDefault(p,new ArrayList<>()));
	            map.put(s,map.getOrDefault(s,new ArrayList<>()));
	            map.get(p).add(s);
	             map.get(s).add(p);

	                }else if(grid[i].charAt(j)=='/'){
	                     String s=i+" "+(j+1);
	                    String p=(i+1)+" "+(j);
	                    map.put(p,map.getOrDefault(p,new ArrayList<>()));
	            map.put(s,map.getOrDefault(s,new ArrayList<>()));
	            map.get(p).add(s);
	             map.get(s).add(p);

	                }
	            }
	        }
	        int res=0;
	        Set<String>set=new HashSet<>();
	        for(String str:map.keySet()){
	            if(set.add(str)){
	                res+=compute(str,map,set,"");
	            }
	        }
	        return res;

	        
	    }
	    public static int compute(String str,Map<String,List<String>>map,Set<String> set,String parent){
	        int res=0;
	          
	          for(String cur:map.get(str)){
	              if(cur.equals(parent))
	              continue;

	              if(set.contains(cur))res++;
	              else {
	                  set.add(cur);
	                  res+=compute(cur,map,set,str);
	              }
	          }
	          return res;

	    }

}
