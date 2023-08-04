package main;

public class SquareBrackerToCurlyBrackets {
	public static String covert(String str) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='[') {
				sb.append("{");
			}else if(str.charAt(i)==']') {
				sb.append("}");
			}else {
				sb.append(str.charAt(i)+"");
			}
		}
		return new String(sb);
	}

}
