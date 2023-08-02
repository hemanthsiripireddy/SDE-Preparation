package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
	public static void method()
	{
		String paragraph="Bob. hIt, baLl";
		String banned[]= {"bob", "hit"};
		String res= mostCommonWord(paragraph, banned);
		System.out.println(res);
	}
	public static String mostCommonWord(String paragraph, String[] banned) {
        Set<String>set=new HashSet<>(Arrays.asList(banned));
       // return "";
       Map<String,Integer>map=new HashMap<>();
        String[] list=paragraph.split("[.;!?', ]");
       //for()
        int max=0;
        String res="";
        for(String str:list ){
            String temp=str.toLowerCase();
            if(!set.contains(temp)&&!temp.isBlank()){
                map.put(temp,map.getOrDefault(temp,0)+1);
                if(max<map.get(temp)){
                    max=map.get(temp);
                    res=temp;
                }
            }
        }
        return res;
        
        
    }

}
