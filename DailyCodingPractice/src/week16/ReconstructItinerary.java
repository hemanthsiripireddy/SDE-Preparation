package week16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReconstructItinerary {
	List<String>res=new ArrayList<>();
    public List<String> findItinerary(List<List<String>> tickets) {

        int numberOfTickets=tickets.size();
        Map<String,List<String>>map=new HashMap<>();
        for(List<String>list:tickets){
            if(!map.containsKey(list.get(0))){
                map.put(list.get(0),new ArrayList<String>());
            }
            map.get(list.get(0)).add(list.get(1));
        }
        for(List<String>list:map.values()){
            Comparator c1=new Comparator<String>() {
			public int compare(String s1,String s2) {
				
				if(s1.compareTo(s2)>0)
					return -1;
				else
					return 1;
			}
		};
        Collections.sort(list,c1);
        }
       // List<String>res=new ArrayList<>();
        String cur="JFK";
        res.add(cur);
        // while(true){
        //     res.add(cur);
        //     List<String>temp=map.get(cur);
        //     if(temp==null||temp.size()==0)
        //     break;
        //     cur=temp.get(temp.size()-1);
        //     temp.remove(temp.size()-1);
        // }
        rec(map,numberOfTickets,0,cur);
        return res;

        
    }
    public boolean rec(Map<String,List<String>>map,int size,int count,String cur){

           // res.add(cur);
            List<String>temp=map.get(cur);
            if(temp==null||temp.size()==0){
                if(count==size)
                return true;
                return false;

            }
           
            for(int i=temp.size()-1;i>=0;i--){
                cur=temp.get(i);
                res.add(cur);
              String r=  temp.remove(i);
              boolean ans=rec(map,size,count+1,cur);
              if(ans==true)
              return true;
              else{
                  res.remove(res.size()-1);
                  if(i==temp.size()){
                      temp.add(r);
                  }else
                  temp.set(i,r);

              }

            }
            if(count==size)
            return true;
            return false;
            

        


    }

}
