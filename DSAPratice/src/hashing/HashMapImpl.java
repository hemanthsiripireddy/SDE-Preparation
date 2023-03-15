package hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapImpl {
	public static void method() {
		Map<String,Integer>map=new HashMap<>();
		map.put("pen", 30);
		map.put("books",90);
		map.put("bag1",170);
		System.out.println(map.put("bag",45));
		System.out.println(map.put("bag", 23));
		System.out.println(map.get("bag"));
		System.out.println(map.getOrDefault("bulb", 5));
		System.out.println(map.containsKey("bag"));
		System.out.println(map.containsValue(45));
		for(String key:map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
	}

}
