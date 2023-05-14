package week13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JewelsandStones {
	public int numJewelsInStones(String jewels, String stones) {
        Set<Character>set=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            set.add(jewels.charAt(i));
        }
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int res=0;
        for(char ch:set){
            res+=map.getOrDefault(ch,0);

        }
        
        return res;
    }

}
