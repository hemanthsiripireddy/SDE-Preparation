package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelByLevelTraversal {
	public static void method() {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<Integer> res = new ArrayList<>();
		List<List<Integer>> res1 = new ArrayList<>();
		Node root=formTree(arr);
		addNode(root, 10);
		int nodeValueToBeDeleted=3;
		Node parent=null;
		if(root.data==nodeValueToBeDeleted)
			root=null;
		else {
			 parent=findParent(root,nodeValueToBeDeleted);
			 if(parent.left.data==nodeValueToBeDeleted)
			 parent.left=null;
			 else
			 parent.rigth=null;
			
		}
		
		levelByLevelTraversal2(root,res1);
//		for(int i=0;i<res.size();i++) {
//			System.out.print(res.get(i)+" ");
//		}
		for(int i=0;i<res1.size();i++) {
			for(int j=0;j<res1.get(i).size();j++) {
				System.out.print(res1.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}

	

	private static Node findParent(Node root, int nodeValueToBeDeleted) {
		// TODO Auto-generated method stub
		return preOrder(root,nodeValueToBeDeleted);
		
	
	}
	



	private static Node preOrder(Node root, int nodeValueToBeDeleted) {
		// TODO Auto-generated method stub
		if(root==null)
			return null;
		if(root.left.data==nodeValueToBeDeleted)
			return root;
		if(root.rigth.data==nodeValueToBeDeleted)
			return root;
		Node left=preOrder(root.left, nodeValueToBeDeleted);
		Node rigth=preOrder(root.rigth, nodeValueToBeDeleted);
		if(left!=null)
			return left;
		return rigth;
		
			
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
	public static void levelByLevelTraversal2(Node root,List<List<Integer>>list) {
		Queue<Node>queue=new LinkedList<>();
		queue.add(root);
		while(queue.size()!=0) {
			int size=queue.size();
			List<Integer>res=new ArrayList<>();
			while(size-->0) {
				Node node=queue.poll();
				res.add(node.data);
				if(node.left!=null)
				queue.add(node.left);
				if(node.rigth!=null)
				queue.add(node.rigth);
			}
			list.add(res);
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
	public static Node addNode(Node root,int num) {
		if(root==null) {
			root=new Node(num);
			return root;
		}
		Queue<Node>queue=new LinkedList<>();
		queue.add(root);
		while(queue.size()!=0) {
			Node node=queue.poll();
			if(node.left==null)
			{
				node.left=new Node(num);
				return root;
			}else {
				queue.add(node.left);
			}
			if(node.rigth==null)
			{
				node.rigth=new Node(num);
				return root;
			}else {
				queue.add(node.rigth);
			}
		}
		return root;
		
	}

}
