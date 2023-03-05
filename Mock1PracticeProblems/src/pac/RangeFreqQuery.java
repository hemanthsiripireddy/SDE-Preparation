package pac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RangeFreqQuery {
	 Map<Integer,List<Integer>>map;

	    public RangeFreqQuery(int[] arr) {
	        map=new HashMap<>();
	       for(int i=0;i<arr.length;i++){
	           List<Integer>l;
	           if(map.containsKey(arr[i])){
	               l=map.get(arr[i]);
	           }else{
	               l=new ArrayList<>();
	               map.put(arr[i],l);
	           }
	           l.add(i);
	       }
	        
	    }
	    
	    public int query(int left, int right, int value) {
	        int l=lowerBound(left,value);
	        int r=upperBound(right,value);
	        if(l==-1||r==-1)
	        return 0;
	        return r-l+1;
	        
	    }
	    private int lowerBound(int left,int value){
	        if(!map.containsKey(value))
	        return -1;
	        List<Integer>list=map.get(value);
	        int start=0,end=list.size()-1;
	        if(left<=list.get(0))
	        return 0;
	        int lb=-1;
	        while(start<=end){
	            int mid=(start+end)/2;
	            if(left<=list.get(mid)){
	                lb=mid;
	                end=mid-1;
	            }else{
	                start=mid+1;
	            }
	        }
	        return lb;
	    }
	    private int upperBound(int right,int value){
	         if(!map.containsKey(value))
	        return -1;
	        List<Integer>list=map.get(value);
	        int start=0,end=list.size()-1;
	       
	        int lb=-1;
	        while(start<=end){
	            int mid=(start+end)/2;
	            if(right>=list.get(mid)){
	                lb=mid;
	                start=mid+1;
	            }else{
	               end=mid-1;
	            }
	        }
	        return lb;
	    }

}
