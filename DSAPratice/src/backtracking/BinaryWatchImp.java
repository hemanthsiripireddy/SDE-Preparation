package backtracking;

import java.util.List;

public class BinaryWatchImp {
	public static void method() {
		int n=2;
		BinaryWatch b=new BinaryWatch();
		List<String>res=b.readBinaryWatch(n);
		int i=0;
		for(String s:res) {
			System.out.print(s+" ");
			i++;
			if(i%5==0)
				System.out.println();
		}
	}

}
