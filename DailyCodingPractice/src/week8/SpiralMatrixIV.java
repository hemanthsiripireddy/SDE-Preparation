package week8;

import week6.ListNode;

public class SpiralMatrixIV {
	 public static int[][] spiralMatrix(int m, int n, ListNode head) {
	        int[][] res=new int[m][n];
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                res[i][j]=-1;
	            }
	        }
	        int rs=0,re=m-1,cs=0,ce=n-1;
	        int ir=0,ic=0;
	        ListNode node=head;
	        while(node!=null){

	            while(ic<=ce&&node!=null){
	                res[ir][ic++]=node.val;
	                node=node.next;

	            }
	            rs++;
	            ir++;
	            ic--;
	            while(ir<=re&&node!=null){
	                res[ir++][ic]=node.val;
	                node=node.next;
	            }
	            ce--;
	            ic--;
	            ir--;
	            while(ic>=cs&&node!=null){
	                res[ir][ic--]=node.val;
	                node=node.next;
	            }
	            re--;
	            ic++;
	            ir--;
	            while(ir>=rs&&node!=null){
	                res[ir--][ic]=node.val;
	                node=node.next;
	            }
	            cs++;
	            ir++;
	            ic++;


	        }
	        return res;
	        
	    }

}
