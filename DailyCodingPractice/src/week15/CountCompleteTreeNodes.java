package week15;

import java.util.LinkedList;
import java.util.Queue;



public class CountCompleteTreeNodes {
	 static int res=0;
	 public static void method() {
		 int[] arr= {1,2,3};
		 TreeNode root=formTree(arr);
		 countNodes(root);
		 System.out.println(res);
	 }
	    public static int countNodes(TreeNode root) {
	        int h=findHeight(root);
	        traversal(root,h);
	        return res;

	        
	    }
	    public static void traversal(TreeNode root,int h){
	        if(root==null)
	        return ;
	        if(root.right!=null){
	            res+=Math.pow(2,h-1)-1;
	            res++;
	            traversal(root.right,h-1);
	        }else{
	            res++;
	            traversal(root.left,h-1);
	        }

	    }
	    public static int findHeight(TreeNode root){
	        if(root==null)
	        return 0;
	        int left=findHeight(root.left);
	        int right=findHeight(root.right);
	        return Math.max(left,right)+1;

	    }
	    public static TreeNode formTree(int[] arr) {
			Queue<TreeNode> queue = new LinkedList<>();
			int i = 0;
			TreeNode root = null;
			while (i < arr.length) {
				if (queue.size() == 0) {
					TreeNode TreeNode = new TreeNode(arr[i++]);
					queue.add(TreeNode);
					root = TreeNode;
				}
				else if (queue.size() != 0) {
					TreeNode TreeNode = queue.poll();
					TreeNode.left = new TreeNode(arr[i++]);
					queue.add(TreeNode.left);
					if (i < arr.length) {
						TreeNode.right = new TreeNode(arr[i++]);
						queue.add(TreeNode.right);

					}

				}
			}
			return root;

		}

}
