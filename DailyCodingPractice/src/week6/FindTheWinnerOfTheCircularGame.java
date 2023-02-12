package week6;

import java.util.ArrayList;
import java.util.List;

public class FindTheWinnerOfTheCircularGame {
	public static void method() {
		int n=5,k=2;
		int ans=findTheWinner(n,k);
		System.out.println(ans);
	}
	 public static int findTheWinner(int n, int k) {
	        List<Integer>list=new ArrayList<>();
	        for(int i=1;i<=n;i++){
	            list.add(i);
	        }
	        int post=0;
	        while(list.size()!=1){
	            int r=(post+k-1)%list.size();
	            list.remove(r);
	           if(r==list.size())
	           post=0;
	           else
	           post=r;


	        }
	        return list.get(0);
	    }

}
