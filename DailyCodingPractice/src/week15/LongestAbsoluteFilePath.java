package week15;

import java.util.Stack;

public class LongestAbsoluteFilePath {
	public static void method() {
		String input="dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
		int res=lengthLongestPath(input);
		System.out.println(res);
				
		
	}
	public static int lengthLongestPath(String input) {
		Stack<Integer> stack = new Stack<>();
		int i = 0, l = 0, res = 0, cur = 0;
		int start = i;
		while (i < input.length()) {
			boolean isDir = true;
			start = i;
			while (i < input.length() && input.charAt(i) != '\n'&&input.charAt(i) != '\t') {
				if (input.charAt(i) == '.') {
					i++;

					isDir = false;
					while (i < input.length() && input.charAt(i) != '\n'&&input.charAt(i) != '\t')
						i++;
					res = Math.max(res, cur + (i - start));
					break;
				}
				i++;

			}
			if (isDir) {
				stack.push(i - start + 1);

				cur += (i - start + 1);
			}
			if (i < input.length() && input.charAt(i ) == '\n') {
				l = 0;
				i = i + 1;
				while (i  < input.length() && input.charAt(i ) == '\t') {
					i = i + 1;
					l++;
				}
				while (l != stack.size()) {
					cur -= stack.pop();
				}

			}

		}
		return res;

	}

}
