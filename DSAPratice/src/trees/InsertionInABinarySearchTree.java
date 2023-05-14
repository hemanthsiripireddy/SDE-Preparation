package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InsertionInABinarySearchTree {
	public static void method() {
		int[] arr= {1,0,-1,2,3,4,5};
		Node root=null;
		for(int i=0;i<arr.length;i++)
		root=insert( root,arr[i]);
		List<Integer>res=new ArrayList<>();
		levelByLevelTraversal(root, res);
		for(int i:res) {
			System.out.print(i+" ");
		}
				
		
	}

	private static Node insert(Node root,int key) {
		// TODO Auto-generated method stub
		if(root==null)
			return new Node(key);
		if(key<root.data)
			root.left=insert(root.left,key);
		else
		root.rigth=	insert(root.rigth,key);
		return root;
	}
	public static void levelByLevelTraversal(Node root,List<Integer>list) {
		Queue<Node>queue=new LinkedList<>();
		queue.add(root);
		while(queue.size()!=0) {
			Node node=queue.poll();
			list.add(node.data);
			if(node.left!=null)
			queue.add(node.left);
			if(node.rigth!=null)
			queue.add(node.rigth);
		}

	}

}
