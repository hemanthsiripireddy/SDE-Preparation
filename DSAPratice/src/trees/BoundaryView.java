package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BoundaryView {
	static Set<Integer>set=new HashSet();
	public static void method() {
		//List<Integer> res = new ArrayList<>();
		int[] arr= {1,2,3,4,5,-1,-1,-1,-1,6};
		 
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
		if(set.add(root.data))
		res.add(root.data);
		Map<Integer,Integer>map=new HashMap<>();
		left(root,map,1);
		for(int i=1;i<=map.size();i++) {
			res.add(map.get(i));
		}
		leaf(root.left,res);
		leaf(root.rigth,res);
		map=new HashMap<>();
		right(root,map,1);
		for(int i=map.size();i>=1;i--) {
			res.add(map.get(i));
		}
		return res;
		
		
	}
	private static void right(Node node,  Map<Integer,Integer> map,int level) {
		// TODO Auto-generated method stub
		if(node==null)
			return ;
		if(set.add(node.data))
			map.putIfAbsent(level, node.data);
		
			right(node.rigth,map,level+1);
		
			right(node.left,map,level+1);
			
		
		
		
	}
	private static void leaf(Node node,  List<Integer> res) {
		// TODO Auto-generated method stub
		if(node==null)
			return;
		if(set.add(node.data))
			res.add(node.data);
		leaf(node.left,res);
		leaf(node.rigth,res);
		
	}
	private static void left(Node  node, Map<Integer,Integer> map,int level) {
		// TODO Auto-generated method stub
		if(node==null)
			return ;
		if(set.add(node.data))
			map.putIfAbsent(level,node.data);
		
		left(node.left,map,level+1);
		
			left(node.rigth,map,level+1);
		
		
	}
	private static boolean isLeaf(Node node) {
		// TODO Auto-generated method stub
		if(node.left==null&&node.rigth==null)
			return true;
		return false;
	}

}
