package trees;

import java.util.LinkedList;
import java.util.Queue;

public class FlattenBinaryTreetoLinkedList {
	public static void method() {
		int[] arr= {4,2,6,1,3,5,7};
		Node root=formTree(arr);
		Pair pair=rec(root);
		root=pair.head;
		while(root!=null) {
			System.out.print(root.data+" ");
			root=root.rigth;
		}
	}
	public  static Pair rec(Node root) {
		if (root.left == null && root.rigth == null)
			return new Pair(root, root);
		if (root.left == null) {
			Pair right = rec(root.rigth);
			return new Pair(root, right.tail);

		} else if (root.rigth == null) {
			Pair left = rec(root.left);
			root.left = null;
			root.rigth = left.head;
			return new Pair(root, left.tail);
		} else {
			Pair left = rec(root.left);
			Pair right = rec(root.rigth);
			root.left = null;
			root.rigth = left.head;
			left.tail.rigth = right.head;
			return new Pair(root, right.tail);
		}

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
