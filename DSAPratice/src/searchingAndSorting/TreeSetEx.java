package searchingAndSorting;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		int res=-1;
		if(ts.ceiling(4)!=null)
			res=ts.ceiling(4);
		
		System.out.println(res);

	}

}
