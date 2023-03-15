package hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetImp {
	public static void method() {
		Set<Integer>set=new HashSet<>();
		set.add(23);
		set.add(34);
		set.add(56);
		System.out.println(set);
		for(Integer num:set) {
			System.out.println(num);
		}
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(set.contains(23));
		System.out.println(set.contains(53));
		set.remove(23);
		System.out.println(set);
		set.clear();
		System.out.println(set);
		System.out.println(set.isEmpty());
	}

}
