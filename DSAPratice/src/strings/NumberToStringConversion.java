package strings;

public class NumberToStringConversion {
	static StringBuilder sb=new StringBuilder();
	public static String numberToWords(int num) {
		if(num==0)
		return "Zero";
		 compute(num);
		 return new String(sb).trim();

	}

	public static void compute(int num) {
		int[] arr = { 1000000000, 1000000, 1000, 100, 10 };
		String[] oneto19 = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
				"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
		String[] twentyTo90 = { "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty" };

		if (num == 0)
			return ;
		if (num / arr[0] >= 1) {
			compute(num / arr[0]);
			sb.append(" Billion");
			compute(num % arr[0]);
			
			
			
		} else if (num / arr[1] >= 1) {
			compute(num / arr[1]);
			sb.append(" Million");
			compute(num % arr[1]);
			
			
			
		} else if (num / arr[2] >= 1) {
			compute(num / arr[2]);
			sb.append(" Thousand");
			compute(num % arr[2]);
			
			
		} else if (num / arr[3] >= 1) {
			compute(num / arr[3]);
			sb.append(" Hunderad");
			compute(num % arr[3]);
			
			
		} else if (num / arr[4] >= 2) {
			int n = num / arr[4] - 2;
			sb.append(" "+twentyTo90[n]);
			 compute(num % arr[4]);
			
		} else {
			sb.append(" "+oneto19[num]);
			
		}
	}

}
