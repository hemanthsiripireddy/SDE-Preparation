package trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FormTreeFromAList {
	public static TreeNode build(int[] arr) {
		TreeNode root=new TreeNode(arr[0]);
		Queue<TreeNode>queue=new LinkedList<>();
		queue.add(root);
		int i=1;
		while(queue.size()!=0&&i<arr.length) {
			TreeNode cur=queue.poll();
			if(i<arr.length) {
				int val=arr[i++];
				if(val!=-1)
				{
					cur.left=new TreeNode(val);
					queue.add(cur.left);
				}
			}
			if(i<arr.length) {
				int val=arr[i++];
				if(val!=-1)
				{
					cur.right=new TreeNode(val);
					queue.add(cur.right);
				}
				
			}
		}
		return root;
	}

}
