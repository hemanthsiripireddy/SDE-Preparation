package bitManupulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public static void method() {
		String[] str= {"list","slit","pool","cat","tac","atc","loop"};
		List<List<String>>res=groupAnagrams(str);
		System.out.println(res);
		
	}
	public static List<List<String>> groupAnagrams(String[] str){
		Map<String,List<String>>map=new HashMap<>();
		for(String s:str) {
			int[] count=new int[26];
			for(int i=0;i<s.length();i++) {
				count[s.charAt(i)-'a']++;
			}
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<26;i++) {
				sb.append(count[i]);
			}
			String fs=sb.toString();
			if(!map.containsKey(fs)) {
				map.put(fs, new ArrayList<>());
			}
			map.get(fs).add(s);
		}
		
		return new ArrayList<>(map.values());
		
	}

}
