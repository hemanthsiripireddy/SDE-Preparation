package week13;

public class DecodedStringatIndex {
	public static void method() {
		String res = decodeAtIndex("l3mtm5weq7ki78c7hck4", 165511);
		System.out.println(res);
		System.out.println("hoo");
	}

	public static String decodeAtIndex(String s, int k) {
		int res = 0;
		while (true) {
			res = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
					int num = Integer.parseInt(s.charAt(i) + "");
					int curs = res;
					for (int j = 0; j < num - 1; j++) {
						res = curs + res;
						if (res >= k) {
							break;

						}

					}
					if (res >= k) {
						if (res - curs == 0) {
							k = 0;
							break;
						}
						k = (k) % (res - curs);
						break;
					}
					//res = res * num;

				} else {

					res++;
					if (res >=k)
						return s.charAt(i) + "";

				}
			}
			
		}
		//return "helo";

	}

}
