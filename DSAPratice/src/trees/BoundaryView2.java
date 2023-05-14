package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BoundaryView2 {
	
	public static void method() {
		//List<Integer> res = new ArrayList<>();
		//1,2,3,4,5,-1,-1,-1,-1,6
		//1 2 -1 -1 3 -1 4 -1 5 -1 6 -1 -1

		int[] arr= {1, 2, -1, -1, 3, -1, 4, -1, 5 ,-1, 6, -1, -1};
		 
		Node root=formTree(arr);
		List<Integer> res =boundaryView(root);
		for(int i=0;i<res.size();i++) {
			System.out.print(res.get(i)+" ");
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
	public static List<Integer> boundaryView(Node root){
		List<Integer>res=new ArrayList<>();
		if(root==null)
			return res;
		
		res.add(root.data);
		
		left(root.left,res);
		leaf(root.left,res);
		leaf(root.rigth,res);
		right(root.rigth,res);
		return res;
		
		
	}
	private static void right(Node node, List<Integer>res) {
		if(node==null)
			return ;
		
		if(node.rigth!=null)
			right(node.rigth,res);
		else
			right(node.left,res);
		if(!isLeaf(node))
			res.add(node.data);
		
		
		
		
	}
	private static void leaf(Node node,  List<Integer> res) {
		// TODO Auto-generated method stub
		if(node==null)
			return;
		if(isLeaf(node))
			res.add(node.data);
		leaf(node.left,res);
		leaf(node.rigth,res);
		
	}
	private static void left(Node  node, List<Integer>res) {
		// TODO Auto-generated method stub
		if(node==null)
			return ;
		if(!isLeaf(node))
			res.add(node.data);
		if(node.left!=null)
			left(node.left,res);
		else
			left(node.rigth,res);
		
		
	}
	private static boolean isLeaf(Node node) {
		// TODO Auto-generated method stub
		if(node.left==null&&node.rigth==null)
			return true;
		return false;
	}

}
