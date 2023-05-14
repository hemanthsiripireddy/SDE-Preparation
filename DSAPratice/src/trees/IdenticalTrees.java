package trees;

import java.util.LinkedList;
import java.util.Queue;

public class IdenticalTrees {
	public static void method() {
		int[] arr1 = new int[] {  2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr2 = new int[] {  2, 3, 4, 5, 6, 7, 8, 9};
		Node root1=formTree(arr1);
		Node root2=formTree(arr2);
		boolean res=findIdentity(root1,root2);
		System.out.println(res);
	}

	private static boolean findIdentity(Node root1, Node root2) {
		// TODO Auto-generated method stub
		if(root1==null&&root2==null)
			return true;
		if(root1==null||root2==null||root1.data!=root2.data)
			return false;
		return findIdentity(root1.left, root2.left)&&findIdentity(root1.rigth, root2.rigth);
	
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
				node.left = new Node(arr[i++]);
				queue.add(node.left);
				if (i < arr.length) {
					node.rigth = new Node(arr[i++]);
					queue.add(node.rigth);

				}

			}
		}
		return root;

	}

}
