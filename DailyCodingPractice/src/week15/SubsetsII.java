package week15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetsII {
	public static void method() {
		int[] arr={1,2,2};
		List<List<Integer>>res=subsetsWithDup(arr);
		for(List<Integer>list:res) {
			for(int i:list) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        Set<List<Integer>>set=new HashSet<>();
        List<List<Integer>>res=new ArrayList<>();
        res.add(new ArrayList<>());
        
        for(int i=1;i<=n;i++){
            rec(res,new ArrayList<>(),0,i,set,nums,0);
        }
        return res;
        
    }
    public static void rec(List<List<Integer>> res,List<Integer>cur,int i,int n, Set<List<Integer>>set,int[] nums,int st){
       
        if(i==n){
            List<Integer>ans=clone(cur);
            List<Integer>d=clone(cur);
            Collections.sort(d);
            if(!set.contains(d)){
                set.add(d);
                
                res.add(ans);
                
            }
        }
         if(st==nums.length)
        return;
        for(int j=st;j<nums.length;j++){

            // String temp=new String(s);
            // s=s+nums[j]+",";
            cur.add(nums[j]);
            rec(res,cur,i+1,n,set,nums,j+1);
            cur.remove(cur.size()-1);
            // s=temp;
            

        }
    }
    public static List<Integer>clone(List<Integer>input){
        List<Integer>res=new ArrayList<>();
        for(int i:input){
            res.add(i);
        }
        return res;
    }
}
