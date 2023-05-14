package trees;

import java.util.ArrayList;
import java.util.List;

public class SearchInBST {
	public static void method() {
		int[] arr= {1,0,-1,2,3,4,5};
		Node root=null;
		for(int i=0;i<arr.length;i++)
		root=insert( root,arr[i]);
		int key=011;
		Node res=search(root, key);
		if(res!=null)
			System.out.println("key is present");
		else
			System.out.println("key is not present");
				
				
		
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
	public static Node search(Node node, int key) {
		if(node==null)return null;
		if(node.data==key)return node;
		if(key<node.data)
			return search(node.left,key);
		return search(node.rigth,key);
			


	}

}
