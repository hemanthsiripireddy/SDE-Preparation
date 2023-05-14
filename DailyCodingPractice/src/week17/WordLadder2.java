package week17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class WordLadder2 {
	public static void method() {
		List<String> wordList=Arrays.asList("hot","dot","dog","lot","log","cog");
		
		
		String beginWord="hit";
		String endWord="cog";
		List<List<String>>res=findLadders(beginWord, endWord, wordList);
		for(List<String> l:res) {
			for(String s:l)
				System.out.print(s+" ");
			System.out.println();
		}
		
		
	}
	 public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
	        List<List<String>>res=new ArrayList<>();
	        Map<String,Set<String>>map=new HashMap<>();
	        Set<String>wordSet=new HashSet<>(wordList);
	        Queue<String>queue=new LinkedList<>();
	        Set<String>next=new HashSet<>();
	        wordSet.remove(beginWord);
	        queue.add(beginWord);
	        boolean findEnd=false;
	        while(!queue.isEmpty()){
	            String word=queue.poll();
	            for(String str:wordSet){
	                if(isLadder(word,str)){
	                    if(str.equals(endWord))
	                    findEnd=true;

	                    if(!map.containsKey(str)){
	                        map.put(str,new HashSet<>());
	                    
	                }
	                map.get(str).add(word);
	                next.add(str);
	            }
	            }
	            if(queue.isEmpty()){

	                if(findEnd)break;

	                queue.addAll(next);
	                wordSet.removeAll(next);
	                next.clear();
	            }

	        }
	        if(!findEnd)return res;
	        List<String>list=new ArrayList<>();
	        list.add(endWord);
	        path(res,map,list,endWord);
	        return res;
	        
	    }
	    public static void path(List<List<String>>res,Map<String,Set<String>>map,List<String>list,String word){
	        if(map.containsKey(word)){
	            Set<String>set=map.get(word);
	            for(String str:set){
	                list.add(str);
	                path(res,map,list,str);
	                list.remove(list.size()-1);
	            }

	        }else{
	            List<String>ans=new ArrayList<>(list);
	            Collections.reverse(ans);
	            res.add(ans);
	        }
	    }

	    public static boolean isLadder(String word1,String word2){
	        int dif=0;
	        for(int i=0;i<word1.length();i++){
	            if(word1.charAt(i)!=word2.charAt(i))
	            dif++;
	            if(dif>1) return false;

	        }
	        return dif==1;
	    }
}
