package week15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;



public class UniqueBinarySearchTreesII {
	public static void method() {
		Set<Integer>set=new HashSet<>();
		int n=3;
		List<TreeNode>res=rec(set,n,1,n);
		for(int i=0;i<res.size();i++) {
			List<Integer>result=levelByLevelTraversal(res.get(i));
			for(int j=0;j<result.size();j++) {
				System.out.print(result.get(j)+" ");
				
			}
			System.out.println();
		}
		
	}
	 public static List<TreeNode> rec(Set<Integer> set,int n,int start,int end){
	        if(set.size()==n)
	        return null;
	        List<TreeNode>res=new ArrayList<>();;
	         for(int i=start;i<=end;i++){
	              
	             if(set.add(i)){
	            	
	                
	                TreeNode temp= new TreeNode(i);
	                 List<TreeNode>left=rec(set,n,start,i-1);
	                 List<TreeNode>right=rec(set,n,i+1,end);
	                 set.remove(i);
	                 if((left==null&&right==null)||(left.size()==0&&right.size()==0)){
	                     res.add(temp);
	                    
	                     continue;
	                 }
	                 if(left==null||left.size()==0){
	                     for(int j=0;j<right.size();j++){
	                         temp=new TreeNode(i);
	                         temp.right=right.get(j);
	                         res.add(temp);
	                     }
	                     continue;
	                 }
	                 if(right==null||right.size()==0){
	                     for(int j=0;j<left.size();j++){
	                         temp=new TreeNode(i);
	                         temp.left=left.get(j);
	                         res.add(temp);
	                     }
	                     continue;
	                 }
	                 for(int j=0;j<left.size();j++){
	                    
	                     for(int k=0;k<right.size();k++){
	                          temp=new TreeNode(i);
	                     temp.left=left.get(j);
	                     temp.right=right.get(k);
	                     res.add(temp);

	                     }
	                 }
	                
	             }
	             
	         }
	         return res;	    }
	 public static void inorder(TreeNode node) {
		 if(node==null)
			 return;
		 inorder(node.left);
		 System.out.println(node.val+" ");
		 inorder(node.right);
	 }
	 public static List<Integer> levelByLevelTraversal(TreeNode root) {
		 List<Integer>list=new ArrayList<>();
			Queue<TreeNode>queue=new LinkedList<>();
			queue.add(root);
			while(queue.size()!=0) {
				TreeNode node=queue.poll();
				list.add(node.val);
				if(node.left!=null)
				queue.add(node.left);
				if(node.right!=null)
				queue.add(node.right);
			}
			return list;

		}

}
