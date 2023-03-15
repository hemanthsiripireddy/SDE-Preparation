package hashing;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetImp {
	public static void method() {
		Set<Integer>set=new HashSet<>();
		set.add(23);
		set.add(34);
		set.add(56);
		TreeSet<Integer> ts=new TreeSet(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
			
		});
		ts.addAll(set);
		System.out.println(ts);
		ts.add(100);
		System.out.println(ts.subSet(99, 12));
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.higher(101));
		
	}

}
