package week14;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateLetters {
	public static void method() {
		String res=removeDuplicateLetters("bcabc");
		System.out.println(res);
	}
	public  static String removeDuplicateLetters(String s) {
		Map<Character, Boolean> map = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				if (map.get(ch) == true) {
					map.remove(ch);
					if (i + 1 < s.length() && ch > s.charAt(i + 1))
						map.put(ch, true);
					else
						map.put(ch, false);

				}

			} else {
				if (i + 1 < s.length() && ch > s.charAt(i + 1))
					map.put(ch, true);
				else
					map.put(ch, false);

			}

		}
		StringBuilder sb = new StringBuilder();
		for (char key : map.keySet()) {
			sb.append(key+"");

		}
		return new String(sb);

	}

}
