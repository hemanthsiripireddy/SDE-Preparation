package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
	int val;
	Node left;
	Node right;
	public Node(int val) {
		this.val=val;
	}
}

public class ZigZagTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
		
		List<Integer>res=new ArrayList<>();
		Queue<Node>queue=new LinkedList<>();
		queue.add(root);
		
		traverse(queue,root,res);
		for(int i=0;i<res.size();i++) {
			System.out.print(res.get(i)+" ");
		}

	}

	private static void traverse(Queue<Node> queue, Node root, List<Integer> res) {
		// TODO Auto-generated method stub
		int level=0;
		while(queue.size()!=0) {
			
			
			
			
				int size=queue.size();
				List<Integer>list=new ArrayList<>();
			
			while(size!=0) {
				Node curNode=queue.poll();
				list.add(curNode.val);
				if(curNode.left!=null) {
					queue.add(curNode.left);
				}
				if(curNode.right!=null) {
					queue.add(curNode.right);
				}
				size--;
			}
			addValues(list,res,level);
			
			level++;
			
			
			
			
		}
		
	}

	private static void addValues(List<Integer>list, List<Integer> res, int level) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		if(level%2==0) {
			for(int i=0;i<list.size();i++) {
				res.add(list.get(i));
			}
		}else {
			for(int i=list.size()-1;i>=0;i--) {
				res.add(list.get(i));
			}
			
		}
		
	}

}
