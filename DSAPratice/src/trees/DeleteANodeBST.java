package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DeleteANodeBST {
	public static void method() {
		int[] arr= {5,3,6,2,4,-1,7};
		Node root=formTree(arr);
		
		root=deleteNode(root, 3);
		List<Integer>res=new ArrayList<>();
		levelByLevelTraversal(root, res);
		for(int i:res)
		System.out.print(i+" ");
		
		
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
	  public static  Node deleteNode(Node root, int key) {
	        if(root==null)
	        return null;
	        if(root.data==key){
	            if(root.left==null)
	            return root.rigth;
	            else if(root.rigth==null)
	            return root.left;
	            else {
	                int val=inorderSuccessor(root.rigth);
	                root.data=val;
	             root.rigth=    deleteNode(root.rigth,val);
	             return root;
	                
	            }
	        }
	        if(key<root.data)
	     root.left=   deleteNode(root.left,key);
	        else
	      root.rigth=  deleteNode(root.rigth,key);
	        return root;
	        
	    }
	    public static int inorderSuccessor(Node node){
	        if(node.left==null)
	        return node.data;
	        return inorderSuccessor(node.left);
	    }

}
