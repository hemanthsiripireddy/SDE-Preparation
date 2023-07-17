package orderedSet;

import java.util.TreeSet;

import graphs.Pair;



public class MyCalendarI {
	TreeSet<Pair<Integer,Integer>>ts;

    public MyCalendarI() {
        ts=new TreeSet<>((p1,p2)->{
            return p1.getKey()-p2.getKey();
        });
        
    }
    
    public boolean book(int start, int end) {
    	  Pair<Integer,Integer> pair=new Pair(start+1,end);
          Pair<Integer,Integer> cei=ts.ceiling(pair);
          Pair<Integer,Integer>flo=ts.floor(pair);

        if(cei!=null&&flo!=null) {
        	if(end<=cei.getKey()&&start>=flo.getValue()){
                ts.add(new Pair(start,end));
                return true;
            }
          return  false;
        	
        }else
        	
        	if(cei==null&&flo==null){
             ts.add(new Pair(start,end));
             return true;
         }else if(cei!=null){
             if(end<=cei.getKey()){
                 ts.add(new Pair(start,end));
                 return true;
             }
           return  false;

         }else{
             if(start>=flo.getValue()){
                 ts.add(new Pair(start,end));
                 return true;
             }
             return false;

         }
        
    }

}
