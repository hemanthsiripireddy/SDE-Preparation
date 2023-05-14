package week18;

import java.util.List;

public class FindKClosestElementsImp {
	public static void method() {
		int[] arr= {1,2,3,4,5};
		int k=4;
		int x=3;
				
		FindKClosestElements e=new FindKClosestElements();
	List<Integer>res=	e.findClosestElements(arr, k, x);
	for(int i:res) {
		System.out.print(i+" ");
	}
		
	}

}
