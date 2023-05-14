package week17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromePartitioningII {
	public static void method() {
		String s="aaabaa";
		int res=minCut(s);
		System.out.println(res);
		
	}
	public static int minCut(String s) {
        int minCuts=s.length()-1;
       return helper(s,0,s.length()-1);
        //return minCuts;
        
    }

    public static int helper(String s,int start,int end){
         List<Pair>list=new ArrayList<>();
        for(int i=start;i<=end;i++){
           
            list.addAll(find(s,i,i));
            if(i+1<=end&&s.charAt(i)==s.charAt(i+1)){
                list.addAll(find(s,i,i+1));
            }



        }
        Collections.sort(list,(p1,p2)->{
            if(p1.start==p2.start){
                return p2.length-p1.length;
            }
            return p1.start-p2.start;
        });
         
         return som(list,end,-1,0)-1;

    }
    public static List<Pair> find(String s,int start,int end){
    	List<Pair>list=new ArrayList<>();
    	list.add(new Pair(start,end));
        while(start-1>=0&&end+1<s.length()&&s.charAt(start-1)==s.charAt(end+1)){
            start=start-1;
            end=end+1;
            list.add(new Pair(start,end));
        

        }
        return list;
    }
    public static int som(List<Pair>list,int end,int end1,int start1) {
    	if(end1==end)
    		return 0;
    	int minCuts=Integer.MAX_VALUE;
      //  int end1=list.get(0).end;
       int i=start1;
        while(i<list.size()&&list.get(i).start<=end1+1) {
        	if(list.get(i).start<end1+1) {
        		i++;
        		continue;
        	}
        	minCuts=Math.min(1+som(list,end,list.get(i).end,i+1), minCuts);
        	i++;
        	
        }
        return minCuts;
//eegiicgaeadbcfacfhifdbiehbgejcaeggcgbahfcajfhjjdgj
        
    }

}
