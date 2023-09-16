package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShortestStringThatContainsThreeStrings {
	public static void main(String[] args) {
		String a="abc";
		String b="bca";
		String c="aaa";
		minimumString(a, b, c);
				
	}
	public static  String minimumString(String a, String b, String c) {
		List<String> res = new ArrayList<>();
		List<String> input = new ArrayList<>();
		input.add(a);
		input.add(b);
		input.add(c);
		Collections.sort(res, (a1, b1) -> {
			if (a1.length() != b1.length())
				return a1.length() - b1.length();
			return a1.compareTo(b1);
		});
		Set<Integer> visited = new HashSet<>();

		compute(new StringBuilder(), input, res, visited);
		for(int i=0;i<res.size();i++) {
			System.out.println(res.get(i));
		}
		return res.get(0);

	}

	public static  void compute(StringBuilder sb, List<String> input, List<String> res, Set<Integer> set) {
		if (set.size() == 3) {
			String ans = sb.toString();
			res.add(ans);
			return;
		}
		if (set.size() == 0) {
			for (int i = 0; i < 3; i++) {
				sb.append(input.get(i));
				set.add(i);
				compute(sb, input, res, set);
				set.remove(i);
				sb.delete(0, input.get(i).length());

			}

		} else {
			for (int i = 0; i < 3; i++) {
				if (!set.contains(i)) {
					set.add(i);
					if (input.get(i).length() > sb.length()) {
						String remain = input.get(i);
						for (int j = 0; j < sb.length(); j++) {
							int length = sb.length() - j;
							String str = sb.substring(j, sb.length());
							if (input.get(i).startsWith(str)) {
								remain = input.get(i).substring(sb.length() - j);
								break;

							}
						}
						int start = sb.length();

						sb.append(remain);
						compute(sb, input, res, set);
						sb.delete(start, sb.length());
					} else {
						String du = sb.toString();
						if (du.contains(input.get(i))) {
							compute(sb, input, res, set);
						} else {
							String remain = input.get(i);
							int start = sb.length() - input.get(i).length();
							for (int j = start; j < sb.length(); j++) {
								String sub = sb.substring(j, sb.length());
								if (input.get(i).startsWith(sub)) {
									int s = sub.length();
									remain = input.get(i).substring(s);
									break;
								}

							}
							start = sb.length();
							sb.append(remain);
							compute(sb, input, res, set);
							sb.delete(start, sb.length());
						}

					}
					set.remove(i);
				}
			}
		}

	}
	 
	

}
