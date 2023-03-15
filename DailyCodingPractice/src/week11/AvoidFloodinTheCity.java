package week11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class AvoidFloodinTheCity {
	 public int[] avoidFlood(int[] rains) {
	        int[] res=new int[rains.length];
	        Map<Integer,Integer>lakeFullDay=new HashMap<>();
	        TreeSet<Integer>dryDays=new TreeSet<>();
	        int index=0;
	        for(int i=0;i<rains.length;i++){
	            if(rains[i]==0){
	                res[index++]=1;
	                dryDays.add(i);
	            }else{
	                if(lakeFullDay.containsKey(rains[i])){
	                    Integer day=dryDays.higher(lakeFullDay.get(rains[i]));
	                    if(day==null)
	                    return new int[]{};
	                    res[day]=rains[i];
	                    dryDays.remove(day);
	                }
	                lakeFullDay.put(rains[i],i);
	                res[index++]=-1;
	            }
	        }
	        return res;
	        
	    }

}
