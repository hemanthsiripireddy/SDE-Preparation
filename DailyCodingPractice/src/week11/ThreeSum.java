package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	public static void method() {
		int[] nums= {-1,0,1,2,-1,-4};
		List<List<Integer>>res=threeSum(nums);
		for(int i=0;i<res.size();i++) {
			for(int j=0;j<res.get(0).size();j++) {
				System.out.print(res.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
	}
	public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>set=new HashSet<>();
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
           
            int target=-nums[i];
            int start=i+1,end=nums.length-1;
            while(start<end){
               
                if(nums[start]+nums[end]==target){
                    List<Integer>l=new ArrayList<>();
                    l.add(nums[i]);
                     l.add(nums[start]);
                      l.add(nums[end]);
                   // l.addAll(nums[i],nums[start],nums[end]);
                   if(set.add(l))
                   res.add(l);
                    start++;
                    end--;
                    
                }else if(nums[start]+nums[end]>target){
                    end--;
                }else
                start++;
            }
        }
        return res;
        
    }

}
