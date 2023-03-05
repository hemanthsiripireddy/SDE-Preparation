package pac;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
	public static void method() {
		String s="PAHNAPLSIIGYIR";
		String res=convert(s, 2);
		System.out.println(res);
	}
	public static String convert(String s, int numRows) {
        List<List<Character>>list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            list.add(new ArrayList<>());
        }
        int it=0;
      while(it<s.length()) {
    	  for(int i=0;i<numRows;i++){
              if(it<s.length()){
                  list.get(i).add(s.charAt(it++));
              }else{
                  break;
              }
          }
          for(int i=numRows-2;i>0;i--){
              if(it<s.length()){
                  list.get(i).add(s.charAt(it++));
              }else{
                  break;
              }
          }
      }
        String res="";
        for(List<Character>l:list){
            for(Character ch:l){
                res=res+ch+"";

            }
        }
        return res;
        
    }

}
