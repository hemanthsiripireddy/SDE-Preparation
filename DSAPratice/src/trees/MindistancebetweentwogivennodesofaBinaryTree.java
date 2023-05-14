package trees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class MindistancebetweentwogivennodesofaBinaryTree {
	public static void method() {
		int[] arr= {732, 80, 737, 38, 378, 736, 743, 20, 70};
		
		Node root=formTree(arr);
				int res=findDist(root, 80,80);
				System.out.println(res);
	}
	static  int findDist(Node root, int a, int b) {
	        // Your code here
	        Stack<Integer>s1=new Stack<Integer>();
	        List<Integer>res =Arrays.asList(1,2,3,4);
	        Stack<Integer>s2=new Stack<Integer>();
	        findPath(root,a,s1);
	        findPath(root,b,s2);
	        int c=root.data;
	        int p1=s1.peek();
	        int p2=s2.peek();
	        int s11=s1.size();
	        int s22=s2.size();
	        while(s1.size()!=0&&s2.size()!=0&&(int)s1.peek()==(int)s2.peek()){
	            c=s1.pop();
	            s2.pop();
	        }
	        return findHeight(root,c,a,b);
	        
	        
	    }
	    public static int findPath(Node root,int a,Stack<Integer> stack){
	        if(root==null)
	        return -10;
	        if(root.data==a){
	            stack.push(a);
	             return 0;
	        }
	       
	        int left=findPath(root.left,a,stack);
	        int right=findPath(root.rigth,a,stack);
	        if(left==0||right==0){
	            stack.push(root.data);
	            return 0;
	        }
	        return -10;
	        
	    }
	    public static  int findHeight(Node root,int c,int a,int b){
	        if(root==null)
	        return -1;
	        if(root.data==c){
	            int h1=(root.data==a)?0:find(root.left,a)+1;
	            int h2=(root.data==b)?0:find(root.rigth,b)+1;
	            if(h1<=-1||h2<=-1){
	                h1=(root.data==b)?0:find(root.left,b)+1;
	                h2=(root.data==a)?0:find(root.rigth,a)+1;
	                return h1+h2;
	                
	            }else
	            return h1+h2;
	        }
	        int left=findHeight(root.left,c,a,b);
	        int right=findHeight(root.rigth,c,a,b);
	        if(left>=0)
	        return left;
	        return right;
	    }
	    public static int find(Node root,int a){
	        if(root==null)
	        return -10;
	        if(root.data==a)
	        return 0;
	        int left=find(root.left,a);
	        int right=find(root.rigth,a);
	        if(left>=0)
	        return left+1;
	        if(right>=0)
	        return right+1;
	        return -10;
	       // return Math.max(find(root.left),find(root.right))+1;
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
