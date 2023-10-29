package recursion;

import java.util.HashMap;
import java.util.Map;

public class ZumaGame488 {
	public static void main(String[] args) {
		int res=findMinStep("RRWWRRBBRR", "WB");
		System.out.println(res);
		
	}
	public static int findMinStep(String board, String hand) {

        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<hand.length();i++){
            char ch=hand.charAt(i);
            
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
       int res= compute(board,map);
       if(res==100)
        return -1;
        return res;
    }
    public static int compute(String str,Map<Character,Integer>map){
          str=cleanUp(str);

        if(str.isEmpty()||str.equals(""))
        return 0;
        char ch=str.charAt(0);
        int count=1;
        int res=100;
      
        for(int i=1;i<str.length();i++){
            if(ch==str.charAt(i)){
                //aaaa
                count++;
            }else{
                if(count+map.getOrDefault(ch,0)>=3){
                    int intialCount=map.get(ch);
                    int remain=3-count;
                    String ns=str.substring(0,i-count)+str.substring(i);
                    map.put(ch,map.get(ch)-remain);
                     int cur=compute(ns,map);
                    if(cur!=100)
                     res=Math.min(res,cur+remain);
                     map.put(ch,intialCount);
                }
                ch=str.charAt(i);
                 count=1;
            }

        }
        if(count+map.getOrDefault(ch,0)>=3){
                    int intialCount=map.get(ch);
                    int remain=3-count;
                    String ns=str.substring(0,str.length()-count);
                    map.put(ch,map.get(ch)-remain);
                     int cur=compute(ns,map);
                    if(cur!=100)
                     res=Math.min(res,cur+remain);
                     map.put(ch,intialCount);
                }
                return res;
        

    }
    public static String cleanUp(String str){

        String ns=str;

        while(!ns.isEmpty()){
            boolean b=false;
            int i=1;

             String temp=ns;
           
            char ch=temp.charAt(0);
            int count=1;
           
          
            while(i<temp.length()){
                if(ch==temp.charAt(i))
                count++;
                else{
                    if(count>=3){
                         ns=temp.substring(0,i-count)+temp.substring(i);
                         b=true;
                         break;


                    }
                    ch=temp.charAt(i);
                    count=1;
                }
                i++;
                if(i==temp.length()&&count>=3){
                      ns=temp.substring(0,i-count)+temp.substring(i);
                         b=true;


                }
                

            }
           
            if(b==false)
            break;

        }
        return ns;

    }

}
