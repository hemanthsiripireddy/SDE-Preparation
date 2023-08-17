package math;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctPrimeFactorsofProductofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,14,19,19,5,13,18,10,15,20};
		int res=distinctPrimeFactors(nums);
		System.out.println(res);

	}
	public static int distinctPrimeFactors(int[] nums) {
        int product=1;
       
       boolean[] primes=new boolean[1000+1];
       for(int i=2;i<primes.length;i++){
           primes[i]=true;
       }
       
       List<Integer>p=new ArrayList<>();
       Set<Integer>set=new HashSet<>();
       for(int i=2;i<primes.length;i++){
           if(primes[i]){
               p.add(i);
               
               for(int j=i+i;j<primes.length;j=j+i){
                   primes[j]=false;


               }
           }
       }
       int s=p.size();
       int i=0;
       int res=0;
       for( i=0;i<nums.length;i++){
           int val=nums[i];
           int j=0;
           while(val!=1){
               int pn=p.get(j++);

               while(val!=1&&val%pn==0){
                   set.add(pn);
                   val/=pn;
               }
               

           }
       }
       return set.size();


        
    }
}
