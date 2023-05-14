package backtracking;

import java.util.Arrays;
import java.util.Collections;

public class MatchstickstoSquare {
	public boolean makesquare(int[] matchsticks) {
        int s=0;
        Arrays.sort(matchsticks);
        int[] m=new int[matchsticks.length];
        int it=matchsticks.length-1;
        for(int val:matchsticks){
            m[it--]=val;
        }
        matchsticks=m;
        for(int i:matchsticks)
        s+=i;
        if(s%4!=0)
        return false;
        int l=s/4;
        int l1=0,l2=0,l3=0,l4=0;
        int i=0;
        while(i<matchsticks.length){
            int flag=0;
            
           if(i<matchsticks.length&&l1+matchsticks[i]<=l){
               l1+=matchsticks[i++];
               flag=1;
           }
            if(i<matchsticks.length&&l2+matchsticks[i]<=l){
               l2+=matchsticks[i++];
               flag=1;
           }
            if(i<matchsticks.length&&l3+matchsticks[i]<=l){
               l3+=matchsticks[i++];
               flag=1;
           }
            if(i<matchsticks.length&&l4+matchsticks[i]<=l){
               l4+=matchsticks[i++];
               flag=1;
           }
           if(flag==0)
           return false;
        }
        if(l1==l&&l2==l&&l3==l&&l4==l)
        return true;
        return false;

        
    }
}
