package searchingAndSorting;

import java.util.ArrayList;
import java.util.List;

public class MaxChunksToMakeSorted {
	public static void method() {
		int[] arr= {2,0,1};
		int res=maxChunksToSorted(arr);
		System.out.println(res);
	}
	public static int maxChunksToSorted(int[] arr) {

		 int i=0;
	        int exp=0;
	        List<Integer>list=new ArrayList<>();
	        int res=0;
	        while(i<arr.length){
	            if(list.size()==0){
	                list.add(arr[i++]);
	            }else if(list.get(list.size()-1)<arr[i]){
	                list.add(arr[i++]);
	            }else{
	                int index=list.size()-1;
	                while(true) {
	                	if(index==0) {
	                		if(arr[i]<list.get(index)) {
	                			list.add(index,arr[i++]);
		                		break;
	                			
	                		}else {
	                			
	                		}
	                		
	                	}else if(list.get(index-1)<arr[i]&&list.get(index)>arr[i]) {
	                		list.add(index,arr[i++]);
	                		break;
	                	}else {
	                	
	                		
	                	}
	                	index++;
	                		
	                	
	                }
	               
	            }
	            if(list.get(0)==exp&&(list.get(list.size()-1)-exp+1)==list.size()){
	                res++;
	                exp=list.get(list.size()-1)+1;
	                list=new ArrayList<>();
	                
	            }

	        }
	       
	        return res;
    }

}
