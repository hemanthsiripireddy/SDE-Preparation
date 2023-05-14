package trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximunSumPathFromRoot {
	public static void method() {
		int[] arr= {1,2,3,4,5,-1,-1,-1,-1,6};
		 
		Node root=formTree(arr);
		int res=maximumSumPath(root);
		System.out.println(res);
		
	}
	public static int maximumSumPath(Node node) {
		if(node==null)
			return 0;
		int left=maximumSumPath(node.left);
		int right=maximumSumPath(node.rigth);
		return Math.max(left, right)+node.data;
	}
	public static Node formTree(int[] arr) {
		Queue<Node> queue = new LinkedList<>();
		int i = 0;
		Node root = null;
		while (i < arr.length) {
			if (queue.size() == 0) {
				Node node = new Node(arr[i++]);
				queue.add(node);
				root = node;
			}
			else if (queue.size() != 0) {
				Node node = queue.poll();
				if(arr[i]!=-1) {
					node.left = new Node(arr[i++]);
					queue.add(node.left);
					
				}else {
					i++;
				}
				
				if (i < arr.length) {
					if(arr[i]!=-1) {
						node.rigth = new Node(arr[i++]);
						queue.add(node.rigth);
						
					}else
						i++;
					

				}

			}
		}
		return root;

	}

}
