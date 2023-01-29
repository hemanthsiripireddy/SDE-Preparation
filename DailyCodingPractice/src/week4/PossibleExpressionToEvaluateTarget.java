package week4;

import java.util.ArrayList;
import java.util.List;

public class PossibleExpressionToEvaluateTarget {
	static List<String>list;
	public static void method() {
		list=new ArrayList<>();
		
		String str="1234";
		int target=10;
		helper(str,"",target,0,0);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("end");
		
	}
	private static void helper(String input, String exp, int target, int curr, int start) {
		// TODO Auto-generated method stub
		if(start==input.length()) {
			if(curr==target) {
				list.add(exp);
			}
		}
		for(int i=start;i<input.length();i++) {
			String s=input.substring(start,i+1);
			int val=Integer.parseInt(s);
			 if(exp.equals("")) {
				 //exp=exp+val;
				 helper(input,exp+val,target,val,i+1);
			 }else {
				 //+
				 helper(input,exp+"+"+val,target,curr+val,i+1);
				 helper(input,exp+"-"+val,target,curr-val,i+1);
				 helper(input,exp+"*"+val,target,curr*val,i+1);
			 }
		}
		
	}
	
	
}
