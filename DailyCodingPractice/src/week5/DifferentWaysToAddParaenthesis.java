package week5;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParaenthesis {
	public static void method() {
		String exp="2*3-4*5";
		List<Integer>ans=helper(exp);
		
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
		}
	}
	public static List<Integer> helper(String exp) {

		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);
			if (ch == '+' || ch == '-' || ch == '*') {
				String exp1 = exp.substring(0, i);
				String exp2 = exp.substring(i + 1);
				List<Integer> res1 = helper(exp1);
				List<Integer> res2 = helper(exp2);
				for (int j = 0; j < res1.size(); j++) {
					for (int k = 0; k < res2.size(); k++) {
						switch (ch) {
						case '+':
							res.add(res1.get(j) + res2.get(k));

							break;
						case '-':
							res.add(res1.get(j) - res2.get(k));
							break;
						case '*':
							res.add(res1.get(j) * res2.get(k));
							break;

						}
					}
				}
			}
		}
		if (res.size() == 0)
			res.add(Integer.valueOf(exp));
		return res;

	}

}
